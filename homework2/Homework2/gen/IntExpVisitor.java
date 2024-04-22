// Generated from C:/Users/amara/Desktop/es linguaggi/homework2/Homework2/src/IntExp.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IntExpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IntExpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IntExpParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(IntExpParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntExpParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(IntExpParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntExpParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX(IntExpParser.XContext ctx);
}