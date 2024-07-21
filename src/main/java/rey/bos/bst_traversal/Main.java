package rey.bos.bst_traversal;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Solution.BST> input = List.of(
            new Solution.BST(
                10,
                new Solution.BST(
                    5,
                    new Solution.BST(2, new Solution.BST(1), null),
                    new Solution.BST(5)),
                new Solution.BST(15, null, new Solution.BST(22))
            )
        );
        int[][] expectedInOrder = new int[][] {
            new int[] {1, 2, 5, 5, 10, 15, 22}
        };
        int[][] expectedPreOrder = new int[][] {
            new int[] {10, 5, 2, 1, 5, 15, 22}
        };
        int[][] expectedPostOrder = new int[][] {
            new int[] {1, 2, 5, 5, 22, 15, 10}
        };
        for (int i = 0; i < expectedInOrder.length; i++) {
            if (
                Arrays.equals(Solution.inOrderTraverse(input.get(i)), expectedInOrder[i])
                && Arrays.equals(Solution.preOrderTraverse(input.get(i)), expectedPreOrder[i])
                && Arrays.equals(Solution.postOrderTraverse(input.get(i)), expectedPostOrder[i])
            ) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
