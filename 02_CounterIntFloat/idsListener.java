// Generated from ./ids.g by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link idsParser}.
 */
public interface idsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link idsParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(idsParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link idsParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(idsParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link idsParser#results}.
	 * @param ctx the parse tree
	 */
	void enterResults(idsParser.ResultsContext ctx);
	/**
	 * Exit a parse tree produced by {@link idsParser#results}.
	 * @param ctx the parse tree
	 */
	void exitResults(idsParser.ResultsContext ctx);
	/**
	 * Enter a parse tree produced by {@link idsParser#identificadores}.
	 * @param ctx the parse tree
	 */
	void enterIdentificadores(idsParser.IdentificadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link idsParser#identificadores}.
	 * @param ctx the parse tree
	 */
	void exitIdentificadores(idsParser.IdentificadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link idsParser#flotante}.
	 * @param ctx the parse tree
	 */
	void enterFlotante(idsParser.FlotanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link idsParser#flotante}.
	 * @param ctx the parse tree
	 */
	void exitFlotante(idsParser.FlotanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link idsParser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(idsParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link idsParser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(idsParser.EnteroContext ctx);
}