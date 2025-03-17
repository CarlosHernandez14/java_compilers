import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;

public class App {
    public static void main(String[] args) throws Exception {
        

        ANTLRInputStream input = new ANTLRInputStream(System.in);
        // Create an instance of the lexer
        gramaticaAstLexer lexer = new gramaticaAstLexer(input);

        // Create a stream of tokens fed by the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create an instance of the parser
        gramaticaAstParser parser = new gramaticaAstParser(tokens);

        // Invoke the entry point of our grammar
        parser.prog();

    }
}
