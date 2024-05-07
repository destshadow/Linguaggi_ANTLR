// Generated from C:/Users/amara/Desktop/es linguaggi/homework3/Homework3/src/Brainfuck.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BrainfuckParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BrainfuckVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BrainfuckParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(BrainfuckParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCom(BrainfuckParser.ComContext ctx);
}