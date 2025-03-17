grammar gramaticaAst;

options {
  output=AST;              // Indica a ANTLR que genere un AST
  ASTLabelType=CommonTree; // Tipo de árbol (usualmente para Java)
}

// Regla principal que procesa una secuencia de sentencias
prog 
  : ( stat { System.out.println($stat.tree.toStringTree()); } )+ 
  ;

// Reglas para las sentencias: pueden ser expresiones, asignaciones o líneas en blanco
stat 
  : expr NEWLINE               -> expr                     // Solo una expresión seguida de salto de línea
  | ID '=' expr NEWLINE        -> ^('=' ID expr)           // Asignación: se construye un árbol con '=' como raíz
  | NEWLINE                    ->                          // Línea vacía (se ignora)
  ;

// Regla para las expresiones aritméticas
expr 
  : multExpr (('+'^ | '-'^) multExpr)* 
  ;

// Regla para la multiplicación (mantiene la precedencia de operadores)
multExpr 
  : atom ('*'^ atom)* 
  ;

// Regla para los átomos: enteros, identificadores o expresiones entre paréntesis.
// Los paréntesis se eliminan del AST gracias al sufijo '!'
atom 
  : INT 
  | ID 
  | '('! expr ')'! 
  ;

// Reglas léxicas
INT     : ('0'..'9')+ ;
ID      : ('a'..'z' | 'A'..'Z')+ ;
NEWLINE : ('\r'? '\n')+ ;
WS      : (' ' | '\t')+ { skip(); } ;
