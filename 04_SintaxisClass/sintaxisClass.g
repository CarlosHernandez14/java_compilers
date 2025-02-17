grammar sintaxisClass;

@members{}       

program  : class_+  ;

class_ : modificAcceso? 'class' ID 
        '{' 
            attribute*
            metodo*
        '}' ;

// Reglas sintácticas
attribute : declaracion ;
metodo  : modificAcceso tipo ID '(' declaracion_args? ')'
               '{'
                     instruccion* 
               '}' ;                 

modificAcceso: PUBLIC | PRIVATE | PROTECTED ;
tipo         : INT    | DOUBLE  | CHAR | STRING | BOOLEAN ;


instruccion: asignacion  | declaracion ;
asignacion: ID '=' expresion SEMICOLON ;
declaracion: tipo ID ('=' expresion)? (',' ID ('=' expresion)?)* SEMICOLON ;
declaracion_args: tipo ID (',' tipo ID)* ;

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
CFLOAT   : CINT DOT CINT;
CINT    : ('0'..'9')+ ;

ID :  ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
WS :  (' ' | '\n' | '\t' | '\r' )+  -> skip            ;

// Un lenguaje que admita métodos y los métodos puras asignaciones con expresiones 
//        aritméticas
/*
class TestClass{
    int xGlobal; 
    public int idMetodo(){
            int x=5, b ,d=5;
            x=(b*x)*d+345.4;
    }
}

   public int idMetodo2(){
          x=(b*x)/d+345.4;
   }
*/