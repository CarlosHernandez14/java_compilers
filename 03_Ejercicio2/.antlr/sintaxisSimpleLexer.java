// Generated from c:/Users/carlo/Documents/LenguajesAutomatasJava/03_Ejercicio2/sintaxisSimple.g by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class sintaxisSimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SEMICOLON=9, 
		INT=10, DOUBLE=11, CHAR=12, STRING=13, BOOLEAN=14, PUBLIC=15, PRIVATE=16, 
		PROTECTED=17, DOT=18, CFLOAT=19, CINT=20, ID=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "SEMICOLON", 
			"INT", "DOUBLE", "CHAR", "STRING", "BOOLEAN", "PUBLIC", "PRIVATE", "PROTECTED", 
			"DOT", "CFLOAT", "CINT", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'='", "'+'", "'-'", "'*'", "';'", 
			"'int'", "'double'", "'char'", "'String'", "'boolean'", "'public'", "'private'", 
			"'protected'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "SEMICOLON", "INT", 
			"DOUBLE", "CHAR", "STRING", "BOOLEAN", "PUBLIC", "PRIVATE", "PROTECTED", 
			"DOT", "CFLOAT", "CINT", "ID", "WS"
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


	public sintaxisSimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sintaxisSimple.g"; }

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
		"\u0004\u0000\u0016\u0090\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0004\u0013\u007f\b\u0013\u000b\u0013\f\u0013"+
		"\u0080\u0001\u0014\u0001\u0014\u0005\u0014\u0085\b\u0014\n\u0014\f\u0014"+
		"\u0088\t\u0014\u0001\u0015\u0004\u0015\u008b\b\u0015\u000b\u0015\f\u0015"+
		"\u008c\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0003\u0003\u0000AZ_"+
		"_az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u0092\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u0003/\u0001\u0000\u0000\u0000"+
		"\u00051\u0001\u0000\u0000\u0000\u00073\u0001\u0000\u0000\u0000\t5\u0001"+
		"\u0000\u0000\u0000\u000b7\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000"+
		"\u0000\u000f;\u0001\u0000\u0000\u0000\u0011=\u0001\u0000\u0000\u0000\u0013"+
		"?\u0001\u0000\u0000\u0000\u0015C\u0001\u0000\u0000\u0000\u0017J\u0001"+
		"\u0000\u0000\u0000\u0019O\u0001\u0000\u0000\u0000\u001bV\u0001\u0000\u0000"+
		"\u0000\u001d^\u0001\u0000\u0000\u0000\u001fe\u0001\u0000\u0000\u0000!"+
		"m\u0001\u0000\u0000\u0000#w\u0001\u0000\u0000\u0000%y\u0001\u0000\u0000"+
		"\u0000\'~\u0001\u0000\u0000\u0000)\u0082\u0001\u0000\u0000\u0000+\u008a"+
		"\u0001\u0000\u0000\u0000-.\u0005(\u0000\u0000.\u0002\u0001\u0000\u0000"+
		"\u0000/0\u0005)\u0000\u00000\u0004\u0001\u0000\u0000\u000012\u0005{\u0000"+
		"\u00002\u0006\u0001\u0000\u0000\u000034\u0005}\u0000\u00004\b\u0001\u0000"+
		"\u0000\u000056\u0005=\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005+"+
		"\u0000\u00008\f\u0001\u0000\u0000\u00009:\u0005-\u0000\u0000:\u000e\u0001"+
		"\u0000\u0000\u0000;<\u0005*\u0000\u0000<\u0010\u0001\u0000\u0000\u0000"+
		"=>\u0005;\u0000\u0000>\u0012\u0001\u0000\u0000\u0000?@\u0005i\u0000\u0000"+
		"@A\u0005n\u0000\u0000AB\u0005t\u0000\u0000B\u0014\u0001\u0000\u0000\u0000"+
		"CD\u0005d\u0000\u0000DE\u0005o\u0000\u0000EF\u0005u\u0000\u0000FG\u0005"+
		"b\u0000\u0000GH\u0005l\u0000\u0000HI\u0005e\u0000\u0000I\u0016\u0001\u0000"+
		"\u0000\u0000JK\u0005c\u0000\u0000KL\u0005h\u0000\u0000LM\u0005a\u0000"+
		"\u0000MN\u0005r\u0000\u0000N\u0018\u0001\u0000\u0000\u0000OP\u0005S\u0000"+
		"\u0000PQ\u0005t\u0000\u0000QR\u0005r\u0000\u0000RS\u0005i\u0000\u0000"+
		"ST\u0005n\u0000\u0000TU\u0005g\u0000\u0000U\u001a\u0001\u0000\u0000\u0000"+
		"VW\u0005b\u0000\u0000WX\u0005o\u0000\u0000XY\u0005o\u0000\u0000YZ\u0005"+
		"l\u0000\u0000Z[\u0005e\u0000\u0000[\\\u0005a\u0000\u0000\\]\u0005n\u0000"+
		"\u0000]\u001c\u0001\u0000\u0000\u0000^_\u0005p\u0000\u0000_`\u0005u\u0000"+
		"\u0000`a\u0005b\u0000\u0000ab\u0005l\u0000\u0000bc\u0005i\u0000\u0000"+
		"cd\u0005c\u0000\u0000d\u001e\u0001\u0000\u0000\u0000ef\u0005p\u0000\u0000"+
		"fg\u0005r\u0000\u0000gh\u0005i\u0000\u0000hi\u0005v\u0000\u0000ij\u0005"+
		"a\u0000\u0000jk\u0005t\u0000\u0000kl\u0005e\u0000\u0000l \u0001\u0000"+
		"\u0000\u0000mn\u0005p\u0000\u0000no\u0005r\u0000\u0000op\u0005o\u0000"+
		"\u0000pq\u0005t\u0000\u0000qr\u0005e\u0000\u0000rs\u0005c\u0000\u0000"+
		"st\u0005t\u0000\u0000tu\u0005e\u0000\u0000uv\u0005d\u0000\u0000v\"\u0001"+
		"\u0000\u0000\u0000wx\u0005.\u0000\u0000x$\u0001\u0000\u0000\u0000yz\u0003"+
		"\'\u0013\u0000z{\u0003#\u0011\u0000{|\u0003\'\u0013\u0000|&\u0001\u0000"+
		"\u0000\u0000}\u007f\u000209\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081(\u0001\u0000\u0000\u0000\u0082\u0086\u0007\u0000"+
		"\u0000\u0000\u0083\u0085\u0007\u0001\u0000\u0000\u0084\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087*\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008b\u0007\u0002\u0000"+
		"\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0006\u0015\u0000"+
		"\u0000\u008f,\u0001\u0000\u0000\u0000\u0004\u0000\u0080\u0086\u008c\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}