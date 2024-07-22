package rey.bos.find_kth_largest_value_in_bst;

public class Main {

    public static void main(String[] args) {
        Solution.BST input = new Solution.BST(
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
        );
        System.out.println(input);
        int[] ks = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expected = new int[] {22, 15, 14, 13, 10, 7, 5, 2, 1};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.findKthLargestValueInBst(input, ks[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }
    
}
