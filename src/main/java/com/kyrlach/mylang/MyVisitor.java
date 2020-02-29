package com.kyrlach.mylang;

import com.kyrlach.mylang.ast.AdditionExpression;
import com.kyrlach.mylang.parsing.MyLangBaseVisitor;
import com.kyrlach.mylang.parsing.MyLangParser;
import com.kyrlach.mylang.ast.NumericLiteral;
import com.kyrlach.mylang.ast.AST;

public class MyVisitor extends MyLangBaseVisitor<AST> {
    @Override
    public AST visitLiteral(MyLangParser.LiteralContext ctx) {
        int n = Integer.parseInt(ctx.NUMBER().getText());
        return new NumericLiteral(n);
    }

    @Override
    public AST visitAdd(MyLangParser.AddContext ctx) {
        AST left = ctx.getChild(0).accept(this);
        AST right = ctx.getChild(2).accept(this);
        return new AdditionExpression(left, right);
    }

    @Override
    public AST visitLit(MyLangParser.LitContext ctx) {
        return new NumericLiteral(Integer.parseInt(ctx.literal().getText()));
    }

    @Override
    public AST visitFile(MyLangParser.FileContext ctx) {
        return ctx.exp().accept(this);
    }
}
