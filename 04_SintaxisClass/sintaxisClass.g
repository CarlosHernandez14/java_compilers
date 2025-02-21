grammar sintaxisClass;

@header{
    import java.util.HashMap;
}

@members{
    // Variables globales

    // Hashmap of TSGlobal symbols
    HashMap<String, Integer> TSGlobal = new HashMap<String, Integer>();
    // TSLocal symbols
    HashMap<String, Integer> TSLocal = new HashMap<String, Integer>();

    // Method to insert on the symbols hasmap and verify if it is already declared
    public void pushTSGlobal(String id, SymbolType type) {
        // Verify if the symbol is already declared
        if (TSGlobal.containsKey(id)) {
            System.out.println("Error: La variable global "+id+" ya ha sido declarada");
        } else {
            // Insert the symbol on the hashmap
            TSGlobal.put(id, type.ordinal());
        }
    }

    // Method to insert on the symbols hasmap and verify if it is already declared
    public void pushTSLocal(String id, SymbolType type) {
        // Verify if the symbol is already declared
        if (TSLocal.containsKey(id)) {
            System.out.println("Error: La variable local "+id+" ya ha sido declarada");
        } else {
            // Insert the symbol on the hashmap
            TSLocal.put(id, type.ordinal());
        }
    }

    // Enum to map the symbols to a number to insert on the hashmap
    public enum SymbolType {
        INT, DOUBLE, CHAR, STRING, BOOLEAN, CLASS, METHOD
    }
}       

program  : class_+  ;

class_ : modificAcceso? 'class' ID { 
            // Pushemos las variables globales al hashmap
            pushTSGlobal($ID.text, SymbolType.CLASS);
        }
        '{' 
            member*
        '}' ;

// Reglas sintácticas
member  :  property | metodo ;
property: modificAcceso? tipo ID ('=' expresion)? (',' ID ('=' expresion)?)* SEMICOLON { 
                // Pushemos las variables globales al hashmap
                // Posible error cause the modifAcces are typen on LowerCase
                pushTSGlobal($ID.text, SymbolType.valueOf(($tipo.text).toUpperCase()));
            } ;

metodo  : modificAcceso? tipo ID { 
                    // Push the method name to global symbols
                    pushTSGlobal($ID.text, SymbolType.METHOD);
                } '(' declaracion_args? ')'
               '{'
                     (instruccion | condicional)*
               '}' { 
                    // Clear the local symbols
                    TSLocal.clear();
               } ; 

condicional: IF '(' expresion ')' '{' instruccion* '}' (ELSE '{' instruccion* '}')? ;                

modificAcceso: PUBLIC | PRIVATE | PROTECTED ;
tipo         : INT    | DOUBLE  | CHAR | STRING | BOOLEAN ;


instruccion: asignacion  | declaracion ;
asignacion: ID '=' expresion SEMICOLON ;
declaracion: tipo 
            id1=ID { 
                // Pushemos las variables locales al hashmap
                pushTSLocal($id1.text, SymbolType.valueOf(($tipo.text).toUpperCase()));
            } ('=' expresion)? 
            (
                ',' 
                id2=ID { 
                    // Pushemos las variables locales al hashmap
                    pushTSLocal($id2.text, SymbolType.valueOf(($tipo.text).toUpperCase()));
                } ('=' expresion)?
            )* SEMICOLON ;
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

IF: 'if' ;
ELSE: 'else' ;

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
    private int id;
    private int xGlobal;-
    public int idMetodo(){
            int x=5, b ,d=5;
            x=(b*x)*d+345.4;
    }

    public int idMetodo2(){
            int x=5, b ,d=5;
            x=(b*x)*d+345.4;
            if (x*x){
                x=5;
            }else{
                x=6;
            }
    }
}
class TestClass{
}

   public int idMetodo2(){
          x=(b*x)/d+345.4;
   }
*/