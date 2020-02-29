package com.kyrlach.mylang.ast;

public class AdditionExpression extends AST {
    private final AST left;
    private final AST right;

    public AdditionExpression(AST left, AST right) {
        this.left = left;
        this.right = right;
    }

    public AST getLeft() {
        return left;
    }

    public AST getRight() {
        return right;
    }

    @Override
    public ASTKind getKind() {
        return ASTKind.ADD;
    }

}
