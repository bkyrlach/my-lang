package com.kyrlach.mylang;

import com.kyrlach.mylang.parsing.MyLangBaseVisitor;
import com.kyrlach.mylang.parsing.MyLangParser;
import com.kyrlach.mylang.ast.Number;
import com.kyrlach.mylang.ast.AST;

public class MyVisitor extends MyLangBaseVisitor<AST> {
    @Override
    public AST visitLiteral(MyLangParser.LiteralContext ctx) {
        int n = Integer.parseInt(ctx.NUMBER().getText());
        return new Number(n);
    }
}
