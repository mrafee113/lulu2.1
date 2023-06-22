package gen;
// Generated from C:/Users/mrafe/Desktop/test\lulu2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lulu2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lulu2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(lulu2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#ft_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFt_dcl(lulu2Parser.Ft_dclContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#func_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_dcl(lulu2Parser.Func_dclContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(lulu2Parser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#args_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_var(lulu2Parser.Args_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#type_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_dcl(lulu2Parser.Type_dclContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(lulu2Parser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#var_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_val(lulu2Parser.Var_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#ft_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFt_def(lulu2Parser.Ft_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_def(lulu2Parser.Type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(lulu2Parser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#access_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_modifier(lulu2Parser.Access_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#fun_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_def(lulu2Parser.Fun_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(lulu2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(lulu2Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(lulu2Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(lulu2Parser.RefContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(lulu2Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(lulu2Parser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(lulu2Parser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(lulu2Parser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#handle_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandle_call(lulu2Parser.Handle_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(lulu2Parser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#cond_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_stmt(lulu2Parser.Cond_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_stmt(lulu2Parser.Loop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(lulu2Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#const_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_val(lulu2Parser.Const_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#binary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_op(lulu2Parser.Binary_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2Parser#binary_op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_op2(lulu2Parser.Binary_op2Context ctx);
}