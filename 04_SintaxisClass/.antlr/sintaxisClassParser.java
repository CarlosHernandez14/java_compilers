// Generated from c:/Users/carlo/Documents/LenguajesAutomatasJava/04_SintaxisClass/sintaxisClass.g by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class sintaxisClassParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, SEMICOLON=11, INT=12, DOUBLE=13, CHAR=14, STRING=15, BOOLEAN=16, 
		PUBLIC=17, PRIVATE=18, PROTECTED=19, DOT=20, CFLOAT=21, CINT=22, ID=23, 
		WS=24;
	public static final int
		RULE_program = 0, RULE_class_ = 1, RULE_attribute = 2, RULE_metodo = 3, 
		RULE_modificAcceso = 4, RULE_tipo = 5, RULE_instruccion = 6, RULE_asignacion = 7, 
		RULE_declaracion = 8, RULE_declaracion_args = 9, RULE_expresion = 10, 
		RULE_multExp = 11, RULE_atomExp = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_", "attribute", "metodo", "modificAcceso", "tipo", 
			"instruccion", "asignacion", "declaracion", "declaracion_args", "expresion", 
			"multExp", "atomExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'('", "')'", "'='", "','", "'+'", "'-'", 
			"'*'", "';'", "'int'", "'double'", "'char'", "'String'", "'boolean'", 
			"'public'", "'private'", "'protected'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "SEMICOLON", 
			"INT", "DOUBLE", "CHAR", "STRING", "BOOLEAN", "PUBLIC", "PRIVATE", "PROTECTED", 
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

	@Override
	public String getGrammarFileName() { return "sintaxisClass.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sintaxisClassParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<Class_Context> class_() {
			return getRuleContexts(Class_Context.class);
		}
		public Class_Context class_(int i) {
			return getRuleContext(Class_Context.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				class_();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 917506L) != 0) );
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
	public static class Class_Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sintaxisClassParser.ID, 0); }
		public ModificAccesoContext modificAcceso() {
			return getRuleContext(ModificAccesoContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public Class_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_; }
	}

	public final Class_Context class_() throws RecognitionException {
		Class_Context _localctx = new Class_Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) {
				{
				setState(31);
				modificAcceso();
				}
			}

			setState(34);
			match(T__0);
			setState(35);
			match(ID);
			setState(36);
			match(T__1);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 126976L) != 0)) {
				{
				{
				setState(37);
				attribute();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) {
				{
				{
				setState(43);
				metodo();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(T__2);
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
	public static class AttributeContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			declaracion();
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
	public static class MetodoContext extends ParserRuleContext {
		public ModificAccesoContext modificAcceso() {
			return getRuleContext(ModificAccesoContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(sintaxisClassParser.ID, 0); }
		public Declaracion_argsContext declaracion_args() {
			return getRuleContext(Declaracion_argsContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			modificAcceso();
			setState(54);
			tipo();
			setState(55);
			match(ID);
			setState(56);
			match(T__3);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 126976L) != 0)) {
				{
				setState(57);
				declaracion_args();
				}
			}

			setState(60);
			match(T__4);
			setState(61);
			match(T__1);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8515584L) != 0)) {
				{
				{
				setState(62);
				instruccion();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(T__2);
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
	public static class ModificAccesoContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(sintaxisClassParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(sintaxisClassParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(sintaxisClassParser.PROTECTED, 0); }
		public ModificAccesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificAcceso; }
	}

	public final ModificAccesoContext modificAcceso() throws RecognitionException {
		ModificAccesoContext _localctx = new ModificAccesoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modificAcceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(sintaxisClassParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(sintaxisClassParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(sintaxisClassParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(sintaxisClassParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(sintaxisClassParser.BOOLEAN, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126976L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
	public static class InstruccionContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruccion);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				asignacion();
				}
				break;
			case INT:
			case DOUBLE:
			case CHAR:
			case STRING:
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				declaracion();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sintaxisClassParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(sintaxisClassParser.SEMICOLON, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
			setState(79);
			match(T__5);
			setState(80);
			expresion();
			setState(81);
			match(SEMICOLON);
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
	public static class DeclaracionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(sintaxisClassParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sintaxisClassParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(sintaxisClassParser.SEMICOLON, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			tipo();
			setState(84);
			match(ID);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(85);
				match(T__5);
				setState(86);
				expresion();
				}
			}

			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(89);
				match(T__6);
				setState(90);
				match(ID);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(91);
					match(T__5);
					setState(92);
					expresion();
					}
				}

				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(SEMICOLON);
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
	public static class Declaracion_argsContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(sintaxisClassParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sintaxisClassParser.ID, i);
		}
		public Declaracion_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_args; }
	}

	public final Declaracion_argsContext declaracion_args() throws RecognitionException {
		Declaracion_argsContext _localctx = new Declaracion_argsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracion_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			tipo();
			setState(103);
			match(ID);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(104);
				match(T__6);
				setState(105);
				tipo();
				setState(106);
				match(ID);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class ExpresionContext extends ParserRuleContext {
		public List<MultExpContext> multExp() {
			return getRuleContexts(MultExpContext.class);
		}
		public MultExpContext multExp(int i) {
			return getRuleContext(MultExpContext.class,i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			multExp();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__8) {
				{
				{
				setState(114);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(115);
				multExp();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class MultExpContext extends ParserRuleContext {
		public List<AtomExpContext> atomExp() {
			return getRuleContexts(AtomExpContext.class);
		}
		public AtomExpContext atomExp(int i) {
			return getRuleContext(AtomExpContext.class,i);
		}
		public MultExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExp; }
	}

	public final MultExpContext multExp() throws RecognitionException {
		MultExpContext _localctx = new MultExpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			atomExp();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(122);
				match(T__9);
				setState(123);
				atomExp();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class AtomExpContext extends ParserRuleContext {
		public TerminalNode CINT() { return getToken(sintaxisClassParser.CINT, 0); }
		public TerminalNode CFLOAT() { return getToken(sintaxisClassParser.CFLOAT, 0); }
		public TerminalNode ID() { return getToken(sintaxisClassParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AtomExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExp; }
	}

	public final AtomExpContext atomExp() throws RecognitionException {
		AtomExpContext _localctx = new AtomExpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atomExp);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(CINT);
				}
				break;
			case CFLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(CFLOAT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(ID);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(T__3);
				setState(133);
				expresion();
				setState(134);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\u0004\u0001\u0018\u008b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000"+
		"\u001d\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001\'\b\u0001\n\u0001\f\u0001*\t\u0001\u0001"+
		"\u0001\u0005\u0001-\b\u0001\n\u0001\f\u00010\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003;\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003@\b\u0003\n\u0003\f\u0003C\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006M\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bX\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b^\b\b\u0005\b`\b\b\n\b\f\bc\t\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tm\b"+
		"\t\n\t\f\tp\t\t\u0001\n\u0001\n\u0001\n\u0005\nu\b\n\n\n\f\nx\t\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b}\b\u000b\n\u000b\f\u000b\u0080"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0089\b\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u0000\u0003\u0001\u0000\u0011\u0013\u0001"+
		"\u0000\f\u0010\u0001\u0000\b\t\u008d\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0002 \u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u00065"+
		"\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000"+
		"\u0000\fL\u0001\u0000\u0000\u0000\u000eN\u0001\u0000\u0000\u0000\u0010"+
		"S\u0001\u0000\u0000\u0000\u0012f\u0001\u0000\u0000\u0000\u0014q\u0001"+
		"\u0000\u0000\u0000\u0016y\u0001\u0000\u0000\u0000\u0018\u0088\u0001\u0000"+
		"\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0001\u0001\u0000"+
		"\u0000\u0000\u001f!\u0003\b\u0004\u0000 \u001f\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0005\u0001\u0000"+
		"\u0000#$\u0005\u0017\u0000\u0000$(\u0005\u0002\u0000\u0000%\'\u0003\u0004"+
		"\u0002\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001"+
		"\u0000\u0000\u0000()\u0001\u0000\u0000\u0000).\u0001\u0000\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000+-\u0003\u0006\u0003\u0000,+\u0001\u0000\u0000"+
		"\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000012\u0005"+
		"\u0003\u0000\u00002\u0003\u0001\u0000\u0000\u000034\u0003\u0010\b\u0000"+
		"4\u0005\u0001\u0000\u0000\u000056\u0003\b\u0004\u000067\u0003\n\u0005"+
		"\u000078\u0005\u0017\u0000\u00008:\u0005\u0004\u0000\u00009;\u0003\u0012"+
		"\t\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<=\u0005\u0005\u0000\u0000=A\u0005\u0002\u0000\u0000>@\u0003"+
		"\f\u0006\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000DE\u0005\u0003\u0000\u0000E\u0007\u0001\u0000"+
		"\u0000\u0000FG\u0007\u0000\u0000\u0000G\t\u0001\u0000\u0000\u0000HI\u0007"+
		"\u0001\u0000\u0000I\u000b\u0001\u0000\u0000\u0000JM\u0003\u000e\u0007"+
		"\u0000KM\u0003\u0010\b\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000"+
		"\u0000M\r\u0001\u0000\u0000\u0000NO\u0005\u0017\u0000\u0000OP\u0005\u0006"+
		"\u0000\u0000PQ\u0003\u0014\n\u0000QR\u0005\u000b\u0000\u0000R\u000f\u0001"+
		"\u0000\u0000\u0000ST\u0003\n\u0005\u0000TW\u0005\u0017\u0000\u0000UV\u0005"+
		"\u0006\u0000\u0000VX\u0003\u0014\n\u0000WU\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000Xa\u0001\u0000\u0000\u0000YZ\u0005\u0007\u0000\u0000"+
		"Z]\u0005\u0017\u0000\u0000[\\\u0005\u0006\u0000\u0000\\^\u0003\u0014\n"+
		"\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000"+
		"\u0000\u0000_Y\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000de\u0005\u000b\u0000\u0000e\u0011\u0001\u0000"+
		"\u0000\u0000fg\u0003\n\u0005\u0000gn\u0005\u0017\u0000\u0000hi\u0005\u0007"+
		"\u0000\u0000ij\u0003\n\u0005\u0000jk\u0005\u0017\u0000\u0000km\u0001\u0000"+
		"\u0000\u0000lh\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0013\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000qv\u0003\u0016\u000b\u0000rs\u0007\u0002"+
		"\u0000\u0000su\u0003\u0016\u000b\u0000tr\u0001\u0000\u0000\u0000ux\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"w\u0015\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000y~\u0003\u0018"+
		"\f\u0000z{\u0005\n\u0000\u0000{}\u0003\u0018\f\u0000|z\u0001\u0000\u0000"+
		"\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0017\u0001\u0000\u0000\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0081\u0089\u0005\u0016\u0000\u0000\u0082\u0089\u0005"+
		"\u0015\u0000\u0000\u0083\u0089\u0005\u0017\u0000\u0000\u0084\u0085\u0005"+
		"\u0004\u0000\u0000\u0085\u0086\u0003\u0014\n\u0000\u0086\u0087\u0005\u0005"+
		"\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0081\u0001\u0000"+
		"\u0000\u0000\u0088\u0082\u0001\u0000\u0000\u0000\u0088\u0083\u0001\u0000"+
		"\u0000\u0000\u0088\u0084\u0001\u0000\u0000\u0000\u0089\u0019\u0001\u0000"+
		"\u0000\u0000\u000e\u001d (.:ALW]anv~\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}