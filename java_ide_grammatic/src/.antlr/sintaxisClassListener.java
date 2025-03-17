// Generated from c:/Users/carlo/Documents/LenguajesAutomatasJava/java_ide_grammatic/src/sintaxisClass.g by ANTLR 4.13.1

    import java.util.HashMap;
    import org.antlr.v4.runtime.Token; // Para acceder a getLine(), getCharPositionInLine()

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sintaxisClassParser}.
 */
public interface sintaxisClassListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(sintaxisClassParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(sintaxisClassParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#class_}.
	 * @param ctx the parse tree
	 */
	void enterClass_(sintaxisClassParser.Class_Context ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#class_}.
	 * @param ctx the parse tree
	 */
	void exitClass_(sintaxisClassParser.Class_Context ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(sintaxisClassParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(sintaxisClassParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(sintaxisClassParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(sintaxisClassParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(sintaxisClassParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(sintaxisClassParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#modificAcceso}.
	 * @param ctx the parse tree
	 */
	void enterModificAcceso(sintaxisClassParser.ModificAccesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#modificAcceso}.
	 * @param ctx the parse tree
	 */
	void exitModificAcceso(sintaxisClassParser.ModificAccesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(sintaxisClassParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(sintaxisClassParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#returnTypeMethods}.
	 * @param ctx the parse tree
	 */
	void enterReturnTypeMethods(sintaxisClassParser.ReturnTypeMethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#returnTypeMethods}.
	 * @param ctx the parse tree
	 */
	void exitReturnTypeMethods(sintaxisClassParser.ReturnTypeMethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#returnExpMethods}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpMethods(sintaxisClassParser.ReturnExpMethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#returnExpMethods}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpMethods(sintaxisClassParser.ReturnExpMethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void enterControl_structure(sintaxisClassParser.Control_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void exitControl_structure(sintaxisClassParser.Control_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(sintaxisClassParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(sintaxisClassParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(sintaxisClassParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(sintaxisClassParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(sintaxisClassParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(sintaxisClassParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(sintaxisClassParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(sintaxisClassParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#declaracion_args}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_args(sintaxisClassParser.Declaracion_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#declaracion_args}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_args(sintaxisClassParser.Declaracion_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(sintaxisClassParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(sintaxisClassParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#multExp}.
	 * @param ctx the parse tree
	 */
	void enterMultExp(sintaxisClassParser.MultExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#multExp}.
	 * @param ctx the parse tree
	 */
	void exitMultExp(sintaxisClassParser.MultExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(sintaxisClassParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(sintaxisClassParser.AtomExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxisClassParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(sintaxisClassParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxisClassParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(sintaxisClassParser.ComparacionContext ctx);
}