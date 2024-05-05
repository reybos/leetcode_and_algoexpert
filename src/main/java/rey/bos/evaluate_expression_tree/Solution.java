package rey.bos.evaluate_expression_tree;

import rey.bos.branch_sums.BST;

public class Solution {

    public static int evaluateExpressionTree(BST tree) {
        if (tree.value >= 0) {
            return tree.value;
        }
        int left = evaluateExpressionTree(tree.left);
        int right = evaluateExpressionTree(tree.right);
        switch(tree.value) {
            case -1:
                return left + right;
            case -2:
                return left - right;
            case -3:
                return left / right;
            case -4:
                return left * right;
            default:
                throw new IllegalArgumentException("feee");
        }
    }

}
