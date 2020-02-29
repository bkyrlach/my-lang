package com.kyrlach.mylang.ast;

public class Number extends AST {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Numeric Literal: " + value;
    }
}
