// Generated from ids.g by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class idsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RESULTS=1, ID=2, CFLOAT=3, CINT=4, WS=5;
	public static final int
		RULE_inicio = 0, RULE_results = 1, RULE_identificadores = 2, RULE_flotante = 3, 
		RULE_entero = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "results", "identificadores", "flotante", "entero"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Results'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RESULTS", "ID", "CFLOAT", "CINT", "WS"
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

	@Override
	public String getGrammarFileName() { return "ids.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    int cint = 0, cids = 0, cfloat = 0;

	public idsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public ResultsContext results() {
			return getRuleContext(ResultsContext.class,0);
		}
		public List<IdentificadoresContext> identificadores() {
			return getRuleContexts(IdentificadoresContext.class);
		}
		public IdentificadoresContext identificadores(int i) {
			return getRuleContext(IdentificadoresContext.class,i);
		}
		public List<FlotanteContext> flotante() {
			return getRuleContexts(FlotanteContext.class);
		}
		public FlotanteContext flotante(int i) {
			return getRuleContext(FlotanteContext.class,i);
		}
		public List<EnteroContext> entero() {
			return getRuleContexts(EnteroContext.class);
		}
		public EnteroContext entero(int i) {
			return getRuleContext(EnteroContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idsListener ) ((idsListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idsListener ) ((idsListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(13);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(10);
					identificadores();
					}
					break;
				case CFLOAT:
					{
					setState(11);
					flotante();
					}
					break;
				case CINT:
					{
					setState(12);
					entero();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) );
			setState(17);
			results();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResultsContext extends ParserRuleContext {
		public TerminalNode RESULTS() { return getToken(idsParser.RESULTS, 0); }
		public ResultsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_results; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idsListener ) ((idsListener)listener).enterResults(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idsListener ) ((idsListener)listener).exitResults(this);
		}
	}

	public final ResultsContext results() throws RecognitionException {
		ResultsContext _localctx = new ResultsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_results);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(RESULTS);
			System.out.println("Identificadores: " + cids + " Enteros: " + cint + " Flotantes: " + cfloat);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadoresContext extends ParserRuleContext {
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(idsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(idsParser.ID, i);
		}
		public IdentificadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idsListener ) ((idsListener)listener).enterIdentificadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idsListener ) ((idsListener)listener).exitIdentificadores(this);
		}
	}

	public final IdentificadoresContext identificadores() throws RecognitionException {
		IdentificadoresContext _localctx = new IdentificadoresContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identificadores);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(22);
					((IdentificadoresContext)_localctx).ID = match(ID);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(25); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			System.out.println("Identificador: " + (((IdentificadoresContext)_localctx).ID!=null?((IdentificadoresContext)_localctx).ID.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FlotanteContext extends ParserRuleContext {
		public TerminalNode CFLOAT() { return getToken(idsParser.CFLOAT, 0); }
		public FlotanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flotante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idsListener ) ((idsListener)listener).enterFlotante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idsListener ) ((idsListener)listener).exitFlotante(this);
		}
	}

	public final FlotanteContext flotante() throws RecognitionException {
		FlotanteContext _localctx = new FlotanteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_flotante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(CFLOAT);
			cfloat++;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnteroContext extends ParserRuleContext {
		public TerminalNode CINT() { return getToken(idsParser.CINT, 0); }
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idsListener ) ((idsListener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idsListener ) ((idsListener)listener).exitEntero(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(CINT);
			cint++;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0005$\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0004\u0002\u0018\b\u0002\u000b\u0002\f\u0002\u0019\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006"+
		"\b\u0000\u0000\"\u0000\r\u0001\u0000\u0000\u0000\u0002\u0013\u0001\u0000"+
		"\u0000\u0000\u0004\u0017\u0001\u0000\u0000\u0000\u0006\u001d\u0001\u0000"+
		"\u0000\u0000\b \u0001\u0000\u0000\u0000\n\u000e\u0003\u0004\u0002\u0000"+
		"\u000b\u000e\u0003\u0006\u0003\u0000\f\u000e\u0003\b\u0004\u0000\r\n\u0001"+
		"\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\f\u0001\u0000\u0000"+
		"\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0003\u0002\u0001\u0000\u0012\u0001\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0005\u0001\u0000\u0000\u0014\u0015\u0006\u0001\uffff\uffff"+
		"\u0000\u0015\u0003\u0001\u0000\u0000\u0000\u0016\u0018\u0005\u0002\u0000"+
		"\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0006\u0002\uffff"+
		"\uffff\u0000\u001c\u0005\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0003"+
		"\u0000\u0000\u001e\u001f\u0006\u0003\uffff\uffff\u0000\u001f\u0007\u0001"+
		"\u0000\u0000\u0000 !\u0005\u0004\u0000\u0000!\"\u0006\u0004\uffff\uffff"+
		"\u0000\"\t\u0001\u0000\u0000\u0000\u0003\r\u000f\u0019";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}