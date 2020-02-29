package com.kyrlach.mylang;

import com.kyrlach.mylang.ast.AST;
import com.kyrlach.mylang.ast.AdditionExpression;
import com.kyrlach.mylang.ast.NumericLiteral;

import java.util.List;

public class Evaluator {
    public static int evaluate(AST syntaxTree) {
        int retval = 0;
        switch(syntaxTree.getKind()) {
            case NUMBER:
                NumericLiteral n = (NumericLiteral)syntaxTree;
                retval = n.getValue();
                break;
            case ADD:
                AdditionExpression ae = (AdditionExpression)syntaxTree;
                int lv = evaluate(ae.getLeft());
                int rv = evaluate(ae.getRight());
                retval = lv + rv;
                break;
        }
        return retval;
    }
}
