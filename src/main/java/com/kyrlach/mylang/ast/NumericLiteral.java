package com.kyrlach.mylang.ast;

public class NumericLiteral extends AST {
    private int value;

    public NumericLiteral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


    @Override
    public ASTKind getKind() {
        return ASTKind.NUMBER;
    }
}
