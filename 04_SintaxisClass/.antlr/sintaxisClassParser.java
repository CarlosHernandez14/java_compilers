// Generated from c:/Users/carlo/Documents/LenguajesAutomatasJava/04_SintaxisClass/sintaxisClass.g by ANTLR 4.13.1

    import java.util.HashMap;

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
		T__9=10, T__10=11, SEMICOLON=12, INT=13, DOUBLE=14, CHAR=15, STRING=16, 
		BOOLEAN=17, PUBLIC=18, PRIVATE=19, PROTECTED=20, IF=21, ELSE=22, DOT=23, 
		CDOUBLE=24, CINT=25, ID=26, WS=27;
	public static final int
		RULE_program = 0, RULE_class_ = 1, RULE_member = 2, RULE_property = 3, 
		RULE_metodo = 4, RULE_modificAcceso = 5, RULE_tipo = 6, RULE_control_structure = 7, 
		RULE_conditional = 8, RULE_instruccion = 9, RULE_asignacion = 10, RULE_declaracion = 11, 
		RULE_declaracion_args = 12, RULE_expresion = 13, RULE_multExp = 14, RULE_atomExp = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_", "member", "property", "metodo", "modificAcceso", 
			"tipo", "control_structure", "conditional", "instruccion", "asignacion", 
			"declaracion", "declaracion_args", "expresion", "multExp", "atomExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'='", "','", "'('", "')'", "'+'", "'-'", 
			"'*'", "'/'", "';'", "'int'", "'double'", "'char'", "'String'", "'boolean'", 
			"'public'", "'private'", "'protected'", "'if'", "'else'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"SEMICOLON", "INT", "DOUBLE", "CHAR", "STRING", "BOOLEAN", "PUBLIC", 
			"PRIVATE", "PROTECTED", "IF", "ELSE", "DOT", "CDOUBLE", "CINT", "ID", 
			"WS"
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


	    // Variables globales

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
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				class_();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1835010L) != 0) );
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
		public Token ID;
		public TerminalNode ID() { return getToken(sintaxisClassParser.ID, 0); }
		public ModificAccesoContext modificAcceso() {
			return getRuleContext(ModificAccesoContext.class,0);
		}
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
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
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) {
				{
				setState(37);
				modificAcceso();
				}
			}

			setState(40);
			match(T__0);
			setState(41);
			((Class_Context)_localctx).ID = match(ID);
			 
			            // Pushemos las variables globales al hashmap
			            pushTSGlobal((((Class_Context)_localctx).ID!=null?((Class_Context)_localctx).ID.getText():null), SymbolType.CLASS);
			        
			setState(43);
			match(T__1);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2088960L) != 0)) {
				{
				{
				setState(44);
				member();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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
	public static class MemberContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_member);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				property();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				metodo();
				}
				break;
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
	public static class PropertyContext extends ParserRuleContext {
		public TipoContext tipo;
		public Token ID;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(sintaxisClassParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sintaxisClassParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(sintaxisClassParser.SEMICOLON, 0); }
		public ModificAccesoContext modificAcceso() {
			return getRuleContext(ModificAccesoContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) {
				{
				setState(56);
				modificAcceso();
				}
			}

			setState(59);
			((PropertyContext)_localctx).tipo = tipo();
			setState(60);
			((PropertyContext)_localctx).ID = match(ID);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(61);
				match(T__3);
				setState(62);
				expresion();
				}
			}

			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(65);
				match(T__4);
				setState(66);
				((PropertyContext)_localctx).ID = match(ID);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(67);
					match(T__3);
					setState(68);
					expresion();
					}
				}

				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(SEMICOLON);
			 
			                // Pushemos las variables globales al hashmap
			                // Posible error cause the modifAcces are typen on LowerCase
			                pushTSGlobal((((PropertyContext)_localctx).ID!=null?((PropertyContext)_localctx).ID.getText():null), SymbolType.valueOf(((((PropertyContext)_localctx).tipo!=null?_input.getText(((PropertyContext)_localctx).tipo.start,((PropertyContext)_localctx).tipo.stop):null)).toUpperCase()));
			            
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
		public Token ID;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(sintaxisClassParser.ID, 0); }
		public ModificAccesoContext modificAcceso() {
			return getRuleContext(ModificAccesoContext.class,0);
		}
		public Declaracion_argsContext declaracion_args() {
			return getRuleContext(Declaracion_argsContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<Control_structureContext> control_structure() {
			return getRuleContexts(Control_structureContext.class);
		}
		public Control_structureContext control_structure(int i) {
			return getRuleContext(Control_structureContext.class,i);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) {
				{
				setState(79);
				modificAcceso();
				}
			}

			setState(82);
			tipo();
			setState(83);
			((MetodoContext)_localctx).ID = match(ID);
			 
			                    // Push the method name to global symbols
			                    pushTSGlobal((((MetodoContext)_localctx).ID!=null?((MetodoContext)_localctx).ID.getText():null), SymbolType.METHOD);
			                
			setState(85);
			match(T__5);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 253952L) != 0)) {
				{
				setState(86);
				declaracion_args();
				}
			}

			setState(89);
			match(T__6);
			setState(90);
			match(T__1);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69459968L) != 0)) {
				{
				setState(93);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case DOUBLE:
				case CHAR:
				case STRING:
				case BOOLEAN:
				case ID:
					{
					setState(91);
					instruccion();
					}
					break;
				case IF:
					{
					setState(92);
					control_structure();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(T__2);
			 
			                    // Clear the local symbols
			                    TSLocal.clear();
			               
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
		enterRule(_localctx, 10, RULE_modificAcceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
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
		enterRule(_localctx, 12, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 253952L) != 0)) ) {
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
	public static class Control_structureContext extends ParserRuleContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Control_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_structure; }
	}

	public final Control_structureContext control_structure() throws RecognitionException {
		Control_structureContext _localctx = new Control_structureContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_control_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			conditional();
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
	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(sintaxisClassParser.IF, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(sintaxisClassParser.ELSE, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(IF);
			setState(108);
			match(T__5);
			setState(109);
			expresion();
			setState(110);
			match(T__6);
			setState(111);
			match(T__1);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67362816L) != 0)) {
				{
				{
				setState(112);
				instruccion();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__2);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(119);
				match(ELSE);
				setState(120);
				match(T__1);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67362816L) != 0)) {
					{
					{
					setState(121);
					instruccion();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(T__2);
				}
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
		enterRule(_localctx, 18, RULE_instruccion);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
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
				setState(131);
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
		public Token ID;
		public ExpresionContext expresion;
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
		enterRule(_localctx, 20, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((AsignacionContext)_localctx).ID = match(ID);
			setState(135);
			match(T__3);
			setState(136);
			((AsignacionContext)_localctx).expresion = expresion();
			 
			                    //System.out.println("Expression: "+(((AsignacionContext)_localctx).expresion!=null?_input.getText(((AsignacionContext)_localctx).expresion.start,((AsignacionContext)_localctx).expresion.stop):null) + " type: "+((AsignacionContext)_localctx).expresion.returnType);

			                    // Verificar si el tipo de la expression coincide con el tipo de la variable para asignarla
			                    if (TSLocal.containsKey((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null))) {
			                        if (TSLocal.get((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null)) != ((AsignacionContext)_localctx).expresion.returnType.ordinal()) {
			                            System.out.println("Error: No se puede asignar un tipo " + ((AsignacionContext)_localctx).expresion.returnType + " a la variable (" + (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null) + ") de tipo "+SymbolType.nameOf(TSLocal.get((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null))));
			                        }
			                    } else if (TSGlobal.containsKey((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null))) {
			                        if (TSGlobal.get((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null)) != ((AsignacionContext)_localctx).expresion.returnType.ordinal()) {
			                            System.out.println("Error: No se puede asignar un tipo" + ((AsignacionContext)_localctx).expresion.returnType + " a la variable (" + (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null) + ") de tipo " + SymbolType.nameOf(TSGlobal.get((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null))));
			                        }
			                    } else {
			                       System.out.println("Error: La variable " + (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null) + " no ha sido declarada");
			                    }
			                
			setState(138);
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
		public TipoContext tipo;
		public Token id1;
		public Token id2;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(sintaxisClassParser.SEMICOLON, 0); }
		public List<TerminalNode> ID() { return getTokens(sintaxisClassParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sintaxisClassParser.ID, i);
		}
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
		enterRule(_localctx, 22, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((DeclaracionContext)_localctx).tipo = tipo();
			setState(141);
			((DeclaracionContext)_localctx).id1 = match(ID);
			 
			                // Pushemos las variables locales al hashmap
			                pushTSLocal((((DeclaracionContext)_localctx).id1!=null?((DeclaracionContext)_localctx).id1.getText():null), SymbolType.valueOf(((((DeclaracionContext)_localctx).tipo!=null?_input.getText(((DeclaracionContext)_localctx).tipo.start,((DeclaracionContext)_localctx).tipo.stop):null)).toUpperCase()));
			            
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(143);
				match(T__3);
				setState(144);
				expresion();
				}
			}

			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(147);
				match(T__4);
				setState(148);
				((DeclaracionContext)_localctx).id2 = match(ID);
				 
				                    // Pushemos las variables locales al hashmap
				                    pushTSLocal((((DeclaracionContext)_localctx).id2!=null?((DeclaracionContext)_localctx).id2.getText():null), SymbolType.valueOf(((((DeclaracionContext)_localctx).tipo!=null?_input.getText(((DeclaracionContext)_localctx).tipo.start,((DeclaracionContext)_localctx).tipo.stop):null)).toUpperCase()));
				                
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(150);
					match(T__3);
					setState(151);
					expresion();
					}
				}

				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
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
		enterRule(_localctx, 24, RULE_declaracion_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			tipo();
			setState(162);
			match(ID);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(163);
				match(T__4);
				setState(164);
				tipo();
				setState(165);
				match(ID);
				}
				}
				setState(171);
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
		public SymbolType returnType;
		public MultExpContext m1;
		public MultExpContext m2;
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
		enterRule(_localctx, 26, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((ExpresionContext)_localctx).m1 = multExp();
			 
			                                        ((ExpresionContext)_localctx).returnType = ((ExpresionContext)_localctx).m1.returnType;
			                                        //System.out.println("Expression: "+(((ExpresionContext)_localctx).m1!=null?_input.getText(((ExpresionContext)_localctx).m1.start,((ExpresionContext)_localctx).m1.stop):null) + " type: "+((ExpresionContext)_localctx).m1.returnType);
			                                    
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__8) {
				{
				{
				setState(174);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(175);
				((ExpresionContext)_localctx).m2 = multExp();

				                                            //System.out.println("Expression: "+(((ExpresionContext)_localctx).m2!=null?_input.getText(((ExpresionContext)_localctx).m2.start,((ExpresionContext)_localctx).m2.stop):null) + " type: "+((ExpresionContext)_localctx).m2.returnType);
				                                            if (((ExpresionContext)_localctx).m2.returnType != ((ExpresionContext)_localctx).m1.returnType) {
				                                                ((ExpresionContext)_localctx).returnType =  SymbolType.ERROR_TYPE;
				                                                System.out.println("Error: Tipos de datos incompatibles");
				                                            }
				                                        
				}
				}
				setState(182);
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
		public SymbolType returnType;
		public AtomExpContext a1;
		public AtomExpContext a2;
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
		enterRule(_localctx, 28, RULE_multExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((MultExpContext)_localctx).a1 = atomExp();
			 
			                                        ((MultExpContext)_localctx).returnType = ((MultExpContext)_localctx).a1.returnType;
			                                    
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__10) {
				{
				{
				setState(185);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(186);
				((MultExpContext)_localctx).a2 = atomExp();
				 
				                                        if (((MultExpContext)_localctx).a2.returnType != ((MultExpContext)_localctx).a1.returnType) {
				                                            ((MultExpContext)_localctx).returnType =  SymbolType.ERROR_TYPE;
				                                            System.out.println("Error: Tipos de datos incompatibles");
				                                        }
				                                     
				}
				}
				setState(193);
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
		public SymbolType returnType;
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode CINT() { return getToken(sintaxisClassParser.CINT, 0); }
		public TerminalNode CDOUBLE() { return getToken(sintaxisClassParser.CDOUBLE, 0); }
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
		enterRule(_localctx, 30, RULE_atomExp);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(CINT);
				 ((AtomExpContext)_localctx).returnType = SymbolType.INT; 
				}
				break;
			case CDOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(CDOUBLE);
				 ((AtomExpContext)_localctx).returnType = SymbolType.DOUBLE; 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				((AtomExpContext)_localctx).ID = match(ID);
				 
				                                // Verify if the symbol is declared
				                                if (!TSLocal.containsKey((((AtomExpContext)_localctx).ID!=null?((AtomExpContext)_localctx).ID.getText():null)) && !TSGlobal.containsKey((((AtomExpContext)_localctx).ID!=null?((AtomExpContext)_localctx).ID.getText():null))) {
				                                    System.out.println("Error: La variable "+(((AtomExpContext)_localctx).ID!=null?((AtomExpContext)_localctx).ID.getText():null)+" no ha sido declarada");
				                                }

				                                // Verify if the symbol is declared on the local symbols
				                                if (TSLocal.containsKey((((AtomExpContext)_localctx).ID!=null?((AtomExpContext)_localctx).ID.getText():null))) {
				                                    ((AtomExpContext)_localctx).returnType =  SymbolType.nameOf(TSLocal.get((((AtomExpContext)_localctx).ID!=null?((AtomExpContext)_localctx).ID.getText():null)));
				                                } else {
				                                    ((AtomExpContext)_localctx).returnType =  SymbolType.nameOf(TSGlobal.get((((AtomExpContext)_localctx).ID!=null?((AtomExpContext)_localctx).ID.getText():null)));
				                                }
				                             
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(T__5);
				setState(201);
				((AtomExpContext)_localctx).expresion = expresion();
				 ((AtomExpContext)_localctx).returnType = ((AtomExpContext)_localctx).expresion.returnType; 
				setState(203);
				match(T__6);
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
		"\u0004\u0001\u001b\u00d0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0001"+
		"\u0003\u0001\'\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001\u0003"+
		"\u0003\u0003:\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003@\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003F\b\u0003\u0005\u0003H\b\u0003\n\u0003\f\u0003K\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004Q\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004X\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004^\b"+
		"\u0004\n\u0004\f\u0004a\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\br\b\b\n\b\f\bu\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b{\b\b\n\b\f\b~\t\b\u0001\b\u0003\b\u0081"+
		"\b\b\u0001\t\u0001\t\u0003\t\u0085\b\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0092\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0099\b\u000b\u0005\u000b\u009b\b\u000b"+
		"\n\u000b\f\u000b\u009e\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00a8\b\f\n\f\f\f\u00ab\t\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00b3\b\r\n\r\f\r\u00b6"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00be\b\u000e\n\u000e\f\u000e\u00c1\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ce\b\u000f"+
		"\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0004\u0001\u0000\u0012"+
		"\u0014\u0001\u0000\r\u0011\u0001\u0000\b\t\u0001\u0000\n\u000b\u00d8\u0000"+
		"!\u0001\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000\u00046\u0001"+
		"\u0000\u0000\u0000\u00069\u0001\u0000\u0000\u0000\bP\u0001\u0000\u0000"+
		"\u0000\ne\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000ei\u0001"+
		"\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012\u0084\u0001\u0000"+
		"\u0000\u0000\u0014\u0086\u0001\u0000\u0000\u0000\u0016\u008c\u0001\u0000"+
		"\u0000\u0000\u0018\u00a1\u0001\u0000\u0000\u0000\u001a\u00ac\u0001\u0000"+
		"\u0000\u0000\u001c\u00b7\u0001\u0000\u0000\u0000\u001e\u00cd\u0001\u0000"+
		"\u0000\u0000 \"\u0003\u0002\u0001\u0000! \u0001\u0000\u0000\u0000\"#\u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000"+
		"$\u0001\u0001\u0000\u0000\u0000%\'\u0003\n\u0005\u0000&%\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0005\u0001"+
		"\u0000\u0000)*\u0005\u001a\u0000\u0000*+\u0006\u0001\uffff\uffff\u0000"+
		"+/\u0005\u0002\u0000\u0000,.\u0003\u0004\u0002\u0000-,\u0001\u0000\u0000"+
		"\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000"+
		"\u0000\u000002\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0005"+
		"\u0003\u0000\u00003\u0003\u0001\u0000\u0000\u000047\u0003\u0006\u0003"+
		"\u000057\u0003\b\u0004\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000"+
		"\u00007\u0005\u0001\u0000\u0000\u00008:\u0003\n\u0005\u000098\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0003"+
		"\f\u0006\u0000<?\u0005\u001a\u0000\u0000=>\u0005\u0004\u0000\u0000>@\u0003"+
		"\u001a\r\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@I\u0001"+
		"\u0000\u0000\u0000AB\u0005\u0005\u0000\u0000BE\u0005\u001a\u0000\u0000"+
		"CD\u0005\u0004\u0000\u0000DF\u0003\u001a\r\u0000EC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GA\u0001\u0000\u0000"+
		"\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005"+
		"\f\u0000\u0000MN\u0006\u0003\uffff\uffff\u0000N\u0007\u0001\u0000\u0000"+
		"\u0000OQ\u0003\n\u0005\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RS\u0003\f\u0006\u0000ST\u0005\u001a\u0000"+
		"\u0000TU\u0006\u0004\uffff\uffff\u0000UW\u0005\u0006\u0000\u0000VX\u0003"+
		"\u0018\f\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000YZ\u0005\u0007\u0000\u0000Z_\u0005\u0002\u0000\u0000"+
		"[^\u0003\u0012\t\u0000\\^\u0003\u000e\u0007\u0000][\u0001\u0000\u0000"+
		"\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000bc\u0005\u0003\u0000\u0000cd\u0006\u0004\uffff\uffff"+
		"\u0000d\t\u0001\u0000\u0000\u0000ef\u0007\u0000\u0000\u0000f\u000b\u0001"+
		"\u0000\u0000\u0000gh\u0007\u0001\u0000\u0000h\r\u0001\u0000\u0000\u0000"+
		"ij\u0003\u0010\b\u0000j\u000f\u0001\u0000\u0000\u0000kl\u0005\u0015\u0000"+
		"\u0000lm\u0005\u0006\u0000\u0000mn\u0003\u001a\r\u0000no\u0005\u0007\u0000"+
		"\u0000os\u0005\u0002\u0000\u0000pr\u0003\u0012\t\u0000qp\u0001\u0000\u0000"+
		"\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000v\u0080"+
		"\u0005\u0003\u0000\u0000wx\u0005\u0016\u0000\u0000x|\u0005\u0002\u0000"+
		"\u0000y{\u0003\u0012\t\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000"+
		"\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0081\u0005\u0003\u0000"+
		"\u0000\u0080w\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u0011\u0001\u0000\u0000\u0000\u0082\u0085\u0003\u0014\n\u0000\u0083"+
		"\u0085\u0003\u0016\u000b\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0013\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005\u001a\u0000\u0000\u0087\u0088\u0005\u0004\u0000\u0000\u0088"+
		"\u0089\u0003\u001a\r\u0000\u0089\u008a\u0006\n\uffff\uffff\u0000\u008a"+
		"\u008b\u0005\f\u0000\u0000\u008b\u0015\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0003\f\u0006\u0000\u008d\u008e\u0005\u001a\u0000\u0000\u008e\u0091\u0006"+
		"\u000b\uffff\uffff\u0000\u008f\u0090\u0005\u0004\u0000\u0000\u0090\u0092"+
		"\u0003\u001a\r\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u009c\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"\u0005\u0000\u0000\u0094\u0095\u0005\u001a\u0000\u0000\u0095\u0098\u0006"+
		"\u000b\uffff\uffff\u0000\u0096\u0097\u0005\u0004\u0000\u0000\u0097\u0099"+
		"\u0003\u001a\r\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0093\u0001"+
		"\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001"+
		"\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"\f\u0000\u0000\u00a0\u0017\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003\f"+
		"\u0006\u0000\u00a2\u00a9\u0005\u001a\u0000\u0000\u00a3\u00a4\u0005\u0005"+
		"\u0000\u0000\u00a4\u00a5\u0003\f\u0006\u0000\u00a5\u00a6\u0005\u001a\u0000"+
		"\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u0019\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003\u001c\u000e"+
		"\u0000\u00ad\u00b4\u0006\r\uffff\uffff\u0000\u00ae\u00af\u0007\u0002\u0000"+
		"\u0000\u00af\u00b0\u0003\u001c\u000e\u0000\u00b0\u00b1\u0006\r\uffff\uffff"+
		"\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u001b\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\u001e\u000f"+
		"\u0000\u00b8\u00bf\u0006\u000e\uffff\uffff\u0000\u00b9\u00ba\u0007\u0003"+
		"\u0000\u0000\u00ba\u00bb\u0003\u001e\u000f\u0000\u00bb\u00bc\u0006\u000e"+
		"\uffff\uffff\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00b9\u0001"+
		"\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u001d\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005"+
		"\u0019\u0000\u0000\u00c3\u00ce\u0006\u000f\uffff\uffff\u0000\u00c4\u00c5"+
		"\u0005\u0018\u0000\u0000\u00c5\u00ce\u0006\u000f\uffff\uffff\u0000\u00c6"+
		"\u00c7\u0005\u001a\u0000\u0000\u00c7\u00ce\u0006\u000f\uffff\uffff\u0000"+
		"\u00c8\u00c9\u0005\u0006\u0000\u0000\u00c9\u00ca\u0003\u001a\r\u0000\u00ca"+
		"\u00cb\u0006\u000f\uffff\uffff\u0000\u00cb\u00cc\u0005\u0007\u0000\u0000"+
		"\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00c2\u0001\u0000\u0000\u0000"+
		"\u00cd\u00c4\u0001\u0000\u0000\u0000\u00cd\u00c6\u0001\u0000\u0000\u0000"+
		"\u00cd\u00c8\u0001\u0000\u0000\u0000\u00ce\u001f\u0001\u0000\u0000\u0000"+
		"\u0017#&/69?EIPW]_s|\u0080\u0084\u0091\u0098\u009c\u00a9\u00b4\u00bf\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}