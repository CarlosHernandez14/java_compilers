
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class CustomErrorListener extends BaseErrorListener {
    private ArrayList<SyntaxError> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, 
                            Object offendingSymbol, 
                            int line, int charPositionInLine, 
                            String msg, RecognitionException e) {
        // Guarda el error en la lista
        SyntaxError error = new SyntaxError(line, charPositionInLine, msg);
        errors.add(error);

        System.out.println("Errores encontrados:");
        errors.forEach(System.out::println);

        // Imprime el error en consola (opcional)
        //System.err.println("Custom error at line " + line + ":" + charPositionInLine + " - " + msg);
    }

    public void saveErrorsToJson(String fileName) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(fileName)) {
            // Serializa la lista de errores a JSON y escribe el archivo
            gson.toJson(errors, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
