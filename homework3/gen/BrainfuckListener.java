// Generated from C:/Users/amara/Desktop/es linguaggi/homework3/Homework3/src/Brainfuck.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BrainfuckParser}.
 */
public interface BrainfuckListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BrainfuckParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(BrainfuckParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrainfuckParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(BrainfuckParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void enterCom(BrainfuckParser.ComContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void exitCom(BrainfuckParser.ComContext ctx);
}