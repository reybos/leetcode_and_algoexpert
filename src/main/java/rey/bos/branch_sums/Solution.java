package rey.bos.branch_sums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static List<Integer> getBranchSum(BST tree) {
        List<Integer> result = new ArrayList<>();
        getBranchSum(tree, 0, result);
        Collections.sort(result);
        return result;
    }

    private static void getBranchSum(BST tree, int prevSum, List<Integer> result) {
        if (tree == null) {
            return;
        }
        prevSum += tree.value;
        if (tree.left == null && tree.right == null) {
            result.add(prevSum);
            return;
        }
        getBranchSum(tree.left, prevSum, result);
        getBranchSum(tree.right, prevSum, result);
    }

}
