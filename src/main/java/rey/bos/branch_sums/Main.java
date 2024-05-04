package rey.bos.branch_sums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<BST> trees = List.of(
                new BST(10, new BST(5, null, null), new BST(15, null, null)),
                new BST(1,
                        new BST(2,
                                new BST(4,
                                        new BST(8, null, null),
                                        new BST(9, null, null)),
                                new BST(5,
                                        new BST(10, null, null),
                                        null)),
                        new BST(3,
                                new BST(6, null, null),
                                new BST(7, null, null)))
        );
        List<List<Integer>> expected = List.of(
                List.of(15, 25), List.of(10, 11, 15, 16, 18)
        );

        for (int i = 0; i < trees.size(); i++) {
            if (expected.get(i).equals(Solution.getBranchSum(trees.get(i)))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
