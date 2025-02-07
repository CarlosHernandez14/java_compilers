grammar ids;

// Inicio de la gramática que acepta identificadores y enteros
inicio : (identificadores | entero | flotante)+ ;

// Reglas sintácticas
// En las reglas sintanticas nos permite inyectar codigo java
identificadores : ID+ {System.out.println("Identificador: " + $ID.text);};
entero : CINT+ {System.out.println("Entero: " + $CINT.text);};
flotante : CFLOAT+ {System.out.println("Flotante: " + $CFLOAT.text);};

// Reglas léxicas
ID  : ('a'..'z'|'A'..'Z')+ ;
// Nota: las reglas mas especificas como CFLOAT debe ir primero 
CFLOAT : ('0'..'9')+ '.' ('0'..'9')+ ;
CINT : ('0'..'9')+ ;
WS : (' '|'\t'|'\r'|'\n')  + -> skip;