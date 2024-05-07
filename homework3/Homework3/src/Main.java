import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {

        ClassLoader cl = Thread.currentThread().getContextClassLoader(); //ricevo file in input
        InputStream is = cl.getResourceAsStream(args[0]); //stream di caratteri
        CharStream cs = CharStreams.fromStream(is); //aggiungo il metodo from stream alla firma del main per gestire l'errore

        BrainfuckLexer lexer = new BrainfuckLexer(cs); //lexer di brainfuck
        CommonTokenStream tokens = new CommonTokenStream(lexer); //tokenization, stream di token
        BrainfuckParser parser = new BrainfuckParser(tokens); //parser dei token


        ParseTree tree = parser.main(); //albero di parsing, il simbolo iniziale dal quale partire

        Brainfuck interpreter = new Brainfuck(); //nuova classe creata da me
        System.out.println(interpreter.visit(tree));
    }
}