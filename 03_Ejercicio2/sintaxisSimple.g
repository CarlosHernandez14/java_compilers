grammar sintaxisSimple;

@members{}       

program  : metodo+  ;

metodo  : modificAcceso tipo ID '('  ')'
               '{'  /*instrucciones*/  '}' ;                 

modificAcceso: PUBLIC | PRIVATE | PROTECTED ;
tipo         : INT    | DOUBLE   ;


// Reglas léxicas
INT      : 'int'      ;
DOUBLE   : 'double'   ;
PUBLIC   : 'public'   ;
PRIVATE  : 'private'  ;
PROTECTED: 'protected';


ID :  ('a'..'z'|'A'..'Z')+                             ;
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