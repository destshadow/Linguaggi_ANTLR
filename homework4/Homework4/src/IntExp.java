public class IntExp extends IntExpBaseVisitor<Float>{
    @Override
    public Float visitMain(IntExpParser.MainContext ctx){
        return visit(ctx.prog());
    }

    @Override
    public Float visitProg(IntExpParser.ProgContext ctx){
        return visit(ctx.init());
    }

    @Override
    public Float visitIdinit(IntExpParser.IdinitContext ctx){
        return visit(ctx.exp());
    }

    @Override
    public Float visitNilinit(IntExpParser.NilinitContext ctx){
        return null;
    }

    @Override
    public Float visitDivMulMod(IntExpParser.DivMulModContext ctx){
        return switch (ctx.op.getType()) {
            case IntExpParser.DIV -> visit(ctx.exp(0)) / visit(ctx.exp(1));
            case IntExpParser.MUL -> visit(ctx.exp(0)) * visit(ctx.exp(1));
            case IntExpParser.MOD -> visit(ctx.exp(0)) % visit(ctx.exp(1));
            default -> 0.0f;
        };
    }

    @Override
    public  Float visitPlusMinus(IntExpParser.PlusMinusContext ctx){
        return switch (ctx.op.getType()){
            case IntExpParser.MINUS -> visit(ctx.exp(0)) - visit(ctx.exp(1));
            case IntExpParser.PLUS -> visit(ctx.exp(0)) + visit(ctx.exp(1));
            default -> 0.0f;
        };
    }

    @Override
    public Float visitParExp(IntExpParser.ParExpContext ctx){
        return visit(ctx.exp());
    }

    @Override
    public Float visitNum(IntExpParser.NumContext ctx){
        return Float.parseFloat(ctx.FLOAT().getText());
    }

    @Override
    public Float visitPow(IntExpParser.PowContext ctx){
        return (float) Math.pow( visit(ctx.exp(0)),  visit(ctx.exp(1)));
    }

    @Override
    public Float visitId(IntExpParser.IdContext ctx){
        return Float.parseFloat(ctx.ID().getText());
    }

}
