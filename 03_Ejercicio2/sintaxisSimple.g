grammar sintaxisSimple;

@members{}       

program  : metodo+  ;

// Reglas sintácticas
metodo  : modificAcceso tipo ID '('  ')'
               '{'
                     instruccion* 
               '}' ;                 

modificAcceso: PUBLIC | PRIVATE | PROTECTED ;
tipo         : INT    | DOUBLE  | CHAR | STRING | BOOLEAN ;


instruccion:  ID '=' expresion SEMICOLON ;
expresion  :  multExp (( '+' | '-' ) multExp)* ;
multExp    :  atomExp ('*' atomExp)* ;
atomExp    :  CINT | CFLOAT | ID | '(' expresion ')' ;


// Reglas léxicas

// Tipos de datos
SEMICOLON: ';' ;
INT      : 'int'      ;
DOUBLE   : 'double'   ;
CHAR     : 'char'     ;
STRING   : 'String'   ;
BOOLEAN  : 'boolean'  ;
PUBLIC   : 'public'   ;
PRIVATE  : 'private'  ;
PROTECTED: 'protected';

// Reglas lexicas para las expresiones
DOT      : '.' ;
CFLOAT   : CINT DOT CINT ;
CINT    : ('0'..'9')+ ;

ID :  ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
WS :  (' ' | '\n' | '\t' | '\r' )+  -> skip            ;

// Un lenguaje que admita métodos y los métodos puras asignaciones con expresiones 
//        aritméticas
/*
   public int idMetodo(){
          x=(b*x)*d+345.4 
   }

   public int idMetodo2(){
          x=(b*x)/d+345.4;
   }
*/