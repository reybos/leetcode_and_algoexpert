package rey.bos.closest_value_in_bst;

public class Solution {

    public static int findClosestValueInBst(BST tree, int target) {
        int difference = Math.abs(tree.value - target);
        int closestValue = tree.value;
        while (tree != null) {
            if (difference > Math.abs(tree.value - target)) {
                difference = Math.abs(tree.value - target);
                closestValue = tree.value;
            }
            if (difference == 0) {
                break;
            }
            tree = tree.value > target ? tree.left : tree.right;        
        }
        return closestValue;
    }

    public static class BST {

        public int value;
        public BST left;
        public BST right;

        public BST(int value, BST left, BST right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

    }

}
