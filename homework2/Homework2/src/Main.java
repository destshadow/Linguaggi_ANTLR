import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        ClassLoader cl = Thread.currentThread().getContextClassLoader();

        InputStream is = cl.getResourceAsStream(args[0]);

        CharStream cs = CharStreams.fromStream(is);

        IntExp2Lexer lexer = new IntExp2Lexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        IntExp2Parser parser = new IntExp2Parser(tokens);

        ParseTree tree = parser.main();

        IntExp2 interpreter = new IntExp2();
        System.out.println(interpreter.visit(tree));
    }
}