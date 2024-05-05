package rey.bos.evaluate_expression_tree;

import rey.bos.branch_sums.BST;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<BST> trees = List.of(
                new BST(-1,
                        new BST(-2,
                                new BST(-4,
                                        new BST(2, null, null),
                                        new BST(3, null, null)),
                                new BST(2, null, null)),
                        new BST(-3,
                                new BST(8, null, null),
                                new BST(3, null, null)))
        );
        List<Integer> expected = List.of(6);

        for (int i = 0; i < trees.size(); i++) {
            if (expected.get(i).equals(Solution.evaluateExpressionTree(trees.get(i)))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
