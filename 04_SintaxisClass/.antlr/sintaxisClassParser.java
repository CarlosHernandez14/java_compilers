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
		T__9=10, SEMICOLON=11, INT=12, DOUBLE=13, CHAR=14, STRING=15, BOOLEAN=16, 
		PUBLIC=17, PRIVATE=18, PROTECTED=19, DOT=20, CDOUBLE=21, CINT=22, ID=23, 
		WS=24;
	public static final int
		RULE_program = 0, RULE_class_ = 1, RULE_member = 2, RULE_property = 3, 
		RULE_metodo = 4, RULE_modificAcceso = 5, RULE_tipo = 6, RULE_instruccion = 7, 
		RULE_asignacion = 8, RULE_declaracion = 9, RULE_declaracion_args = 10, 
		RULE_expresion = 11, RULE_multExp = 12, RULE_atomExp = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_", "member", "property", "metodo", "modificAcceso", 
			"tipo", "instruccion", "asignacion", "declaracion", "declaracion_args", 
			"expresion", "multExp", "atomExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'='", "','", "'('", "')'", "'+'", "'-'", 
			"'*'", "';'", "'int'", "'double'", "'char'", "'String'", "'boolean'", 
			"'public'", "'private'", "'protected'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "SEMICOLON", 
			"INT", "DOUBLE", "CHAR", "STRING", "BOOLEAN", "PUBLIC", "PRIVATE", "PROTECTED", 
			"DOT", "CDOUBLE", "CINT", "ID", "WS"
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
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				class_();
				}
				}
				setState(31); 
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
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) {
				{
				setState(33);
				modificAcceso();
				}
			}

			setState(36);
			match(T__0);
			setState(37);
			((Class_Context)_localctx).ID = match(ID);
			 
			            // Pushemos las variables globales al hashmap
			            pushTSGlobal((((Class_Context)_localctx).ID!=null?((Class_Context)_localctx).ID.getText():null), SymbolType.CLASS);
			        
			setState(39);
			match(T__1);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1044480L) != 0)) {
				{
				{
				setState(40);
				member();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				property();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) {
				{
				setState(52);
				modificAcceso();
				}
			}

			setState(55);
			((PropertyContext)_localctx).tipo = tipo();
			setState(56);
			((PropertyContext)_localctx).ID = match(ID);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(57);
				match(T__3);
				setState(58);
				expresion();
				}
			}

			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(61);
				match(T__4);
				setState(62);
				((PropertyContext)_localctx).ID = match(ID);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(63);
					match(T__3);
					setState(64);
					expresion();
					}
				}

				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) {
				{
				setState(75);
				modificAcceso();
				}
			}

			setState(78);
			tipo();
			setState(79);
			((MetodoContext)_localctx).ID = match(ID);
			 
			                    // Push the method name to global symbols
			                    pushTSGlobal((((MetodoContext)_localctx).ID!=null?((MetodoContext)_localctx).ID.getText():null), SymbolType.METHOD);
			                
			setState(81);
			match(T__5);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 126976L) != 0)) {
				{
				setState(82);
				declaracion_args();
				}
			}

			setState(85);
			match(T__6);
			setState(86);
			match(T__1);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8515584L) != 0)) {
				{
				{
				setState(87);
				instruccion();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
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
			setState(96);
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
		enterRule(_localctx, 12, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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
		enterRule(_localctx, 14, RULE_instruccion);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
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
				setState(101);
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
		enterRule(_localctx, 16, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((AsignacionContext)_localctx).ID = match(ID);
			setState(105);
			match(T__3);
			setState(106);
			((AsignacionContext)_localctx).expresion = expresion();
			 
			                    System.out.println("Expression: "+(((AsignacionContext)_localctx).expresion!=null?_input.getText(((AsignacionContext)_localctx).expresion.start,((AsignacionContext)_localctx).expresion.stop):null) + " type: "+((AsignacionContext)_localctx).expresion.returnType);

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
			                
			setState(108);
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
		enterRule(_localctx, 18, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((DeclaracionContext)_localctx).tipo = tipo();
			setState(111);
			((DeclaracionContext)_localctx).id1 = match(ID);
			 
			                // Pushemos las variables locales al hashmap
			                pushTSLocal((((DeclaracionContext)_localctx).id1!=null?((DeclaracionContext)_localctx).id1.getText():null), SymbolType.valueOf(((((DeclaracionContext)_localctx).tipo!=null?_input.getText(((DeclaracionContext)_localctx).tipo.start,((DeclaracionContext)_localctx).tipo.stop):null)).toUpperCase()));
			            
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(113);
				match(T__3);
				setState(114);
				expresion();
				}
			}

			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(117);
				match(T__4);
				setState(118);
				((DeclaracionContext)_localctx).id2 = match(ID);
				 
				                    // Pushemos las variables locales al hashmap
				                    pushTSLocal((((DeclaracionContext)_localctx).id2!=null?((DeclaracionContext)_localctx).id2.getText():null), SymbolType.valueOf(((((DeclaracionContext)_localctx).tipo!=null?_input.getText(((DeclaracionContext)_localctx).tipo.start,((DeclaracionContext)_localctx).tipo.stop):null)).toUpperCase()));
				                
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(120);
					match(T__3);
					setState(121);
					expresion();
					}
				}

				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
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
		enterRule(_localctx, 20, RULE_declaracion_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			tipo();
			setState(132);
			match(ID);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(133);
				match(T__4);
				setState(134);
				tipo();
				setState(135);
				match(ID);
				}
				}
				setState(141);
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
		enterRule(_localctx, 22, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((ExpresionContext)_localctx).m1 = multExp();
			 
			                                        ((ExpresionContext)_localctx).returnType = ((ExpresionContext)_localctx).m1.returnType;
			                                    
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__8) {
				{
				{
				setState(144);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(145);
				((ExpresionContext)_localctx).m2 = multExp();
				}
				}
				setState(150);
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
		enterRule(_localctx, 24, RULE_multExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			((MultExpContext)_localctx).a1 = atomExp();
			 
			                                        ((MultExpContext)_localctx).returnType = ((MultExpContext)_localctx).a1.returnType;
			                                    
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(153);
				match(T__9);
				setState(154);
				((MultExpContext)_localctx).a2 = atomExp();
				 
				                                        if (((MultExpContext)_localctx).a2.returnType != ((MultExpContext)_localctx).a1.returnType) {
				                                            ((MultExpContext)_localctx).returnType =  SymbolType.ERROR_TYPE;
				                                            System.out.println("Error: Tipos de datos incompatibles");
				                                        }
				                                     
				}
				}
				setState(161);
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
		enterRule(_localctx, 26, RULE_atomExp);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(CINT);
				 ((AtomExpContext)_localctx).returnType = SymbolType.INT; 
				}
				break;
			case CDOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(CDOUBLE);
				 ((AtomExpContext)_localctx).returnType = SymbolType.DOUBLE; 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				((AtomExpContext)_localctx).ID = match(ID);
				 
				                                // Verify if the symbol is declared
				                                if (!TSLocal.containsKey((((AtomExpContext)_localctx).ID!=null?((AtomExpContext)_localctx).ID.getText():null)) && !TSGlobal.containsKey((((AtomExpContext)_localctx).ID!=null?((AtomExpContext)_localctx).ID.getText():null))) {
				                                    System.out.println("Error: La variable "+(((AtomExpContext)_localctx).ID!=null?((AtomExpContext)_localctx).ID.getText():null)+" no ha sido declarada");
				                                }

				                                // Verify if the symbol is declared on the local symbols
				                                if (TSLocal.containsKey((((AtomExpContext)_localctx).ID!=null?((AtomExpContext)_localctx).ID.getText():null))) {
				                                    ((AtomExpContext)_localctx).returnType =  SymbolType.valueOf(TSLocal.get((((AtomExpContext)_localctx).ID!=null?((AtomExpContext)_localctx).ID.getText():null)).toString());
				                                } else {
				                                    ((AtomExpContext)_localctx).returnType =  SymbolType.valueOf(TSGlobal.get((((AtomExpContext)_localctx).ID!=null?((AtomExpContext)_localctx).ID.getText():null)).toString());
				                                }
				                             
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(T__5);
				setState(169);
				((AtomExpContext)_localctx).expresion = expresion();
				 ((AtomExpContext)_localctx).returnType = ((AtomExpContext)_localctx).expresion.returnType; 
				setState(171);
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
		"\u0004\u0001\u0018\u00b0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001e\b\u0000"+
		"\u000b\u0000\f\u0000\u001f\u0001\u0001\u0003\u0001#\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001*\b\u0001"+
		"\n\u0001\f\u0001-\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u00023\b\u0002\u0001\u0003\u0003\u00036\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003<\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003B\b\u0003\u0005\u0003D\b\u0003"+
		"\n\u0003\f\u0003G\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0003\u0004M\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004T\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004Y\b\u0004\n\u0004\f\u0004\\\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007g\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tt\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t{\b\t\u0005\t}\b\t\n\t\f\t\u0080"+
		"\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u008a\b\n\n\n\f\n\u008d\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0093\b\u000b\n\u000b\f\u000b\u0096\t\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u009e\b\f\n\f\f\f\u00a1"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00ae\b\r\u0001\r\u0000\u0000\u000e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0003"+
		"\u0001\u0000\u0011\u0013\u0001\u0000\f\u0010\u0001\u0000\b\t\u00b6\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u00042"+
		"\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000\u0000\bL\u0001\u0000"+
		"\u0000\u0000\n`\u0001\u0000\u0000\u0000\fb\u0001\u0000\u0000\u0000\u000e"+
		"f\u0001\u0000\u0000\u0000\u0010h\u0001\u0000\u0000\u0000\u0012n\u0001"+
		"\u0000\u0000\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016\u008e\u0001"+
		"\u0000\u0000\u0000\u0018\u0097\u0001\u0000\u0000\u0000\u001a\u00ad\u0001"+
		"\u0000\u0000\u0000\u001c\u001e\u0003\u0002\u0001\u0000\u001d\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001"+
		"\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u0001\u0001\u0000\u0000"+
		"\u0000!#\u0003\n\u0005\u0000\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000%&\u0005"+
		"\u0017\u0000\u0000&\'\u0006\u0001\uffff\uffff\u0000\'+\u0005\u0002\u0000"+
		"\u0000(*\u0003\u0004\u0002\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005\u0003\u0000\u0000"+
		"/\u0003\u0001\u0000\u0000\u000003\u0003\u0006\u0003\u000013\u0003\b\u0004"+
		"\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u00003\u0005\u0001"+
		"\u0000\u0000\u000046\u0003\n\u0005\u000054\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0003\f\u0006\u00008;\u0005"+
		"\u0017\u0000\u00009:\u0005\u0004\u0000\u0000:<\u0003\u0016\u000b\u0000"+
		";9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<E\u0001\u0000\u0000"+
		"\u0000=>\u0005\u0005\u0000\u0000>A\u0005\u0017\u0000\u0000?@\u0005\u0004"+
		"\u0000\u0000@B\u0003\u0016\u000b\u0000A?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000C=\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u000b"+
		"\u0000\u0000IJ\u0006\u0003\uffff\uffff\u0000J\u0007\u0001\u0000\u0000"+
		"\u0000KM\u0003\n\u0005\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NO\u0003\f\u0006\u0000OP\u0005\u0017\u0000"+
		"\u0000PQ\u0006\u0004\uffff\uffff\u0000QS\u0005\u0006\u0000\u0000RT\u0003"+
		"\u0014\n\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UV\u0005\u0007\u0000\u0000VZ\u0005\u0002\u0000\u0000"+
		"WY\u0003\u000e\u0007\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005\u0003\u0000\u0000^_\u0006"+
		"\u0004\uffff\uffff\u0000_\t\u0001\u0000\u0000\u0000`a\u0007\u0000\u0000"+
		"\u0000a\u000b\u0001\u0000\u0000\u0000bc\u0007\u0001\u0000\u0000c\r\u0001"+
		"\u0000\u0000\u0000dg\u0003\u0010\b\u0000eg\u0003\u0012\t\u0000fd\u0001"+
		"\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000g\u000f\u0001\u0000\u0000"+
		"\u0000hi\u0005\u0017\u0000\u0000ij\u0005\u0004\u0000\u0000jk\u0003\u0016"+
		"\u000b\u0000kl\u0006\b\uffff\uffff\u0000lm\u0005\u000b\u0000\u0000m\u0011"+
		"\u0001\u0000\u0000\u0000no\u0003\f\u0006\u0000op\u0005\u0017\u0000\u0000"+
		"ps\u0006\t\uffff\uffff\u0000qr\u0005\u0004\u0000\u0000rt\u0003\u0016\u000b"+
		"\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t~\u0001\u0000"+
		"\u0000\u0000uv\u0005\u0005\u0000\u0000vw\u0005\u0017\u0000\u0000wz\u0006"+
		"\t\uffff\uffff\u0000xy\u0005\u0004\u0000\u0000y{\u0003\u0016\u000b\u0000"+
		"zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000"+
		"\u0000|u\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u000b\u0000"+
		"\u0000\u0082\u0013\u0001\u0000\u0000\u0000\u0083\u0084\u0003\f\u0006\u0000"+
		"\u0084\u008b\u0005\u0017\u0000\u0000\u0085\u0086\u0005\u0005\u0000\u0000"+
		"\u0086\u0087\u0003\f\u0006\u0000\u0087\u0088\u0005\u0017\u0000\u0000\u0088"+
		"\u008a\u0001\u0000\u0000\u0000\u0089\u0085\u0001\u0000\u0000\u0000\u008a"+
		"\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\u0015\u0001\u0000\u0000\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0003\u0018\f\u0000\u008f\u0094"+
		"\u0006\u000b\uffff\uffff\u0000\u0090\u0091\u0007\u0002\u0000\u0000\u0091"+
		"\u0093\u0003\u0018\f\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0096"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0001\u0000\u0000\u0000\u0095\u0017\u0001\u0000\u0000\u0000\u0096\u0094"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0003\u001a\r\u0000\u0098\u009f\u0006"+
		"\f\uffff\uffff\u0000\u0099\u009a\u0005\n\u0000\u0000\u009a\u009b\u0003"+
		"\u001a\r\u0000\u009b\u009c\u0006\f\uffff\uffff\u0000\u009c\u009e\u0001"+
		"\u0000\u0000\u0000\u009d\u0099\u0001\u0000\u0000\u0000\u009e\u00a1\u0001"+
		"\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a0\u0019\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0005\u0016\u0000\u0000\u00a3\u00ae\u0006"+
		"\r\uffff\uffff\u0000\u00a4\u00a5\u0005\u0015\u0000\u0000\u00a5\u00ae\u0006"+
		"\r\uffff\uffff\u0000\u00a6\u00a7\u0005\u0017\u0000\u0000\u00a7\u00ae\u0006"+
		"\r\uffff\uffff\u0000\u00a8\u00a9\u0005\u0006\u0000\u0000\u00a9\u00aa\u0003"+
		"\u0016\u000b\u0000\u00aa\u00ab\u0006\r\uffff\uffff\u0000\u00ab\u00ac\u0005"+
		"\u0007\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00a2\u0001"+
		"\u0000\u0000\u0000\u00ad\u00a4\u0001\u0000\u0000\u0000\u00ad\u00a6\u0001"+
		"\u0000\u0000\u0000\u00ad\u00a8\u0001\u0000\u0000\u0000\u00ae\u001b\u0001"+
		"\u0000\u0000\u0000\u0013\u001f\"+25;AELSZfsz~\u008b\u0094\u009f\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}