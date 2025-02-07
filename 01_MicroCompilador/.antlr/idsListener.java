// Generated from c:/Users/carlo/Documents/LenguajesAutomatasJava/01_MicroCompilador/ids.g by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link idsParser#identificadores}.
	 * @param ctx the parse tree
	 */
	void enterIdentificadores(idsParser.IdentificadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link idsParser#identificadores}.
	 * @param ctx the parse tree
	 */
	void exitIdentificadores(idsParser.IdentificadoresContext ctx);
}