// Generated from c:/Users/carlo/Documents/CompilersAntlr/java_compilers/java_ide_grammatic/src/sintaxisClass.g by ANTLR 4.13.1

    import java.util.HashMap;
    import org.antlr.v4.runtime.Token; // Para acceder a getLine(), getCharPositionInLine()

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class sintaxisClassLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, SEMICOLON=12, INT=13, DOUBLE=14, CHAR=15, STRING=16, 
		BOOLEAN=17, PUBLIC=18, PRIVATE=19, PROTECTED=20, IF=21, ELSE=22, EQ=23, 
		NEQ=24, GT=25, LT=26, GE=27, LE=28, DOT=29, CDOUBLE=30, CINT=31, ID=32, 
		WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "SEMICOLON", "INT", "DOUBLE", "CHAR", "STRING", "BOOLEAN", 
			"PUBLIC", "PRIVATE", "PROTECTED", "IF", "ELSE", "EQ", "NEQ", "GT", "LT", 
			"GE", "LE", "DOT", "CDOUBLE", "CINT", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'='", "','", "'('", "')'", "'+'", "'-'", 
			"'*'", "'/'", "';'", "'int'", "'double'", "'char'", "'String'", "'boolean'", 
			"'public'", "'private'", "'protected'", "'if'", "'else'", "'=='", "'!='", 
			"'>'", "'<'", "'>='", "'<='", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"SEMICOLON", "INT", "DOUBLE", "CHAR", "STRING", "BOOLEAN", "PUBLIC", 
			"PRIVATE", "PROTECTED", "IF", "ELSE", "EQ", "NEQ", "GT", "LT", "GE", 
			"LE", "DOT", "CDOUBLE", "CINT", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}



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


	public sintaxisClassLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sintaxisClass.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000!\u00d0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0004\u001d\u00b3\b\u001d\u000b\u001d\f\u001d"+
		"\u00b4\u0001\u001d\u0001\u001d\u0005\u001d\u00b9\b\u001d\n\u001d\f\u001d"+
		"\u00bc\t\u001d\u0001\u001e\u0004\u001e\u00bf\b\u001e\u000b\u001e\f\u001e"+
		"\u00c0\u0001\u001f\u0001\u001f\u0005\u001f\u00c5\b\u001f\n\u001f\f\u001f"+
		"\u00c8\t\u001f\u0001 \u0004 \u00cb\b \u000b \f \u00cc\u0001 \u0001 \u0000"+
		"\u0000!\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!\u0001"+
		"\u0000\u0003\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r"+
		"  \u00d4\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000"+
		"\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000"+
		"\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A"+
		"\u0001\u0000\u0000\u0000\u0001C\u0001\u0000\u0000\u0000\u0003I\u0001\u0000"+
		"\u0000\u0000\u0005K\u0001\u0000\u0000\u0000\u0007M\u0001\u0000\u0000\u0000"+
		"\tO\u0001\u0000\u0000\u0000\u000bQ\u0001\u0000\u0000\u0000\rS\u0001\u0000"+
		"\u0000\u0000\u000fU\u0001\u0000\u0000\u0000\u0011W\u0001\u0000\u0000\u0000"+
		"\u0013Y\u0001\u0000\u0000\u0000\u0015[\u0001\u0000\u0000\u0000\u0017]"+
		"\u0001\u0000\u0000\u0000\u0019_\u0001\u0000\u0000\u0000\u001bc\u0001\u0000"+
		"\u0000\u0000\u001dj\u0001\u0000\u0000\u0000\u001fo\u0001\u0000\u0000\u0000"+
		"!v\u0001\u0000\u0000\u0000#~\u0001\u0000\u0000\u0000%\u0085\u0001\u0000"+
		"\u0000\u0000\'\u008d\u0001\u0000\u0000\u0000)\u0097\u0001\u0000\u0000"+
		"\u0000+\u009a\u0001\u0000\u0000\u0000-\u009f\u0001\u0000\u0000\u0000/"+
		"\u00a2\u0001\u0000\u0000\u00001\u00a5\u0001\u0000\u0000\u00003\u00a7\u0001"+
		"\u0000\u0000\u00005\u00a9\u0001\u0000\u0000\u00007\u00ac\u0001\u0000\u0000"+
		"\u00009\u00af\u0001\u0000\u0000\u0000;\u00b2\u0001\u0000\u0000\u0000="+
		"\u00be\u0001\u0000\u0000\u0000?\u00c2\u0001\u0000\u0000\u0000A\u00ca\u0001"+
		"\u0000\u0000\u0000CD\u0005c\u0000\u0000DE\u0005l\u0000\u0000EF\u0005a"+
		"\u0000\u0000FG\u0005s\u0000\u0000GH\u0005s\u0000\u0000H\u0002\u0001\u0000"+
		"\u0000\u0000IJ\u0005{\u0000\u0000J\u0004\u0001\u0000\u0000\u0000KL\u0005"+
		"}\u0000\u0000L\u0006\u0001\u0000\u0000\u0000MN\u0005=\u0000\u0000N\b\u0001"+
		"\u0000\u0000\u0000OP\u0005,\u0000\u0000P\n\u0001\u0000\u0000\u0000QR\u0005"+
		"(\u0000\u0000R\f\u0001\u0000\u0000\u0000ST\u0005)\u0000\u0000T\u000e\u0001"+
		"\u0000\u0000\u0000UV\u0005+\u0000\u0000V\u0010\u0001\u0000\u0000\u0000"+
		"WX\u0005-\u0000\u0000X\u0012\u0001\u0000\u0000\u0000YZ\u0005*\u0000\u0000"+
		"Z\u0014\u0001\u0000\u0000\u0000[\\\u0005/\u0000\u0000\\\u0016\u0001\u0000"+
		"\u0000\u0000]^\u0005;\u0000\u0000^\u0018\u0001\u0000\u0000\u0000_`\u0005"+
		"i\u0000\u0000`a\u0005n\u0000\u0000ab\u0005t\u0000\u0000b\u001a\u0001\u0000"+
		"\u0000\u0000cd\u0005d\u0000\u0000de\u0005o\u0000\u0000ef\u0005u\u0000"+
		"\u0000fg\u0005b\u0000\u0000gh\u0005l\u0000\u0000hi\u0005e\u0000\u0000"+
		"i\u001c\u0001\u0000\u0000\u0000jk\u0005c\u0000\u0000kl\u0005h\u0000\u0000"+
		"lm\u0005a\u0000\u0000mn\u0005r\u0000\u0000n\u001e\u0001\u0000\u0000\u0000"+
		"op\u0005S\u0000\u0000pq\u0005t\u0000\u0000qr\u0005r\u0000\u0000rs\u0005"+
		"i\u0000\u0000st\u0005n\u0000\u0000tu\u0005g\u0000\u0000u \u0001\u0000"+
		"\u0000\u0000vw\u0005b\u0000\u0000wx\u0005o\u0000\u0000xy\u0005o\u0000"+
		"\u0000yz\u0005l\u0000\u0000z{\u0005e\u0000\u0000{|\u0005a\u0000\u0000"+
		"|}\u0005n\u0000\u0000}\"\u0001\u0000\u0000\u0000~\u007f\u0005p\u0000\u0000"+
		"\u007f\u0080\u0005u\u0000\u0000\u0080\u0081\u0005b\u0000\u0000\u0081\u0082"+
		"\u0005l\u0000\u0000\u0082\u0083\u0005i\u0000\u0000\u0083\u0084\u0005c"+
		"\u0000\u0000\u0084$\u0001\u0000\u0000\u0000\u0085\u0086\u0005p\u0000\u0000"+
		"\u0086\u0087\u0005r\u0000\u0000\u0087\u0088\u0005i\u0000\u0000\u0088\u0089"+
		"\u0005v\u0000\u0000\u0089\u008a\u0005a\u0000\u0000\u008a\u008b\u0005t"+
		"\u0000\u0000\u008b\u008c\u0005e\u0000\u0000\u008c&\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005p\u0000\u0000\u008e\u008f\u0005r\u0000\u0000\u008f\u0090"+
		"\u0005o\u0000\u0000\u0090\u0091\u0005t\u0000\u0000\u0091\u0092\u0005e"+
		"\u0000\u0000\u0092\u0093\u0005c\u0000\u0000\u0093\u0094\u0005t\u0000\u0000"+
		"\u0094\u0095\u0005e\u0000\u0000\u0095\u0096\u0005d\u0000\u0000\u0096("+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005i\u0000\u0000\u0098\u0099\u0005"+
		"f\u0000\u0000\u0099*\u0001\u0000\u0000\u0000\u009a\u009b\u0005e\u0000"+
		"\u0000\u009b\u009c\u0005l\u0000\u0000\u009c\u009d\u0005s\u0000\u0000\u009d"+
		"\u009e\u0005e\u0000\u0000\u009e,\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"=\u0000\u0000\u00a0\u00a1\u0005=\u0000\u0000\u00a1.\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005!\u0000\u0000\u00a3\u00a4\u0005=\u0000\u0000\u00a4"+
		"0\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005>\u0000\u0000\u00a62\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005<\u0000\u0000\u00a84\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0005>\u0000\u0000\u00aa\u00ab\u0005=\u0000\u0000\u00ab"+
		"6\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005<\u0000\u0000\u00ad\u00ae\u0005"+
		"=\u0000\u0000\u00ae8\u0001\u0000\u0000\u0000\u00af\u00b0\u0005.\u0000"+
		"\u0000\u00b0:\u0001\u0000\u0000\u0000\u00b1\u00b3\u000209\u0000\u00b2"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00ba\u0005.\u0000\u0000\u00b7\u00b9"+
		"\u000209\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb<\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bf\u000209\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1>\u0001\u0000\u0000\u0000\u00c2\u00c6"+
		"\u0007\u0000\u0000\u0000\u00c3\u00c5\u0007\u0001\u0000\u0000\u00c4\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7@\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cb\u0007"+
		"\u0002\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0006"+
		" \u0000\u0000\u00cfB\u0001\u0000\u0000\u0000\u0006\u0000\u00b4\u00ba\u00c0"+
		"\u00c6\u00cc\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}