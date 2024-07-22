package rey.bos.reconstruct_bst;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {10, 4, 2, 1, 5, 17, 19, 18}, new int[] {100}, new int[] {10, 11, 12, 13}
        };
        Solution.BST[] expected = new Solution.BST[] {
            new Solution.BST(
                10,
                new Solution.BST(
                    4,
                    new Solution.BST(2, new Solution.BST(1), null),
                    new Solution.BST(5)
                ),
                new Solution.BST(
                    17,
                    null,
                    new Solution.BST(
                        19,
                        new Solution.BST(18),
                        null
                    )
                )
            ),
            new Solution.BST(100),
            new Solution.BST(
                10,
                null,
                new Solution.BST(
                    11,
                    null,
                    new Solution.BST(
                        12,
                        null,
                        new Solution.BST(13)
                    )
                )
            )
        };
        for (int i = 0; i < arrays.length; i++) {
            if (Objects.equals(Solution.reconstructBst(arrays[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }
    
}
