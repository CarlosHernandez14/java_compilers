
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Test {

    public static void main(String[] args) throws Exception {

        // Input stream from standard input (keyboard)
        CharStream input = CharStreams.fromStream(System.in);
        sintaxisClassLexer lexer = new sintaxisClassLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        sintaxisClassParser parser = new sintaxisClassParser(tokens);
        parser.program();

    }

}