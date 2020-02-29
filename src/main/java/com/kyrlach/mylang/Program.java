package com.kyrlach.mylang;

import com.kyrlach.mylang.parsing.MyLangLexer;
import com.kyrlach.mylang.parsing.MyLangParser;
import com.kyrlach.mylang.ast.AST;
import org.antlr.v4.runtime.*;

public class Program {
    public static void main(String[] args) {
        String content = "1 + 2 + 3";

        MyLangLexer lexer = new MyLangLexer(CharStreams.fromString(content));
        TokenStream tokens = new CommonTokenStream(lexer);
        MyLangParser parser = new MyLangParser(tokens);

        MyVisitor visitor = new MyVisitor();
        AST syntaxTree = visitor.visit(parser.file());

        System.out.println(syntaxTree);

        System.out.println(Evaluator.evaluate(syntaxTree));
    }
}
