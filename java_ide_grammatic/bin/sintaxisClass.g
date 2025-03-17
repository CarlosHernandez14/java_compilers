grammar sintaxisClass;

@header{
    import java.util.HashMap;
    import org.antlr.v4.runtime.Token; // Para acceder a getLine(), getCharPositionInLine()
    
}

@members{

    // Variables globales

    // Custom error listener  que vamos a inyectar desde App.java por medio del setter
    public CustomErrorListener errorListener;

    // Por comodidad, un método setter
    public void setCustomErrorListener(CustomErrorListener listener) {
        this.errorListener = listener;
    }


    // Hashmap of TSGlobal symbols
    HashMap<String, Integer> TSGlobal = new HashMap<String, Integer>();
    // TSLocal symbols
    HashMap<String, Integer> TSLocal = new HashMap<String, Integer>();

    // Method to insert on the symbols hasmap and verify if it is already declared
    public void pushTSGlobal(String id, SymbolType type, Token token) {
        // Verify if the symbol is already declared
        if (TSGlobal.containsKey(id)) {
            // System.out.println("Error: La variable global "+id+" ya ha sido declarada");
            errorListener.addSemanticError(
                "La variable global '" + id + "' ya ha sido declarada",
                token.getLine(),
                token.getCharPositionInLine()
            );
        } else {
            // Insert the symbol on the hashmap
            TSGlobal.put(id, type.ordinal());
        }
    }

    // Method to insert on the symbols hasmap and verify if it is already declared
    public void pushTSLocal(String id, SymbolType type, Token token) {
        // Verify if the symbol is already declared
        if (TSLocal.containsKey(id)) {
            // System.out.println("Error: La variable local "+id+" ya ha sido declarada");
            errorListener.addSemanticError(
                "La variable local '" + id + "' ya ha sido declarada",
                token.getLine(),
                token.getCharPositionInLine()
            );
        } else {
            // Insert the symbol on the hashmap
            TSLocal.put(id, type.ordinal());
        }
    }

    // Enum to map the symbols to a number to insert on the hashmap
    public enum SymbolType {
        INT, DOUBLE, CHAR, STRING, BOOLEAN, CLASS, METHOD, ERROR_TYPE, VOID;

        private static final SymbolType[] values = values();

        public static SymbolType nameOf(int ordinal) {
            return values[ordinal];
        }
    }
}       

program  : class_+  ;

class_ : modificAcceso? 'class' ID { 
            // Pushemos las variables globales al hashmap
            pushTSGlobal($ID.text, SymbolType.CLASS, $ID); // Agrergamos el token para obtener la linea y columna
        }
        '{' 
            member*
        '}' { 
            // Limpiar tabla global de simbolos excepto los tipo class
            TSGlobal.entrySet().removeIf(entry -> entry.getValue() != SymbolType.CLASS.ordinal());
         } ;

// Reglas sintácticas
member  :  property | metodo ;
property: modificAcceso? tipo 
                        id1=ID { 
                            // Pushemos las variables locales al hashmap
                            pushTSGlobal($id1.text, SymbolType.valueOf(($tipo.text).toUpperCase()), $id1);
                        } ('=' 
                            expresion { 
                                //System.out.println("Expression: "+$expresion.text + " type: "+$expresion.returnType);
                                if ($expresion.text.length() <= 0) {
                                    errorListener.addSemanticError(
                                        "Error: Falta asignar expression" +
                                        " a la variable (" + $id1.text + ") de tipo " +
                                        SymbolType.nameOf(TSLocal.get($id1.text)),
                                        $id1.getLine(),
                                        $id1.getCharPositionInLine()
                                    );
                                    throw new RecognitionException("Errror: Falta asignar expression a la variable" + $id1.text, null, _input, _localctx);
                                }

                                // Verificar si el tipo de la expression coincide con el tipo de la variable para asignarla
                                if (TSGlobal.containsKey($id1.text)) {
                                    if (TSGlobal.get($id1.text) != $expresion.returnType.ordinal()) {
                                        // System.out.println("Error: No se puede asignar un tipo" + $expresion.returnType + " a la variable (" + $id1.text + ") de tipo " + SymbolType.nameOf(TSGlobal.get($id1.text)));
                                        // Agregamos el error de semantica al errorListener
                                        errorListener.addSemanticError(
                                            "No se puede asignar un tipo " + $expresion.returnType +
                                            " a la variable (" + $id1.text + ") de tipo " +
                                            SymbolType.nameOf(TSGlobal.get($id1.text)),
                                            $id1.getLine(),
                                            $id1.getCharPositionInLine()
                                        );
                                    }
                                } else {
                                    // System.out.println("Error: La variable " + $id1.text + " no ha sido declarada");
                                    // Agregamos el error de semantica al errorListener
                                    errorListener.addSemanticError(
                                        "La variable " + $id1.text + " no ha sido declarada",
                                        $id1.getLine(),
                                        $id1.getCharPositionInLine()
                                    );
                                }
                            } 
                        )? 
                        (
                            ',' 
                            id2=ID { 
                                // Pushemos las variables locales al hashmap
                                pushTSGlobal($id2.text, SymbolType.valueOf(($tipo.text).toUpperCase()), $id2);                                
                            } ('=' 
                                expresion { 
                                    //System.out.println("Expression: "+$expresion.text + " type: "+$expresion.returnType);
                                    if ($expresion.text.length() <= 0) {
                                        errorListener.addSemanticError(
                                            "Error: Falta asignar expression" +
                                            " a la variable (" + $id2.text + ") de tipo " +
                                            SymbolType.nameOf(TSLocal.get($id2.text)),
                                            $id2.getLine(),
                                            $id2.getCharPositionInLine()
                                        );
                                        throw new RecognitionException("Errror: Falta asignar expression a la variable" + $id2.text, null, _input, _localctx);
                                    }

                                    // Verificar si el tipo de la expression coincide con el tipo de la variable para asignarla
                                    if (TSGlobal.containsKey($id2.text)) {
                                        if (TSGlobal.get($id2.text) != $expresion.returnType.ordinal()) {
                                            // System.out.println("Error: No se puede asignar un tipo" + $expresion.returnType + " a la variable (" + $id2.text + ") de tipo " + SymbolType.nameOf(TSGlobal.get($id2.text)));
                                            // Agregamos el error de semantica al errorListener
                                            errorListener.addSemanticError(
                                                "No se puede asignar un tipo " + $expresion.returnType +
                                                " a la variable (" + $id2.text + ") de tipo " +
                                                SymbolType.nameOf(TSGlobal.get($id2.text)),
                                                $id2.getLine(),
                                                $id2.getCharPositionInLine()
                                            );
                                        }
                                    } else {
                                        // System.out.println("Error: La variable " + $id2.text + " no ha sido declarada");
                                        // Agregamos el error de semantica al errorListener
                                        errorListener.addSemanticError(
                                            "La variable " + $id2.text + " no ha sido declarada",
                                            $id2.getLine(),
                                            $id2.getCharPositionInLine()
                                        );
                                    }
                                }
                            )?
                        )* SEMICOLON;

metodo  : modificAcceso? returnTypeMethods ID { 
                    // Push the method name to global symbols
                    // Agrergamos el token para obtener la linea y columna
                    pushTSGlobal($ID.text, SymbolType.METHOD, $ID);
                } '(' declaracion_args? ')'
               '{'
                    (instruccion | control_structure)*
               '}' { 
                    // Clear the local symbols
                    TSLocal.clear();
               } ;                 

modificAcceso: PUBLIC | PRIVATE | PROTECTED ;
tipo         : INT    | DOUBLE  | CHAR | STRING | BOOLEAN ;
returnTypeMethods : tipo | VOID ;
returnExpMethods  : RETURN expresion SEMICOLON ;


// Reglas sintácticas para estructuras de control
control_structure: conditional ;
conditional: IF '(' comparacion ')' '{' 
                (instruccion | control_structure)* 
            '}' 
            (ELSE '{' 
                (instruccion | control_structure)*
            '}')? ;

instruccion: asignacion  | declaracion ;
asignacion: ID '=' expresion { 
                    //System.out.println("Expression: "+$expresion.text + " type: "+$expresion.returnType);

                    if ($expresion.text.length() <= 0) {
                        SymbolType type = TSLocal.containsKey($ID.text) ? SymbolType.nameOf(TSLocal.get($ID.text)) : SymbolType.nameOf(TSGlobal.get($ID.text));
                        errorListener.addSemanticError(
                            "Error: Falta asignar expression" +
                            " a la variable (" + $ID.text + ") de tipo " + type,
                            $ID.getLine(),
                            $ID.getCharPositionInLine()
                        );
                        throw new RecognitionException("Errror: Falta asignar expression a la variable" + $ID.text, null, _input, _localctx);
                    }

                    // Verificar si el tipo de la expression coincide con el tipo de la variable para asignarla
                    if (TSLocal.containsKey($ID.text)) {
                        if (TSLocal.get($ID.text) != $expresion.returnType.ordinal()) {
                            // System.out.println("Error: No se puede asignar un tipo " + $expresion.returnType + " a la variable (" + $ID.text + ") de tipo "+SymbolType.nameOf(TSLocal.get($ID.text)));
                            // Agregamos el error de semantica al errorListener en lugar de imprimirlo
                            errorListener.addSemanticError(
                                "No se puede asignar un tipo " + $expresion.returnType + 
                                " a la variable (" + $ID.text + ") de tipo " +
                                SymbolType.nameOf(TSLocal.get($ID.text)),
                                $ID.getLine(),
                                $ID.getCharPositionInLine()
                            );
                        }
                    } else if (TSGlobal.containsKey($ID.text)) {
                        if (TSGlobal.get($ID.text) != $expresion.returnType.ordinal()) {
                            // System.out.println("Error: No se puede asignar un tipo" + $expresion.returnType + " a la variable (" + $ID.text + ") de tipo " + SymbolType.nameOf(TSGlobal.get($ID.text)));
                            // Agregamos el error de semantica al errorListener
                            errorListener.addSemanticError(
                                "No se puede asignar un tipo " + $expresion.returnType +
                                " a la variable (" + $ID.text + ") de tipo " +
                                SymbolType.nameOf(TSGlobal.get($ID.text)),
                                $ID.getLine(),
                                $ID.getCharPositionInLine()
                            );
                        }
                    } else {
                       // System.out.println("Error: La variable " + $ID.text + " no ha sido declarada");
                       // Agregamos el error de semantica al errorListener
                       errorListener.addSemanticError(
                            "La variable " + $ID.text + " no ha sido declarada",
                            $ID.getLine(),
                            $ID.getCharPositionInLine()
                        );
                    }
                } SEMICOLON ;
declaracion: tipo 
            id1=ID { 
                // Pushemos las variables locales al hashmap
                // Agregamos el token para obtener la linea y columna
                pushTSLocal($id1.text, SymbolType.valueOf(($tipo.text).toUpperCase()), $id1);
            } ('=' 
                expr1=expresion { 
                    //  Verificar si el tipo de la expression coincide con el tipo de la variable para asignarla
                    if ($expr1.returnType != SymbolType.nameOf(TSLocal.get($id1.text))) {
                        // System.out.println("Error: Tipos de datos incompatibles");
                        // Agregamos el error de semantica al errorListener
                        errorListener.addSemanticError(
                            "Tipos de datos incompatibles, no puedes asignar el tipo (" + $expr1.returnType + ") a la variable " + $id1.text + " de tipo " + SymbolType.nameOf(TSLocal.get($id1.text)),
                            $expr1.start.getLine(),            // El primer token de la subregla
                            $expr1.start.getCharPositionInLine()
                        );
                    }
                }
            )? 
            (
                ',' 
                id2=ID { 
                    // Pushemos las variables locales al hashmap
                    // Agregamos el token para obtener la linea y columna
                    pushTSLocal($id2.text, SymbolType.valueOf(($tipo.text).toUpperCase()), $id2);
                } ('=' 
                    expr2=expresion { 
                        //  Verificar si el tipo de la expression coincide con el tipo de la variable para asignarla
                        if ($expr2.returnType != SymbolType.nameOf(TSLocal.get($id2.text))) {
                            // System.out.println("Error: Tipos de datos incompatibles");
                            // Agregamos el error de semantica al errorListener
                            errorListener.addSemanticError(
                                "Tipos de datos incompatibles, no puedes asignar el tipo (" + $expr2.returnType + ") a la variable " + $id2.text + " de tipo " + SymbolType.nameOf(TSLocal.get($id2.text)),
                                $expr2.start.getLine(),            // El primer token de la subregla
                                $expr2.start.getCharPositionInLine()
                            );
                        }
                    }
                )?
            )* SEMICOLON ;
declaracion_args: tipo idArg1=ID { 
                        // Pusheamos los parametros del metodo a variables locales
                        pushTSLocal($idArg1.text, SymbolType.valueOf(($tipo.text).toUpperCase()), $idArg1);
                    } (
                        ',' tipo idArg2=ID { 
                            // Pusheamos el segunto parametro si es que lo hay a TSLocal
                            pushTSLocal($idArg2.text, SymbolType.valueOf(($tipo.text).toUpperCase()), $idArg2);
                        }
                    )* ;

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
                                                // System.out.println("Error: Tipos de datos incompatibles");
                                                // Agregamos el error de semantica al errorListener
                                                errorListener.addSemanticError(
                                                    "Tipos de datos incompatibles",
                                                    $m2.start.getLine(),            // El primer token de la subregla
                                                    $m2.start.getCharPositionInLine()
                                                );
                                            }
                                        } 
                                    )* ;
multExp   returns [SymbolType returnType] :  a1=atomExp { 
                                        $returnType=$a1.returnType;
                                    }    
                                    (('*' | '/') a2=atomExp { 
                                        if ($a2.returnType != $a1.returnType) {
                                            $returnType = SymbolType.ERROR_TYPE;
                                            // System.out.println("Error: Tipos de datos incompatibles");
                                            // Agregamos el error de semantica al errorListener
                                            errorListener.addSemanticError(
                                                "Tipos de datos incompatibles",
                                                $a2.start.getLine(),
                                                $a2.start.getCharPositionInLine()
                                            );
                                        }
                                     }
                                    )* ;
atomExp   returns [SymbolType returnType] :  CINT { $returnType=SymbolType.INT; } 
                            | CDOUBLE { $returnType=SymbolType.DOUBLE; }
                            | ID { 
                                // Verify if the symbol is declared
                                if (!TSLocal.containsKey($ID.text) && !TSGlobal.containsKey($ID.text)) {
                                    // System.out.println("Error: La variable "+$ID.text+" no ha sido declarada");
                                    errorListener.addSemanticError(
                                        "La variable '" + $ID.text + "' no ha sido declarada",
                                        $ID.getLine(),
                                        $ID.getCharPositionInLine()
                                    );
                                    // Marcamos el tipo de la variable como error
                                    $returnType = SymbolType.ERROR_TYPE;

                                    break;
                                }

                                // Verify if the symbol is declared on the local symbols
                                if (TSLocal.containsKey($ID.text)) {
                                    $returnType = SymbolType.nameOf(TSLocal.get($ID.text));
                                } else {
                                    $returnType = SymbolType.nameOf(TSGlobal.get($ID.text));
                                }
                             } 
                            | '(' expresion { $returnType=$expresion.returnType; } ')' ;

// Comparaciones
comparacion: expresion (EQ | NEQ | GT | LT | GE | LE) expresion ;

// Reglas léxicas

// Tipos de datos
SEMICOLON: ';' ;
INT      : 'int'      ;
DOUBLE   : 'double'   ;
CHAR     : 'char'     ;
STRING   : 'String'   ;
BOOLEAN  : 'boolean'  ;
// Tipo especifico para los metodos
VOID     : 'void'     ;
RETURN   : 'return'   ;

PUBLIC   : 'public'   ;
PRIVATE  : 'private'  ;
PROTECTED: 'protected';

//Reglas lexicas para estructuras de control
IF       : 'if'       ;
ELSE     : 'else'     ;

// Reglas lexicas para las comparaciones
EQ       : '==' ;
NEQ      : '!=' ;
GT       : '>'  ;
LT       : '<'  ;
GE       : '>=' ;
LE       : '<=' ;

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

        if (5 + 5/2==5) {
            x = 10;
            if (x == 10) {
                x = 5;
            }
        } else {
            x = 10/2;

            if (x == 5) {
                x = 10;
            }
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