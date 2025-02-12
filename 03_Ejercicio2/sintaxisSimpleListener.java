// Generated from ./sintaxisSimple.g by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sintaxisSimpleParser}.
 */
public interface sintaxisSimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sintaxisSimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(sintaxisSimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisSimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(sintaxisSimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisSimpleParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(sintaxisSimpleParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisSimpleParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(sintaxisSimpleParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisSimpleParser#modificAcceso}.
	 * @param ctx the parse tree
	 */
	void enterModificAcceso(sintaxisSimpleParser.ModificAccesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisSimpleParser#modificAcceso}.
	 * @param ctx the parse tree
	 */
	void exitModificAcceso(sintaxisSimpleParser.ModificAccesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisSimpleParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(sintaxisSimpleParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisSimpleParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(sintaxisSimpleParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisSimpleParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(sintaxisSimpleParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisSimpleParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(sintaxisSimpleParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisSimpleParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(sintaxisSimpleParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisSimpleParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(sintaxisSimpleParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisSimpleParser#multExp}.
	 * @param ctx the parse tree
	 */
	void enterMultExp(sintaxisSimpleParser.MultExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisSimpleParser#multExp}.
	 * @param ctx the parse tree
	 */
	void exitMultExp(sintaxisSimpleParser.MultExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisSimpleParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(sintaxisSimpleParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisSimpleParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(sintaxisSimpleParser.AtomExpContext ctx);
}