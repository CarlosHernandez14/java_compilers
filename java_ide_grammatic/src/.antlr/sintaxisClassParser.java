// Generated from c:/Users/carlo/Documents/CompilersAntlr/java_compilers/java_ide_grammatic/src/sintaxisClass.g by ANTLR 4.13.1

    import java.util.HashMap;
    import org.antlr.v4.runtime.Token; // Para acceder a getLine(), getCharPositionInLine()

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
		BOOLEAN=17, VOID=18, RETURN=19, PUBLIC=20, PRIVATE=21, PROTECTED=22, IF=23, 
		ELSE=24, EQ=25, NEQ=26, GT=27, LT=28, GE=29, LE=30, DOT=31, CDOUBLE=32, 
		CINT=33, ID=34, WS=35;
	public static final int
		RULE_program = 0, RULE_class_ = 1, RULE_member = 2, RULE_property = 3, 
		RULE_metodo = 4, RULE_modificAcceso = 5, RULE_tipo = 6, RULE_returnTypeMethods = 7, 
		RULE_returnExpMethods = 8, RULE_control_structure = 9, RULE_conditional = 10, 
		RULE_instruccion = 11, RULE_asignacion = 12, RULE_declaracion = 13, RULE_declaracion_args = 14, 
		RULE_expresion = 15, RULE_multExp = 16, RULE_atomExp = 17, RULE_comparacion = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_", "member", "property", "metodo", "modificAcceso", 
			"tipo", "returnTypeMethods", "returnExpMethods", "control_structure", 
			"conditional", "instruccion", "asignacion", "declaracion", "declaracion_args", 
			"expresion", "multExp", "atomExp", "comparacion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'='", "','", "'('", "')'", "'+'", "'-'", 
			"'*'", "'/'", "';'", "'int'", "'double'", "'char'", "'String'", "'boolean'", 
			"'void'", "'return'", "'public'", "'private'", "'protected'", "'if'", 
			"'else'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"SEMICOLON", "INT", "DOUBLE", "CHAR", "STRING", "BOOLEAN", "VOID", "RETURN", 
			"PUBLIC", "PRIVATE", "PROTECTED", "IF", "ELSE", "EQ", "NEQ", "GT", "LT", 
			"GE", "LE", "DOT", "CDOUBLE", "CINT", "ID", "WS"
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
	    public void pushTSGlobal(String id, SymbolType type, Token token) {
	        // Verify if the symbol is already declared
	        if (TSGlobal.containsKey(id)) {
	            // System.out.println("Error: La variable global "+id+" ya ha sido declarada");
	            errorListener.addSemanticError(
	                "La variable global '" + id + "' ya ha sido declarada",
	                token.getLine(),
	                token.getCharPositionInLine()
	            );
	        } else {
	            // Insert the symbol on the hashmap
	            TSGlobal.put(id, type.ordinal());
	        }
	    }

	    // Method to insert on the symbols hasmap and verify if it is already declared
	    public void pushTSLocal(String id, SymbolType type, Token token) {
	        // Verify if the symbol is already declared
	        if (TSLocal.containsKey(id)) {
	            // System.out.println("Error: La variable local "+id+" ya ha sido declarada");
	            errorListener.addSemanticError(
	                "La variable local '" + id + "' ya ha sido declarada",
	                token.getLine(),
	                token.getCharPositionInLine()
	            );
	        } else {
	            // Insert the symbol on the hashmap
	            TSLocal.put(id, type.ordinal());
	        }
	    }

	    // Enum to map the symbols to a number to insert on the hashmap
	    public enum SymbolType {
	        INT, DOUBLE, CHAR, STRING, BOOLEAN, CLASS, METHOD, ERROR_TYPE, VOID;

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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				class_();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7340034L) != 0) );
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
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) {
				{
				setState(43);
				modificAcceso();
				}
			}

			setState(46);
			match(T__0);
			setState(47);
			((Class_Context)_localctx).ID = match(ID);
			 
			            // Pushemos las variables globales al hashmap
			            pushTSGlobal((((Class_Context)_localctx).ID!=null?((Class_Context)_localctx).ID.getText():null), SymbolType.CLASS, ((Class_Context)_localctx).ID); // Agrergamos el token para obtener la linea y columna
			        
			setState(49);
			match(T__1);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7856128L) != 0)) {
				{
				{
				setState(50);
				member();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				property();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
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
		public Token id1;
		public ExpresionContext expresion;
		public Token id2;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(sintaxisClassParser.SEMICOLON, 0); }
		public List<TerminalNode> ID() { return getTokens(sintaxisClassParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sintaxisClassParser.ID, i);
		}
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) {
				{
				setState(62);
				modificAcceso();
				}
			}

			setState(65);
			((PropertyContext)_localctx).tipo = tipo();
			setState(66);
			((PropertyContext)_localctx).id1 = match(ID);
			 
			                            // Pushemos las variables locales al hashmap
			                            pushTSGlobal((((PropertyContext)_localctx).id1!=null?((PropertyContext)_localctx).id1.getText():null), SymbolType.valueOf(((((PropertyContext)_localctx).tipo!=null?_input.getText(((PropertyContext)_localctx).tipo.start,((PropertyContext)_localctx).tipo.stop):null)).toUpperCase()), ((PropertyContext)_localctx).id1);
			                        
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(68);
				match(T__3);
				setState(69);
				((PropertyContext)_localctx).expresion = expresion();
				 
				                                //System.out.println("Expression: "+(((PropertyContext)_localctx).expresion!=null?_input.getText(((PropertyContext)_localctx).expresion.start,((PropertyContext)_localctx).expresion.stop):null) + " type: "+((PropertyContext)_localctx).expresion.returnType);
				                                if ((((PropertyContext)_localctx).expresion!=null?_input.getText(((PropertyContext)_localctx).expresion.start,((PropertyContext)_localctx).expresion.stop):null).length() <= 0) {
				                                    errorListener.addSemanticError(
				                                        "Error: Falta asignar expression" +
				                                        " a la variable (" + (((PropertyContext)_localctx).id1!=null?((PropertyContext)_localctx).id1.getText():null) + ") de tipo " +
				                                        SymbolType.nameOf(TSLocal.get((((PropertyContext)_localctx).id1!=null?((PropertyContext)_localctx).id1.getText():null))),
				                                        ((PropertyContext)_localctx).id1.getLine(),
				                                        ((PropertyContext)_localctx).id1.getCharPositionInLine()
				                                    );
				                                    throw new RecognitionException("Errror: Falta asignar expression a la variable" + (((PropertyContext)_localctx).id1!=null?((PropertyContext)_localctx).id1.getText():null), null, _input, _localctx);
				                                }

				                                // Verificar si el tipo de la expression coincide con el tipo de la variable para asignarla
				                                if (TSGlobal.containsKey((((PropertyContext)_localctx).id1!=null?((PropertyContext)_localctx).id1.getText():null))) {
				                                    if (TSGlobal.get((((PropertyContext)_localctx).id1!=null?((PropertyContext)_localctx).id1.getText():null)) != ((PropertyContext)_localctx).expresion.returnType.ordinal()) {
				                                        // System.out.println("Error: No se puede asignar un tipo" + ((PropertyContext)_localctx).expresion.returnType + " a la variable (" + (((PropertyContext)_localctx).id1!=null?((PropertyContext)_localctx).id1.getText():null) + ") de tipo " + SymbolType.nameOf(TSGlobal.get((((PropertyContext)_localctx).id1!=null?((PropertyContext)_localctx).id1.getText():null))));
				                                        // Agregamos el error de semantica al errorListener
				                                        errorListener.addSemanticError(
				                                            "No se puede asignar un tipo " + ((PropertyContext)_localctx).expresion.returnType +
				                                            " a la variable (" + (((PropertyContext)_localctx).id1!=null?((PropertyContext)_localctx).id1.getText():null) + ") de tipo " +
				                                            SymbolType.nameOf(TSGlobal.get((((PropertyContext)_localctx).id1!=null?((PropertyContext)_localctx).id1.getText():null))),
				                                            ((PropertyContext)_localctx).id1.getLine(),
				                                            ((PropertyContext)_localctx).id1.getCharPositionInLine()
				                                        );
				                                    }
				                                } else {
				                                    // System.out.println("Error: La variable " + (((PropertyContext)_localctx).id1!=null?((PropertyContext)_localctx).id1.getText():null) + " no ha sido declarada");
				                                    // Agregamos el error de semantica al errorListener
				                                    errorListener.addSemanticError(
				                                        "La variable " + (((PropertyContext)_localctx).id1!=null?((PropertyContext)_localctx).id1.getText():null) + " no ha sido declarada",
				                                        ((PropertyContext)_localctx).id1.getLine(),
				                                        ((PropertyContext)_localctx).id1.getCharPositionInLine()
				                                    );
				                                }
				                            
				}
			}

			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(74);
				match(T__4);
				setState(75);
				((PropertyContext)_localctx).id2 = match(ID);
				 
				                                // Pushemos las variables locales al hashmap
				                                pushTSGlobal((((PropertyContext)_localctx).id2!=null?((PropertyContext)_localctx).id2.getText():null), SymbolType.valueOf(((((PropertyContext)_localctx).tipo!=null?_input.getText(((PropertyContext)_localctx).tipo.start,((PropertyContext)_localctx).tipo.stop):null)).toUpperCase()), ((PropertyContext)_localctx).id2);                                
				                            
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(77);
					match(T__3);
					setState(78);
					((PropertyContext)_localctx).expresion = expresion();
					 
					                                    //System.out.println("Expression: "+(((PropertyContext)_localctx).expresion!=null?_input.getText(((PropertyContext)_localctx).expresion.start,((PropertyContext)_localctx).expresion.stop):null) + " type: "+((PropertyContext)_localctx).expresion.returnType);
					                                    if ((((PropertyContext)_localctx).expresion!=null?_input.getText(((PropertyContext)_localctx).expresion.start,((PropertyContext)_localctx).expresion.stop):null).length() <= 0) {
					                                        errorListener.addSemanticError(
					                                            "Error: Falta asignar expression" +
					                                            " a la variable (" + (((PropertyContext)_localctx).id2!=null?((PropertyContext)_localctx).id2.getText():null) + ") de tipo " +
					                                            SymbolType.nameOf(TSLocal.get((((PropertyContext)_localctx).id2!=null?((PropertyContext)_localctx).id2.getText():null))),
					                                            ((PropertyContext)_localctx).id2.getLine(),
					                                            ((PropertyContext)_localctx).id2.getCharPositionInLine()
					                                        );
					                                        throw new RecognitionException("Errror: Falta asignar expression a la variable" + (((PropertyContext)_localctx).id2!=null?((PropertyContext)_localctx).id2.getText():null), null, _input, _localctx);
					                                    }

					                                    // Verificar si el tipo de la expression coincide con el tipo de la variable para asignarla
					                                    if (TSGlobal.containsKey((((PropertyContext)_localctx).id2!=null?((PropertyContext)_localctx).id2.getText():null))) {
					                                        if (TSGlobal.get((((PropertyContext)_localctx).id2!=null?((PropertyContext)_localctx).id2.getText():null)) != ((PropertyContext)_localctx).expresion.returnType.ordinal()) {
					                                            // System.out.println("Error: No se puede asignar un tipo" + ((PropertyContext)_localctx).expresion.returnType + " a la variable (" + (((PropertyContext)_localctx).id2!=null?((PropertyContext)_localctx).id2.getText():null) + ") de tipo " + SymbolType.nameOf(TSGlobal.get((((PropertyContext)_localctx).id2!=null?((PropertyContext)_localctx).id2.getText():null))));
					                                            // Agregamos el error de semantica al errorListener
					                                            errorListener.addSemanticError(
					                                                "No se puede asignar un tipo " + ((PropertyContext)_localctx).expresion.returnType +
					                                                " a la variable (" + (((PropertyContext)_localctx).id2!=null?((PropertyContext)_localctx).id2.getText():null) + ") de tipo " +
					                                                SymbolType.nameOf(TSGlobal.get((((PropertyContext)_localctx).id2!=null?((PropertyContext)_localctx).id2.getText():null))),
					                                                ((PropertyContext)_localctx).id2.getLine(),
					                                                ((PropertyContext)_localctx).id2.getCharPositionInLine()
					                                            );
					                                        }
					                                    } else {
					                                        // System.out.println("Error: La variable " + (((PropertyContext)_localctx).id2!=null?((PropertyContext)_localctx).id2.getText():null) + " no ha sido declarada");
					                                        // Agregamos el error de semantica al errorListener
					                                        errorListener.addSemanticError(
					                                            "La variable " + (((PropertyContext)_localctx).id2!=null?((PropertyContext)_localctx).id2.getText():null) + " no ha sido declarada",
					                                            ((PropertyContext)_localctx).id2.getLine(),
					                                            ((PropertyContext)_localctx).id2.getCharPositionInLine()
					                                        );
					                                    }
					                                
					}
				}

				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
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
	public static class MetodoContext extends ParserRuleContext {
		public Token ID;
		public ReturnTypeMethodsContext returnTypeMethods() {
			return getRuleContext(ReturnTypeMethodsContext.class,0);
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
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) {
				{
				setState(90);
				modificAcceso();
				}
			}

			setState(93);
			returnTypeMethods();
			setState(94);
			((MetodoContext)_localctx).ID = match(ID);
			 
			                    // Push the method name to global symbols
			                    // Agrergamos el token para obtener la linea y columna
			                    pushTSGlobal((((MetodoContext)_localctx).ID!=null?((MetodoContext)_localctx).ID.getText():null), SymbolType.METHOD, ((MetodoContext)_localctx).ID);
			                
			setState(96);
			match(T__5);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 253952L) != 0)) {
				{
				setState(97);
				declaracion_args();
				}
			}

			setState(100);
			match(T__6);
			setState(101);
			match(T__1);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17188511744L) != 0)) {
				{
				setState(104);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case DOUBLE:
				case CHAR:
				case STRING:
				case BOOLEAN:
				case ID:
					{
					setState(102);
					instruccion();
					}
					break;
				case IF:
					{
					setState(103);
					control_structure();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
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
			setState(114);
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
	public static class ReturnTypeMethodsContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode VOID() { return getToken(sintaxisClassParser.VOID, 0); }
		public ReturnTypeMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnTypeMethods; }
	}

	public final ReturnTypeMethodsContext returnTypeMethods() throws RecognitionException {
		ReturnTypeMethodsContext _localctx = new ReturnTypeMethodsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnTypeMethods);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case CHAR:
			case STRING:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				tipo();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(VOID);
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
	public static class ReturnExpMethodsContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(sintaxisClassParser.RETURN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(sintaxisClassParser.SEMICOLON, 0); }
		public ReturnExpMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpMethods; }
	}

	public final ReturnExpMethodsContext returnExpMethods() throws RecognitionException {
		ReturnExpMethodsContext _localctx = new ReturnExpMethodsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnExpMethods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(RETURN);
			setState(121);
			expresion();
			setState(122);
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
		enterRule(_localctx, 18, RULE_control_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
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
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
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
		public TerminalNode ELSE() { return getToken(sintaxisClassParser.ELSE, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(IF);
			setState(127);
			match(T__5);
			setState(128);
			comparacion();
			setState(129);
			match(T__6);
			setState(130);
			match(T__1);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17188511744L) != 0)) {
				{
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case DOUBLE:
				case CHAR:
				case STRING:
				case BOOLEAN:
				case ID:
					{
					setState(131);
					instruccion();
					}
					break;
				case IF:
					{
					setState(132);
					control_structure();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(T__2);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(139);
				match(ELSE);
				setState(140);
				match(T__1);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17188511744L) != 0)) {
					{
					setState(143);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
					case DOUBLE:
					case CHAR:
					case STRING:
					case BOOLEAN:
					case ID:
						{
						setState(141);
						instruccion();
						}
						break;
					case IF:
						{
						setState(142);
						control_structure();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
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
		enterRule(_localctx, 22, RULE_instruccion);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
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
				setState(152);
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
		enterRule(_localctx, 24, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((AsignacionContext)_localctx).ID = match(ID);
			setState(156);
			match(T__3);
			setState(157);
			((AsignacionContext)_localctx).expresion = expresion();
			 
			                    //System.out.println("Expression: "+(((AsignacionContext)_localctx).expresion!=null?_input.getText(((AsignacionContext)_localctx).expresion.start,((AsignacionContext)_localctx).expresion.stop):null) + " type: "+((AsignacionContext)_localctx).expresion.returnType);

			                    if ((((AsignacionContext)_localctx).expresion!=null?_input.getText(((AsignacionContext)_localctx).expresion.start,((AsignacionContext)_localctx).expresion.stop):null).length() <= 0) {
			                        SymbolType type = TSLocal.containsKey((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null)) ? SymbolType.nameOf(TSLocal.get((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null))) : SymbolType.nameOf(TSGlobal.get((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null)));
			                        errorListener.addSemanticError(
			                            "Error: Falta asignar expression" +
			                            " a la variable (" + (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null) + ") de tipo " + type,
			                            ((AsignacionContext)_localctx).ID.getLine(),
			                            ((AsignacionContext)_localctx).ID.getCharPositionInLine()
			                        );
			                        throw new RecognitionException("Errror: Falta asignar expression a la variable" + (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null), null, _input, _localctx);
			                    }

			                    // Verificar si el tipo de la expression coincide con el tipo de la variable para asignarla
			                    if (TSLocal.containsKey((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null))) {
			                        if (TSLocal.get((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null)) != ((AsignacionContext)_localctx).expresion.returnType.ordinal()) {
			                            // System.out.println("Error: No se puede asignar un tipo " + ((AsignacionContext)_localctx).expresion.returnType + " a la variable (" + (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null) + ") de tipo "+SymbolType.nameOf(TSLocal.get((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null))));
			                            // Agregamos el error de semantica al errorListener en lugar de imprimirlo
			                            errorListener.addSemanticError(
			                                "No se puede asignar un tipo " + ((AsignacionContext)_localctx).expresion.returnType + 
			                                " a la variable (" + (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null) + ") de tipo " +
			                                SymbolType.nameOf(TSLocal.get((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null))),
			                                ((AsignacionContext)_localctx).ID.getLine(),
			                                ((AsignacionContext)_localctx).ID.getCharPositionInLine()
			                            );
			                        }
			                    } else if (TSGlobal.containsKey((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null))) {
			                        if (TSGlobal.get((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null)) != ((AsignacionContext)_localctx).expresion.returnType.ordinal()) {
			                            // System.out.println("Error: No se puede asignar un tipo" + ((AsignacionContext)_localctx).expresion.returnType + " a la variable (" + (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null) + ") de tipo " + SymbolType.nameOf(TSGlobal.get((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null))));
			                            // Agregamos el error de semantica al errorListener
			                            errorListener.addSemanticError(
			                                "No se puede asignar un tipo " + ((AsignacionContext)_localctx).expresion.returnType +
			                                " a la variable (" + (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null) + ") de tipo " +
			                                SymbolType.nameOf(TSGlobal.get((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null))),
			                                ((AsignacionContext)_localctx).ID.getLine(),
			                                ((AsignacionContext)_localctx).ID.getCharPositionInLine()
			                            );
			                        }
			                    } else {
			                       // System.out.println("Error: La variable " + (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null) + " no ha sido declarada");
			                       // Agregamos el error de semantica al errorListener
			                       errorListener.addSemanticError(
			                            "La variable " + (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null) + " no ha sido declarada",
			                            ((AsignacionContext)_localctx).ID.getLine(),
			                            ((AsignacionContext)_localctx).ID.getCharPositionInLine()
			                        );
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
	public static class DeclaracionContext extends ParserRuleContext {
		public TipoContext tipo;
		public Token id1;
		public ExpresionContext expr1;
		public Token id2;
		public ExpresionContext expr2;
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
		enterRule(_localctx, 26, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			((DeclaracionContext)_localctx).tipo = tipo();
			setState(162);
			((DeclaracionContext)_localctx).id1 = match(ID);
			 
			                // Pushemos las variables locales al hashmap
			                // Agregamos el token para obtener la linea y columna
			                pushTSLocal((((DeclaracionContext)_localctx).id1!=null?((DeclaracionContext)_localctx).id1.getText():null), SymbolType.valueOf(((((DeclaracionContext)_localctx).tipo!=null?_input.getText(((DeclaracionContext)_localctx).tipo.start,((DeclaracionContext)_localctx).tipo.stop):null)).toUpperCase()), ((DeclaracionContext)_localctx).id1);
			            
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(164);
				match(T__3);
				setState(165);
				((DeclaracionContext)_localctx).expr1 = expresion();
				 
				                    //  Verificar si el tipo de la expression coincide con el tipo de la variable para asignarla
				                    if (((DeclaracionContext)_localctx).expr1.returnType != SymbolType.nameOf(TSLocal.get((((DeclaracionContext)_localctx).id1!=null?((DeclaracionContext)_localctx).id1.getText():null)))) {
				                        // System.out.println("Error: Tipos de datos incompatibles");
				                        // Agregamos el error de semantica al errorListener
				                        errorListener.addSemanticError(
				                            "Tipos de datos incompatibles, no puedes asignar el tipo (" + ((DeclaracionContext)_localctx).expr1.returnType + ") a la variable " + (((DeclaracionContext)_localctx).id1!=null?((DeclaracionContext)_localctx).id1.getText():null) + " de tipo " + SymbolType.nameOf(TSLocal.get((((DeclaracionContext)_localctx).id1!=null?((DeclaracionContext)_localctx).id1.getText():null))),
				                            (((DeclaracionContext)_localctx).expr1!=null?(((DeclaracionContext)_localctx).expr1.start):null).getLine(),            // El primer token de la subregla
				                            (((DeclaracionContext)_localctx).expr1!=null?(((DeclaracionContext)_localctx).expr1.start):null).getCharPositionInLine()
				                        );
				                    }
				                
				}
			}

			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(170);
				match(T__4);
				setState(171);
				((DeclaracionContext)_localctx).id2 = match(ID);
				 
				                    // Pushemos las variables locales al hashmap
				                    // Agregamos el token para obtener la linea y columna
				                    pushTSLocal((((DeclaracionContext)_localctx).id2!=null?((DeclaracionContext)_localctx).id2.getText():null), SymbolType.valueOf(((((DeclaracionContext)_localctx).tipo!=null?_input.getText(((DeclaracionContext)_localctx).tipo.start,((DeclaracionContext)_localctx).tipo.stop):null)).toUpperCase()), ((DeclaracionContext)_localctx).id2);
				                
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(173);
					match(T__3);
					setState(174);
					((DeclaracionContext)_localctx).expr2 = expresion();
					 
					                        //  Verificar si el tipo de la expression coincide con el tipo de la variable para asignarla
					                        if (((DeclaracionContext)_localctx).expr2.returnType != SymbolType.nameOf(TSLocal.get((((DeclaracionContext)_localctx).id2!=null?((DeclaracionContext)_localctx).id2.getText():null)))) {
					                            // System.out.println("Error: Tipos de datos incompatibles");
					                            // Agregamos el error de semantica al errorListener
					                            errorListener.addSemanticError(
					                                "Tipos de datos incompatibles, no puedes asignar el tipo (" + ((DeclaracionContext)_localctx).expr2.returnType + ") a la variable " + (((DeclaracionContext)_localctx).id2!=null?((DeclaracionContext)_localctx).id2.getText():null) + " de tipo " + SymbolType.nameOf(TSLocal.get((((DeclaracionContext)_localctx).id2!=null?((DeclaracionContext)_localctx).id2.getText():null))),
					                                (((DeclaracionContext)_localctx).expr2!=null?(((DeclaracionContext)_localctx).expr2.start):null).getLine(),            // El primer token de la subregla
					                                (((DeclaracionContext)_localctx).expr2!=null?(((DeclaracionContext)_localctx).expr2.start):null).getCharPositionInLine()
					                            );
					                        }
					                    
					}
				}

				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
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
		public TipoContext tipo;
		public Token idArg1;
		public Token idArg2;
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
		enterRule(_localctx, 28, RULE_declaracion_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((Declaracion_argsContext)_localctx).tipo = tipo();
			setState(187);
			((Declaracion_argsContext)_localctx).idArg1 = match(ID);
			 
			                        // Pusheamos los parametros del metodo a variables locales
			                        pushTSLocal((((Declaracion_argsContext)_localctx).idArg1!=null?((Declaracion_argsContext)_localctx).idArg1.getText():null), SymbolType.valueOf(((((Declaracion_argsContext)_localctx).tipo!=null?_input.getText(((Declaracion_argsContext)_localctx).tipo.start,((Declaracion_argsContext)_localctx).tipo.stop):null)).toUpperCase()), ((Declaracion_argsContext)_localctx).idArg1);
			                    
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(189);
				match(T__4);
				setState(190);
				((Declaracion_argsContext)_localctx).tipo = tipo();
				setState(191);
				((Declaracion_argsContext)_localctx).idArg2 = match(ID);
				 
				                            // Pusheamos el segunto parametro si es que lo hay a TSLocal
				                            pushTSLocal((((Declaracion_argsContext)_localctx).idArg2!=null?((Declaracion_argsContext)_localctx).idArg2.getText():null), SymbolType.valueOf(((((Declaracion_argsContext)_localctx).tipo!=null?_input.getText(((Declaracion_argsContext)_localctx).tipo.start,((Declaracion_argsContext)_localctx).tipo.stop):null)).toUpperCase()), ((Declaracion_argsContext)_localctx).idArg2);
				                        
				}
				}
				setState(198);
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
		enterRule(_localctx, 30, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			((ExpresionContext)_localctx).m1 = multExp();
			 
			                                        ((ExpresionContext)_localctx).returnType = ((ExpresionContext)_localctx).m1.returnType;
			                                        //System.out.println("Expression: "+(((ExpresionContext)_localctx).m1!=null?_input.getText(((ExpresionContext)_localctx).m1.start,((ExpresionContext)_localctx).m1.stop):null) + " type: "+((ExpresionContext)_localctx).m1.returnType);
			                                    
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__8) {
				{
				{
				setState(201);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(202);
				((ExpresionContext)_localctx).m2 = multExp();

				                                            //System.out.println("Expression: "+(((ExpresionContext)_localctx).m2!=null?_input.getText(((ExpresionContext)_localctx).m2.start,((ExpresionContext)_localctx).m2.stop):null) + " type: "+((ExpresionContext)_localctx).m2.returnType);
				                                            if (((ExpresionContext)_localctx).m2.returnType != ((ExpresionContext)_localctx).m1.returnType) {
				                                                ((ExpresionContext)_localctx).returnType =  SymbolType.ERROR_TYPE;
				                                                // System.out.println("Error: Tipos de datos incompatibles");
				                                                // Agregamos el error de semantica al errorListener
				                                                errorListener.addSemanticError(
				                                                    "Tipos de datos incompatibles",
				                                                    (((ExpresionContext)_localctx).m2!=null?(((ExpresionContext)_localctx).m2.start):null).getLine(),            // El primer token de la subregla
				                                                    (((ExpresionContext)_localctx).m2!=null?(((ExpresionContext)_localctx).m2.start):null).getCharPositionInLine()
				                                                );
				                                            }
				                                        
				}
				}
				setState(209);
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
		enterRule(_localctx, 32, RULE_multExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			((MultExpContext)_localctx).a1 = atomExp();
			 
			                                        ((MultExpContext)_localctx).returnType = ((MultExpContext)_localctx).a1.returnType;
			                                    
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__10) {
				{
				{
				setState(212);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(213);
				((MultExpContext)_localctx).a2 = atomExp();
				 
				                                        if (((MultExpContext)_localctx).a2.returnType != ((MultExpContext)_localctx).a1.returnType) {
				                                            ((MultExpContext)_localctx).returnType =  SymbolType.ERROR_TYPE;
				                                            // System.out.println("Error: Tipos de datos incompatibles");
				                                            // Agregamos el error de semantica al errorListener
				                                            errorListener.addSemanticError(
				                                                "Tipos de datos incompatibles",
				                                                (((MultExpContext)_localctx).a2!=null?(((MultExpContext)_localctx).a2.start):null).getLine(),
				                                                (((MultExpContext)_localctx).a2!=null?(((MultExpContext)_localctx).a2.start):null).getCharPositionInLine()
				                                            );
				                                        }
				                                     
				}
				}
				setState(220);
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
		enterRule(_localctx, 34, RULE_atomExp);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(CINT);
				 ((AtomExpContext)_localctx).returnType = SymbolType.INT; 
				}
				break;
			case CDOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(CDOUBLE);
				 ((AtomExpContext)_localctx).returnType = SymbolType.DOUBLE; 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				((AtomExpContext)_localctx).ID = match(ID);
				 
				                                // Verify if the symbol is declared
				                                if (!TSLocal.containsKey((((AtomExpContext)_localctx).ID!=null?((AtomExpContext)_localctx).ID.getText():null)) && !TSGlobal.containsKey((((AtomExpContext)_localctx).ID!=null?((AtomExpContext)_localctx).ID.getText():null))) {
				                                    // System.out.println("Error: La variable "+(((AtomExpContext)_localctx).ID!=null?((AtomExpContext)_localctx).ID.getText():null)+" no ha sido declarada");
				                                    errorListener.addSemanticError(
				                                        "La variable '" + (((AtomExpContext)_localctx).ID!=null?((AtomExpContext)_localctx).ID.getText():null) + "' no ha sido declarada",
				                                        ((AtomExpContext)_localctx).ID.getLine(),
				                                        ((AtomExpContext)_localctx).ID.getCharPositionInLine()
				                                    );
				                                    // Marcamos el tipo de la variable como error
				                                    ((AtomExpContext)_localctx).returnType =  SymbolType.ERROR_TYPE;

				                                    break;
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
				setState(227);
				match(T__5);
				setState(228);
				((AtomExpContext)_localctx).expresion = expresion();
				 ((AtomExpContext)_localctx).returnType = ((AtomExpContext)_localctx).expresion.returnType; 
				setState(230);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparacionContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(sintaxisClassParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(sintaxisClassParser.NEQ, 0); }
		public TerminalNode GT() { return getToken(sintaxisClassParser.GT, 0); }
		public TerminalNode LT() { return getToken(sintaxisClassParser.LT, 0); }
		public TerminalNode GE() { return getToken(sintaxisClassParser.GE, 0); }
		public TerminalNode LE() { return getToken(sintaxisClassParser.LE, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			expresion();
			setState(235);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2113929216L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(236);
			expresion();
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
		"\u0004\u0001#\u00ef\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0004\u0000(\b\u0000\u000b\u0000\f\u0000)\u0001\u0001\u0003"+
		"\u0001-\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u00014\b\u0001\n\u0001\f\u00017\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0003\u0002=\b\u0002\u0001\u0003\u0003"+
		"\u0003@\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003R\b\u0003\u0005\u0003T\b\u0003\n\u0003\f\u0003W\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0003\u0004\\\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004c\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004i\b\u0004\n\u0004\f\u0004"+
		"l\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007w\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0086\b\n\n\n\f\n\u0089\t\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0090\b\n\n\n\f\n\u0093"+
		"\t\n\u0001\n\u0003\n\u0096\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u009a"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a9\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b2\b\r\u0005\r\u00b4"+
		"\b\r\n\r\f\r\u00b7\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00c3\b\u000e\n\u000e\f\u000e\u00c6\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ce\b\u000f\n"+
		"\u000f\f\u000f\u00d1\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00d9\b\u0010\n\u0010\f\u0010"+
		"\u00dc\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00e9\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0005\u0001\u0000"+
		"\u0014\u0016\u0001\u0000\r\u0011\u0001\u0000\b\t\u0001\u0000\n\u000b\u0001"+
		"\u0000\u0019\u001e\u00f7\u0000\'\u0001\u0000\u0000\u0000\u0002,\u0001"+
		"\u0000\u0000\u0000\u0004<\u0001\u0000\u0000\u0000\u0006?\u0001\u0000\u0000"+
		"\u0000\b[\u0001\u0000\u0000\u0000\np\u0001\u0000\u0000\u0000\fr\u0001"+
		"\u0000\u0000\u0000\u000ev\u0001\u0000\u0000\u0000\u0010x\u0001\u0000\u0000"+
		"\u0000\u0012|\u0001\u0000\u0000\u0000\u0014~\u0001\u0000\u0000\u0000\u0016"+
		"\u0099\u0001\u0000\u0000\u0000\u0018\u009b\u0001\u0000\u0000\u0000\u001a"+
		"\u00a1\u0001\u0000\u0000\u0000\u001c\u00ba\u0001\u0000\u0000\u0000\u001e"+
		"\u00c7\u0001\u0000\u0000\u0000 \u00d2\u0001\u0000\u0000\u0000\"\u00e8"+
		"\u0001\u0000\u0000\u0000$\u00ea\u0001\u0000\u0000\u0000&(\u0003\u0002"+
		"\u0001\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\'\u0001"+
		"\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0001\u0001\u0000\u0000"+
		"\u0000+-\u0003\n\u0005\u0000,+\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000./\u0005\u0001\u0000\u0000/0\u0005\"\u0000"+
		"\u000001\u0006\u0001\uffff\uffff\u000015\u0005\u0002\u0000\u000024\u0003"+
		"\u0004\u0002\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u000089\u0005\u0003\u0000\u00009\u0003\u0001"+
		"\u0000\u0000\u0000:=\u0003\u0006\u0003\u0000;=\u0003\b\u0004\u0000<:\u0001"+
		"\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=\u0005\u0001\u0000\u0000"+
		"\u0000>@\u0003\n\u0005\u0000?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000AB\u0003\f\u0006\u0000BC\u0005\"\u0000"+
		"\u0000CH\u0006\u0003\uffff\uffff\u0000DE\u0005\u0004\u0000\u0000EF\u0003"+
		"\u001e\u000f\u0000FG\u0006\u0003\uffff\uffff\u0000GI\u0001\u0000\u0000"+
		"\u0000HD\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IU\u0001\u0000"+
		"\u0000\u0000JK\u0005\u0005\u0000\u0000KL\u0005\"\u0000\u0000LQ\u0006\u0003"+
		"\uffff\uffff\u0000MN\u0005\u0004\u0000\u0000NO\u0003\u001e\u000f\u0000"+
		"OP\u0006\u0003\uffff\uffff\u0000PR\u0001\u0000\u0000\u0000QM\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SJ\u0001"+
		"\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000XY\u0005\f\u0000\u0000Y\u0007\u0001\u0000\u0000\u0000Z\\\u0003\n"+
		"\u0005\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]^\u0003\u000e\u0007\u0000^_\u0005\"\u0000\u0000_`\u0006"+
		"\u0004\uffff\uffff\u0000`b\u0005\u0006\u0000\u0000ac\u0003\u001c\u000e"+
		"\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000de\u0005\u0007\u0000\u0000ej\u0005\u0002\u0000\u0000fi\u0003"+
		"\u0016\u000b\u0000gi\u0003\u0012\t\u0000hf\u0001\u0000\u0000\u0000hg\u0001"+
		"\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000mn\u0005\u0003\u0000\u0000no\u0006\u0004\uffff\uffff\u0000o\t\u0001"+
		"\u0000\u0000\u0000pq\u0007\u0000\u0000\u0000q\u000b\u0001\u0000\u0000"+
		"\u0000rs\u0007\u0001\u0000\u0000s\r\u0001\u0000\u0000\u0000tw\u0003\f"+
		"\u0006\u0000uw\u0005\u0012\u0000\u0000vt\u0001\u0000\u0000\u0000vu\u0001"+
		"\u0000\u0000\u0000w\u000f\u0001\u0000\u0000\u0000xy\u0005\u0013\u0000"+
		"\u0000yz\u0003\u001e\u000f\u0000z{\u0005\f\u0000\u0000{\u0011\u0001\u0000"+
		"\u0000\u0000|}\u0003\u0014\n\u0000}\u0013\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\u0017\u0000\u0000\u007f\u0080\u0005\u0006\u0000\u0000\u0080\u0081"+
		"\u0003$\u0012\u0000\u0081\u0082\u0005\u0007\u0000\u0000\u0082\u0087\u0005"+
		"\u0002\u0000\u0000\u0083\u0086\u0003\u0016\u000b\u0000\u0084\u0086\u0003"+
		"\u0012\t\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u0095\u0005\u0003"+
		"\u0000\u0000\u008b\u008c\u0005\u0018\u0000\u0000\u008c\u0091\u0005\u0002"+
		"\u0000\u0000\u008d\u0090\u0003\u0016\u000b\u0000\u008e\u0090\u0003\u0012"+
		"\t\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0096\u0005\u0003\u0000"+
		"\u0000\u0095\u008b\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u0015\u0001\u0000\u0000\u0000\u0097\u009a\u0003\u0018\f\u0000"+
		"\u0098\u009a\u0003\u001a\r\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\u0017\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005\"\u0000\u0000\u009c\u009d\u0005\u0004\u0000\u0000\u009d\u009e"+
		"\u0003\u001e\u000f\u0000\u009e\u009f\u0006\f\uffff\uffff\u0000\u009f\u00a0"+
		"\u0005\f\u0000\u0000\u00a0\u0019\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003"+
		"\f\u0006\u0000\u00a2\u00a3\u0005\"\u0000\u0000\u00a3\u00a8\u0006\r\uffff"+
		"\uffff\u0000\u00a4\u00a5\u0005\u0004\u0000\u0000\u00a5\u00a6\u0003\u001e"+
		"\u000f\u0000\u00a6\u00a7\u0006\r\uffff\uffff\u0000\u00a7\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a9\u00b5\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0005"+
		"\u0000\u0000\u00ab\u00ac\u0005\"\u0000\u0000\u00ac\u00b1\u0006\r\uffff"+
		"\uffff\u0000\u00ad\u00ae\u0005\u0004\u0000\u0000\u00ae\u00af\u0003\u001e"+
		"\u000f\u0000\u00af\u00b0\u0006\r\uffff\uffff\u0000\u00b0\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00aa\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\f\u0000"+
		"\u0000\u00b9\u001b\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003\f\u0006\u0000"+
		"\u00bb\u00bc\u0005\"\u0000\u0000\u00bc\u00c4\u0006\u000e\uffff\uffff\u0000"+
		"\u00bd\u00be\u0005\u0005\u0000\u0000\u00be\u00bf\u0003\f\u0006\u0000\u00bf"+
		"\u00c0\u0005\"\u0000\u0000\u00c0\u00c1\u0006\u000e\uffff\uffff\u0000\u00c1"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c2\u00bd\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c5\u001d\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003 \u0010\u0000\u00c8\u00cf"+
		"\u0006\u000f\uffff\uffff\u0000\u00c9\u00ca\u0007\u0002\u0000\u0000\u00ca"+
		"\u00cb\u0003 \u0010\u0000\u00cb\u00cc\u0006\u000f\uffff\uffff\u0000\u00cc"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cd\u00c9\u0001\u0000\u0000\u0000\u00ce"+
		"\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u001f\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003\"\u0011\u0000\u00d3\u00da"+
		"\u0006\u0010\uffff\uffff\u0000\u00d4\u00d5\u0007\u0003\u0000\u0000\u00d5"+
		"\u00d6\u0003\"\u0011\u0000\u00d6\u00d7\u0006\u0010\uffff\uffff\u0000\u00d7"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000\u00d9"+
		"\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db!\u0001\u0000\u0000\u0000\u00dc\u00da"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0005!\u0000\u0000\u00de\u00e9\u0006"+
		"\u0011\uffff\uffff\u0000\u00df\u00e0\u0005 \u0000\u0000\u00e0\u00e9\u0006"+
		"\u0011\uffff\uffff\u0000\u00e1\u00e2\u0005\"\u0000\u0000\u00e2\u00e9\u0006"+
		"\u0011\uffff\uffff\u0000\u00e3\u00e4\u0005\u0006\u0000\u0000\u00e4\u00e5"+
		"\u0003\u001e\u000f\u0000\u00e5\u00e6\u0006\u0011\uffff\uffff\u0000\u00e6"+
		"\u00e7\u0005\u0007\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8"+
		"\u00dd\u0001\u0000\u0000\u0000\u00e8\u00df\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e8\u00e3\u0001\u0000\u0000\u0000\u00e9"+
		"#\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003\u001e\u000f\u0000\u00eb\u00ec"+
		"\u0007\u0004\u0000\u0000\u00ec\u00ed\u0003\u001e\u000f\u0000\u00ed%\u0001"+
		"\u0000\u0000\u0000\u001a),5<?HQU[bhjv\u0085\u0087\u008f\u0091\u0095\u0099"+
		"\u00a8\u00b1\u00b5\u00c4\u00cf\u00da\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}