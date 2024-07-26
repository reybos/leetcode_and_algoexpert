package rey.bos.split_binary_tree;

public class Main {

    public static void main(String[] args) {
        Solution.BinaryTree tree1 = new Solution.BinaryTree(2);
        tree1.right = new Solution.BinaryTree(2);
        Solution.BinaryTree tree2 = new Solution.BinaryTree(1);
        tree2.left = new Solution.BinaryTree(1);
        Solution.BinaryTree tree3 = new Solution.BinaryTree(1);
        tree3.right = new Solution.BinaryTree(3);
        tree3.left = new Solution.BinaryTree(2);
        Solution.BinaryTree tree4 = new Solution.BinaryTree(1);
        tree4.right = new Solution.BinaryTree(4);
        tree4.left = new Solution.BinaryTree(2);
        Solution.BinaryTree tree5 = new Solution.BinaryTree(1);
        Solution.BinaryTree tree6 = new Solution.BinaryTree(1);
        tree5.right = tree6;
        tree6.right = new Solution.BinaryTree(1);
        tree5.left = new Solution.BinaryTree(2);
        Solution.BinaryTree[] trees = new Solution.BinaryTree[]{
            new Solution.BinaryTree(0), new Solution.BinaryTree(1), new Solution.BinaryTree(-2),
            tree1, tree2, tree3, tree4, tree5
        };
        int[] expected = new int[] {0, 0, 0, 2, 1, 3, 0, 0};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.splitBinaryTree(trees[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }
    
}
