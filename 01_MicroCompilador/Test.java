
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Test {
    public static void main(String[] args) throws Exception {
        
        // Input stream from standard input (keyboard)
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        idsLexer lexer = new idsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        idsParser parser = new idsParser(tokens);
        parser.inicio();

    }
}
