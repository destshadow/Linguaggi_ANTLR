import java.util.Scanner;

public class Brainfuck extends BrainfuckBaseVisitor<Byte> {

    byte[] byteArray = new byte[30000]; //già inizializzato a 0
    int pointer = 0;

    @Override
    public Byte visitMain(BrainfuckParser.MainContext ctx) {
        return visit(ctx.com());
    }

    @Override
    public Byte visitLt(BrainfuckParser.LtContext ctx) {
        pointer--;
        return visit(ctx.com());
    }

    @Override
    public Byte visitGt(BrainfuckParser.GtContext ctx) {
        pointer++;
        return visit(ctx.com());
    }

    @Override
    public Byte visitPlus(BrainfuckParser.PlusContext ctx) {
        byteArray[pointer]++;
        return visit(ctx.com());
    }

    @Override
    public Byte visitMinus(BrainfuckParser.MinusContext ctx) {
        byteArray[pointer]--;
        return visit(ctx.com());
    }

    @Override
    public Byte visitDot(BrainfuckParser.DotContext ctx) {
        if(byteArray[pointer] != 0)
            System.out.print(byteArray[pointer]);
        return visit(ctx.com());
    }


    @Override
    public Byte visitComma(BrainfuckParser.CommaContext ctx) {
        Scanner scanner = new Scanner(System.in);
        byte inputByte = scanner.nextByte();
        byteArray[pointer] = inputByte;
        return visit(ctx.com());
    }


    @Override
    public Byte visitLoop(BrainfuckParser.LoopContext ctx) {
        if(byteArray[pointer] == 0){
            return visit(ctx.com(1));
        }
        while(byteArray[pointer] != 0){
            visit(ctx.com(0));
        }
        visit(ctx.com(1));
        return null;
    }

    @Override
    public Byte visitNil(BrainfuckParser.NilContext ctx) {
        return visitChildren(ctx);
    }
}
