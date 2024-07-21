package rey.bos.min_height_bst;

import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        int[][] input = new int[][] {
            new int[] {1, 2, 5, 7, 10, 13, 14, 15, 22},
            new int[] {1}, new int[] {1, 2}, new int[] {1, 2, 5}, new int[] {1, 2, 5, 7}
        };
        List<Solution.BST> expected = List.of(
            new Solution.BST(
                10,
                new Solution.BST(
                    2,
                    new Solution.BST(1),
                    new Solution.BST(5, null, new Solution.BST(7))
                ),
                new Solution.BST(
                    14,
                    new Solution.BST(13),
                    new Solution.BST(15, null, new Solution.BST(22))
                )
            ),
            new Solution.BST(1),
            new Solution.BST(1, null, new Solution.BST(2)),
            new Solution.BST(2, new Solution.BST(1), new Solution.BST(5)),
            new Solution.BST(2, new Solution.BST(1), new Solution.BST(5, null, new Solution.BST(7)))
        );
        for (int i = 0; i < input.length; i++) {
            if (Objects.equals(Solution.minHeightBst(input[i]), expected.get(i))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
