package rey.bos.repair_bst;

public class Solution {

    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    private static BST node1;
    private static BST node2;
    private static BST prevNode;

    public static void repairBst(BST tree) {
        findIncorrect(tree);
        int temp = node1.value;
        node1.value = node2.value;
        node2.value = temp;
    }
    
    private static void findIncorrect(BST tree) {
        if (tree == null) {
            return;
        }
        findIncorrect(tree.left);
        if (prevNode != null && prevNode.value > tree.value) {
            if (node1 == null) {
                node1 = prevNode;
            }
            node2 = tree;
        }
        prevNode = tree;
        findIncorrect(tree.right);
    }

}
