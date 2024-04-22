// Generated from C:/Users/amara/Desktop/es linguaggi/homework2/Homework2/src/IntExp.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IntExpParser}.
 */
public interface IntExpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IntExpParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(IntExpParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntExpParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(IntExpParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntExpParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(IntExpParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntExpParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(IntExpParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntExpParser#x}.
	 * @param ctx the parse tree
	 */
	void enterX(IntExpParser.XContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntExpParser#x}.
	 * @param ctx the parse tree
	 */
	void exitX(IntExpParser.XContext ctx);
}