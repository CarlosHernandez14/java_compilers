grammar sintaxisSimple;

@members{}       

program  : metodo+  ;

// Reglas sintácticas
metodo  : modificAcceso tipo ID '('  ')'
               '{'  /*instrucciones*/  '}' ;                 

modificAcceso: PUBLIC | PRIVATE | PROTECTED ;
tipo         : INT    | DOUBLE  | CHAR | STRING | BOOLEAN ;
instrucciones:  ID '=' expresion ';' ;


// Reglas léxicas
// Tipos de datos
INT      : 'int'      ;
DOUBLE   : 'double'   ;
CHAR     : 'char'     ;
STRING   : 'String'   ;
BOOLEAN  : 'boolean'  ;
PUBLIC   : 'public'   ;
PRIVATE  : 'private'  ;
PROTECTED: 'protected';

// Reglas lexicas para las instrucciones dentor de los métodos
expresion :  ID '=' expresion '+' expresion
          |  ID '=' expresion '-' expresion
          |  ID '=' expresion '*' expresion
          |  ID '=' expresion '/' expresion
          |  ID '=' expresion '%' expresion
          |  ID '=' expresion '^' expresion
          |  ID '=' expresion '&' expresion
          |  ID '=' expresion '|' expresion
          |  ID '=' expresion '<<' expresion
          |  ID '=' expresion '>>' expresion
          |  ID '=' expresion '>>>' expresion
          |  ID '=' expresion '<' expresion
          |  ID '=' expresion '>' expresion
          |  ID '=' expresion '<=' expresion
          |  ID '=' expresion '>=' expresion
          |  ID '=' expresion '==' expresion
          |  ID '=' expresion '!=' expresion
          |  ID '=' expresion '&&' expresion
          |  ID '=' expresion '||' expresion
          |  ID '=' expresion '?' expresion ':' expresion
          |  ID '=' expresion '++'
          |  ID '=' expresion '--'
          |  ID '=' expresion
          |  ID
          |  INT
          |  DOUBLE
          |  CHAR
          |  STRING
          |  BOOLEAN
          |  '(' expresion ')'
          |  '-' expresion
          |  '!' expresion
          |  '~' expresion
          |  ID '(' ')'
          |  ID '(' expresion ')'
          |  ID '(' expresion ',' expresion ')'
          |  ID '[' expresion ']'
          |  ID '[' expresion ']' '=' expresion
          |  ID '.' ID
          |  ID '.' ID '(' ')'
          |  ID '.' ID '(' expresion ')'
          |  ID '.' ID '(' expresion ',' expresion ')'
          |  ID '.' ID '(' expresion ',' expresion ',' expresion ')'
          |  ID '.' ID '(' expresion ',' expresion ',' expresion ',' expresion ')'
          |  ID '.' ID '(' expresion ',' expresion ',' expresion ',' expresion ',' expresion ')'
          |  ID '.' ID '(' expresion ',' expresion ',' expresion ',' expresion ',' expresion ',' expresion ')' ;



ID :  ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
WS :  (' ' | '\n' | '\t' | '\r' )+  -> skip            ;

// Un lenguaje que admita métodos y los métodos puras asignaciones con expresiones 
//        aritméticas
/*
   public int idMetodo(){
          x=(b*x)/d+345.4;   
   }

   public int idMetodo2(){
          x=(b*x)/d+345.4;   
   }
*/