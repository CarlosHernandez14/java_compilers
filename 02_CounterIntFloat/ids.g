grammar ids;

@members {
    int cint = 0, cids = 0, cfloat = 0;
}

inicio : (identificadores | flotante | entero)+ results;
// Reglas sintácticas
// Results imprime la cuenta de todas las variables encontradas
results : RESULTS {System.out.println("Identificadores: " + cids + " Enteros: " + cint + " Flotantes: " + cfloat);};
identificadores : (ID { 
        cids++; 
        System.out.println("Identificador: " + $ID.text); 
    })+ ;
// Incrementa cfloat si encuentra flotante
flotante: CFLOAT {cfloat++;};
// Incrementa cint si encuentra entero
entero: CINT {cint++;};

// Reglas léxicas
// Especificamos palabra especifica
RESULTS : 'Results' ;
ID  : ('a'..'z'|'A'..'Z')+ ;
// Nota: las reglas mas especificas como CFLOAT debe ir primero 
CFLOAT : ('0'..'9')+ '.' ('0'..'9')+ ;
CINT : ('0'..'9')+ ;
WS : (' '|'\t'|'\r'|'\n')  + -> skip;
