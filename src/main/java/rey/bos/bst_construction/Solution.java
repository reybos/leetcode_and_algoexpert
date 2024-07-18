package rey.bos.bst_construction;

public class Solution {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            if (this.value > value) {
                if (this.left == null) {
                    this.left = new BST(value);
                } else {
                    this.left.insert(value);
                }
            } else {
                if (this.right == null) {
                    this.right = new BST(value);
                } else {
                    this.right.insert(value);
                }
            }
            return this;
        }

        public boolean contains(int value) {
            if (this.value == value) {
                return true;
            } else if (this.value > value) {
                return this.left != null && this.left.contains(value);
            } else {
                return this.right != null && this.right.contains(value);
            }
        }

        public BST remove(int value) {
            return this;
        }

    }

}
