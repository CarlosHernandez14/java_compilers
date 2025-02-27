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
        INT, DOUBLE, CHAR, STRING, BOOLEAN, CLASS, METHOD, ERROR_TYPE;

        private static final SymbolType[] values = values();

        public static SymbolType nameOf(int ordinal) {
            return values[ordinal];
        }
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
                     (instruccion | control_structure)* 
               '}' { 
                    // Clear the local symbols
                    TSLocal.clear();
               } ;                 

modificAcceso: PUBLIC | PRIVATE | PROTECTED ;
tipo         : INT    | DOUBLE  | CHAR | STRING | BOOLEAN ;

// Reglas sintácticas para estructuras de control
control_structure: conditional ;
conditional: IF '(' expresion ')' '{' 
                instruccion* 
            '}' 
            (ELSE '{' 
                instruccion* 
            '}')? ;

instruccion: asignacion  | declaracion ;
asignacion: ID '=' expresion { 
                    //System.out.println("Expression: "+$expresion.text + " type: "+$expresion.returnType);

                    // Verificar si el tipo de la expression coincide con el tipo de la variable para asignarla
                    if (TSLocal.containsKey($ID.text)) {
                        if (TSLocal.get($ID.text) != $expresion.returnType.ordinal()) {
                            System.out.println("Error: No se puede asignar un tipo " + $expresion.returnType + " a la variable (" + $ID.text + ") de tipo "+SymbolType.nameOf(TSLocal.get($ID.text)));
                        }
                    } else if (TSGlobal.containsKey($ID.text)) {
                        if (TSGlobal.get($ID.text) != $expresion.returnType.ordinal()) {
                            System.out.println("Error: No se puede asignar un tipo" + $expresion.returnType + " a la variable (" + $ID.text + ") de tipo " + SymbolType.nameOf(TSGlobal.get($ID.text)));
                        }
                    } else {
                       System.out.println("Error: La variable " + $ID.text + " no ha sido declarada");
                    }
                } SEMICOLON ;
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

expresion returns [SymbolType returnType] :  m1=multExp { 
                                        $returnType=$m1.returnType;
                                        //System.out.println("Expression: "+$m1.text + " type: "+$m1.returnType);
                                    }
                                    (
                                        ( '+' | '-' ) 
                                        m2=multExp {
                                            //System.out.println("Expression: "+$m2.text + " type: "+$m2.returnType);
                                            if ($m2.returnType != $m1.returnType) {
                                                $returnType = SymbolType.ERROR_TYPE;
                                                System.out.println("Error: Tipos de datos incompatibles");
                                            }
                                        } 
                                    )* ;
multExp   returns [SymbolType returnType] :  a1=atomExp { 
                                        $returnType=$a1.returnType;
                                    }    
                                    (('*' | '/') a2=atomExp { 
                                        if ($a2.returnType != $a1.returnType) {
                                            $returnType = SymbolType.ERROR_TYPE;
                                            System.out.println("Error: Tipos de datos incompatibles");
                                        }
                                     }
                                    )* ;
atomExp   returns [SymbolType returnType] :  CINT { $returnType=SymbolType.INT; } 
                            | CDOUBLE { $returnType=SymbolType.DOUBLE; }
                            | ID { 
                                // Verify if the symbol is declared
                                if (!TSLocal.containsKey($ID.text) && !TSGlobal.containsKey($ID.text)) {
                                    System.out.println("Error: La variable "+$ID.text+" no ha sido declarada");
                                }

                                // Verify if the symbol is declared on the local symbols
                                if (TSLocal.containsKey($ID.text)) {
                                    $returnType = SymbolType.nameOf(TSLocal.get($ID.text));
                                } else {
                                    $returnType = SymbolType.nameOf(TSGlobal.get($ID.text));
                                }
                             } 
                            | '(' expresion { $returnType=$expresion.returnType; } ')' ;


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

//Reglas lexicas para estructuras de control
IF       : 'if'       ;
ELSE     : 'else'     ;

// Reglas lexicas para las expresiones
DOT      : '.' ;
CDOUBLE   : ('0'..'9')+ '.' ('0'..'9')*;
CINT    : ('0'..'9')+ ;

ID :  ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
WS :  (' ' | '\n' | '\t' | '\r' )+  -> skip            ;

// Un lenguaje que admita métodos y los métodos puras asignaciones con expresiones 
//        aritméticas
/*
class TestClass{
    private int id;
    private int xGlobal;
    public int idMetodo(){
        int x=5, b ,d=5;
        x=(b*x)*d+345.4;

        b = 10.2*2.3;

        if (5*5) {
            x = 5;
        } else {
            x = 10;
        }
    
    }
}
class TestClass{
    public int metodo1(){
        int x, y;
        x = 5*3;
        y = 10.3*2.3;
        z = 10;

        if (5*5) {
            x = 5;
        } else {
            x = 10;
        }
    }
}

   public int idMetodo2(){
          x=(b*x)/d+345.4;
   }
*/