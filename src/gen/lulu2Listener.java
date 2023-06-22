// Generated from C:/Users/mrafe/Desktop/test\lulu2.g4 by ANTLR 4.7.2
package gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lulu2Parser}.
 */
public interface lulu2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(lulu2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(lulu2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#ft_dcl}.
	 * @param ctx the parse tree
	 */
	void enterFt_dcl(lulu2Parser.Ft_dclContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#ft_dcl}.
	 * @param ctx the parse tree
	 */
	void exitFt_dcl(lulu2Parser.Ft_dclContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#func_dcl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_dcl(lulu2Parser.Func_dclContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#func_dcl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_dcl(lulu2Parser.Func_dclContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(lulu2Parser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(lulu2Parser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#args_var}.
	 * @param ctx the parse tree
	 */
	void enterArgs_var(lulu2Parser.Args_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#args_var}.
	 * @param ctx the parse tree
	 */
	void exitArgs_var(lulu2Parser.Args_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#type_dcl}.
	 * @param ctx the parse tree
	 */
	void enterType_dcl(lulu2Parser.Type_dclContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#type_dcl}.
	 * @param ctx the parse tree
	 */
	void exitType_dcl(lulu2Parser.Type_dclContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(lulu2Parser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(lulu2Parser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#var_val}.
	 * @param ctx the parse tree
	 */
	void enterVar_val(lulu2Parser.Var_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#var_val}.
	 * @param ctx the parse tree
	 */
	void exitVar_val(lulu2Parser.Var_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#ft_def}.
	 * @param ctx the parse tree
	 */
	void enterFt_def(lulu2Parser.Ft_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#ft_def}.
	 * @param ctx the parse tree
	 */
	void exitFt_def(lulu2Parser.Ft_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#type_def}.
	 * @param ctx the parse tree
	 */
	void enterType_def(lulu2Parser.Type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#type_def}.
	 * @param ctx the parse tree
	 */
	void exitType_def(lulu2Parser.Type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(lulu2Parser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(lulu2Parser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_modifier(lulu2Parser.Access_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_modifier(lulu2Parser.Access_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#fun_def}.
	 * @param ctx the parse tree
	 */
	void enterFun_def(lulu2Parser.Fun_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#fun_def}.
	 * @param ctx the parse tree
	 */
	void exitFun_def(lulu2Parser.Fun_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(lulu2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(lulu2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(lulu2Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(lulu2Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(lulu2Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(lulu2Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(lulu2Parser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(lulu2Parser.RefContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(lulu2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(lulu2Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(lulu2Parser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(lulu2Parser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(lulu2Parser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(lulu2Parser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(lulu2Parser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(lulu2Parser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#handle_call}.
	 * @param ctx the parse tree
	 */
	void enterHandle_call(lulu2Parser.Handle_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#handle_call}.
	 * @param ctx the parse tree
	 */
	void exitHandle_call(lulu2Parser.Handle_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(lulu2Parser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(lulu2Parser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCond_stmt(lulu2Parser.Cond_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCond_stmt(lulu2Parser.Cond_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stmt(lulu2Parser.Loop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stmt(lulu2Parser.Loop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(lulu2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(lulu2Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#const_val}.
	 * @param ctx the parse tree
	 */
	void enterConst_val(lulu2Parser.Const_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#const_val}.
	 * @param ctx the parse tree
	 */
	void exitConst_val(lulu2Parser.Const_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#binary_op}.
	 * @param ctx the parse tree
	 */
	void enterBinary_op(lulu2Parser.Binary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#binary_op}.
	 * @param ctx the parse tree
	 */
	void exitBinary_op(lulu2Parser.Binary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2Parser#binary_op2}.
	 * @param ctx the parse tree
	 */
	void enterBinary_op2(lulu2Parser.Binary_op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2Parser#binary_op2}.
	 * @param ctx the parse tree
	 */
	void exitBinary_op2(lulu2Parser.Binary_op2Context ctx);
}