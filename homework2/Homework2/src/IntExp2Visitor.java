// Generated from C:/Users/amara/Desktop/es linguaggi/homework2/Homework2/src/IntExp2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IntExp2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IntExp2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IntExp2Parser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(IntExp2Parser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nat}
	 * labeled alternative in {@link IntExp2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNat(IntExp2Parser.NatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link IntExp2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(IntExp2Parser.NegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link IntExp2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(IntExp2Parser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link IntExp2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(IntExp2Parser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link IntExp2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(IntExp2Parser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mod}
	 * labeled alternative in {@link IntExp2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(IntExp2Parser.ModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link IntExp2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(IntExp2Parser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntExp2Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(IntExp2Parser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntExp2Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(IntExp2Parser.ProgContext ctx);
}