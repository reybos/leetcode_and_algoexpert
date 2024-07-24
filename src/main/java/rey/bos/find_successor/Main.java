package rey.bos.find_successor;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Solution.BinaryTree tree1 = new Solution.BinaryTree(1);
        Solution.BinaryTree tree2 = new Solution.BinaryTree(2);
        Solution.BinaryTree tree3 = new Solution.BinaryTree(3);
        tree1.left = tree2;
        tree2.parent = tree1;
        tree1.right = tree3;
        tree3.parent = tree1;
        Solution.BinaryTree tree4 = new Solution.BinaryTree(4);
        Solution.BinaryTree tree5 = new Solution.BinaryTree(5);
        tree2.left = tree4;
        tree4.parent = tree2;
        tree2.right = tree5;
        tree5.parent = tree2;
        Solution.BinaryTree tree6 = new Solution.BinaryTree(6);
        tree4.left = tree6;
        tree6.parent = tree4;
        Solution.BinaryTree[] nodes = new Solution.BinaryTree[] {
            new Solution.BinaryTree(1), new Solution.BinaryTree(2), new Solution.BinaryTree(3),
            new Solution.BinaryTree(4), new Solution.BinaryTree(5), new Solution.BinaryTree(6)
        };
        Solution.BinaryTree[] expected = new Solution.BinaryTree[] {
            new Solution.BinaryTree(3), new Solution.BinaryTree(5), null,
            new Solution.BinaryTree(2), new Solution.BinaryTree(1), new Solution.BinaryTree(4)
        };
        for (int i = 0; i < expected.length; i++) {
            if (Objects.equals(Solution.findSuccessor(tree1, nodes[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
