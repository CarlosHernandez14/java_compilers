
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {

    public static void main(String[] args) throws Exception {

        // int x;
        // Obtenemos el primer argumento que se le pase al programa
        String filePath = "";

        try {
            filePath = args[0];
        } catch (Exception e) {
            // En caso de que no encuentre la ruta en los args cargar por defecto una
            filePath = "C:/Users/carlo/Documents/PruebaGramaticaExamen.java";
        }

        // Convertimos el archivo que se paso como argumento a un CharStream
        CharStream input = CharStreams.fromFileName(filePath);

        // Input stream from standard input (keyboard)
        // CharStream input = CharStreams.fromStream(System.in);
        sintaxisClassLexer lexer = new sintaxisClassLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        sintaxisClassParser parser = new sintaxisClassParser(tokens);

        // Add custom error listener
        CustomErrorListener errorListener = new CustomErrorListener();
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);
        // Asignamos el errorListener a la gramatica
        parser.setCustomErrorListener(errorListener);

        parser.program();

        String jsonErrors = errorListener.getErrorsAsJson();
        System.out.println(jsonErrors);

        // Save errors to JSON file
        errorListener.saveErrorsToJson("errors.json");

    }

}