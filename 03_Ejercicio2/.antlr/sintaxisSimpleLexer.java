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
		T__0=1, T__1=2, T__2=3, T__3=4, INT=5, DOUBLE=6, PUBLIC=7, PRIVATE=8, 
		PROTECTED=9, ID=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "INT", "DOUBLE", "PUBLIC", "PRIVATE", 
			"PROTECTED", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'int'", "'double'", "'public'", "'private'", 
			"'protected'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "INT", "DOUBLE", "PUBLIC", "PRIVATE", "PROTECTED", 
			"ID", "WS"
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
		"\u0004\u0000\u000bO\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0004\tE\b\t\u000b"+
		"\t\f\tF\u0001\n\u0004\nJ\b\n\u000b\n\f\nK\u0001\n\u0001\n\u0000\u0000"+
		"\u000b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0001\u0000\u0002\u0002\u0000"+
		"AZaz\u0003\u0000\t\n\r\r  P\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0001\u0017\u0001"+
		"\u0000\u0000\u0000\u0003\u0019\u0001\u0000\u0000\u0000\u0005\u001b\u0001"+
		"\u0000\u0000\u0000\u0007\u001d\u0001\u0000\u0000\u0000\t\u001f\u0001\u0000"+
		"\u0000\u0000\u000b#\u0001\u0000\u0000\u0000\r*\u0001\u0000\u0000\u0000"+
		"\u000f1\u0001\u0000\u0000\u0000\u00119\u0001\u0000\u0000\u0000\u0013D"+
		"\u0001\u0000\u0000\u0000\u0015I\u0001\u0000\u0000\u0000\u0017\u0018\u0005"+
		"(\u0000\u0000\u0018\u0002\u0001\u0000\u0000\u0000\u0019\u001a\u0005)\u0000"+
		"\u0000\u001a\u0004\u0001\u0000\u0000\u0000\u001b\u001c\u0005{\u0000\u0000"+
		"\u001c\u0006\u0001\u0000\u0000\u0000\u001d\u001e\u0005}\u0000\u0000\u001e"+
		"\b\u0001\u0000\u0000\u0000\u001f \u0005i\u0000\u0000 !\u0005n\u0000\u0000"+
		"!\"\u0005t\u0000\u0000\"\n\u0001\u0000\u0000\u0000#$\u0005d\u0000\u0000"+
		"$%\u0005o\u0000\u0000%&\u0005u\u0000\u0000&\'\u0005b\u0000\u0000\'(\u0005"+
		"l\u0000\u0000()\u0005e\u0000\u0000)\f\u0001\u0000\u0000\u0000*+\u0005"+
		"p\u0000\u0000+,\u0005u\u0000\u0000,-\u0005b\u0000\u0000-.\u0005l\u0000"+
		"\u0000./\u0005i\u0000\u0000/0\u0005c\u0000\u00000\u000e\u0001\u0000\u0000"+
		"\u000012\u0005p\u0000\u000023\u0005r\u0000\u000034\u0005i\u0000\u0000"+
		"45\u0005v\u0000\u000056\u0005a\u0000\u000067\u0005t\u0000\u000078\u0005"+
		"e\u0000\u00008\u0010\u0001\u0000\u0000\u00009:\u0005p\u0000\u0000:;\u0005"+
		"r\u0000\u0000;<\u0005o\u0000\u0000<=\u0005t\u0000\u0000=>\u0005e\u0000"+
		"\u0000>?\u0005c\u0000\u0000?@\u0005t\u0000\u0000@A\u0005e\u0000\u0000"+
		"AB\u0005d\u0000\u0000B\u0012\u0001\u0000\u0000\u0000CE\u0007\u0000\u0000"+
		"\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000G\u0014\u0001\u0000\u0000\u0000"+
		"HJ\u0007\u0001\u0000\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MN\u0006\n\u0000\u0000N\u0016\u0001\u0000\u0000\u0000\u0003"+
		"\u0000FK\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}