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
            if (this.left != null || this.right != null) {

            }
            return this;
        }

        private void remove(int value, BST nod, BST root) {
            if (nod.value == value) {

            } else if (nod.value > value) {
                if (nod.left != null) {
                    remove(value, nod.left, nod);
                }
            } else {
                if (nod.right != null) {
                    remove(value, nod.right, nod);
                }
            }
        }

        private int min(BST root) {
            if (root.left == null) {
                return root.value;
            }
            return min(root.left);
        }

    }

}
