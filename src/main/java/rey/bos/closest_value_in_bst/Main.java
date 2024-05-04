package rey.bos.closest_value_in_bst;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Solution.BST> trees = List.of(
                new Solution.BST(10, new Solution.BST(5, null, null), new Solution.BST(15, null, null)),
                new Solution.BST(10, new Solution.BST(5, null, null), new Solution.BST(15, null, null))
        );
        int[] target = new int[]{13, 5};
        int[] expected = new int[]{15, 5};

        for (int i = 0; i < target.length; i++) {
            if (rey.bos.closest_value_in_bst.Solution.findClosestValueInBst(trees.get(i), target[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
