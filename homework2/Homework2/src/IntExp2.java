public class IntExp2 extends IntExp2BaseVisitor<Integer> {

    @Override
    public Integer visitMain(IntExp2Parser.MainContext ctx) {
        return visit(ctx.exp());
    }

    @Override
    public Integer visitMul(IntExp2Parser.MulContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));
        return left * right;
    }

    @Override
    public Integer visitPlus(IntExp2Parser.PlusContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));
        return left + right;
    }

    @Override
    public Integer visitNat(IntExp2Parser.NatContext ctx) {
        return Integer.parseInt(ctx.NAT().getText());
    }

    public Integer visitNeg(IntExp2Parser.NegContext ctx) {
        return Integer.parseInt(ctx.NEG().getText());
    }

    @Override
    public Integer visitSub(IntExp2Parser.SubContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));
        return left - right;
    }

    @Override
    public Integer visitDiv(IntExp2Parser.DivContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));
        return left / right;
    }

    public Integer visitMod(IntExp2Parser.ModContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));
        return left % right;
    }
}
