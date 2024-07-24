package rey.bos.find_successor;

import java.util.Objects;

public class Solution {

    public static BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        TreeInfo info = new TreeInfo();
        findNode(tree, node, info);
        BinaryTree curr = info.tree;
        if (curr.right == null) {
            while (curr != null) {
                if (curr.parent != null && curr.parent.left != null && curr.parent.left.equals(curr)) {
                    return curr.parent;
                }
                curr = curr.parent;
            }
        } else {
            curr = curr.right;
            if (curr.left != null) {
                while (curr.left != null) {
                    curr = curr.left;
                }
            }
        }
        return curr;
    }

    private static void findNode(BinaryTree tree, BinaryTree node, TreeInfo info) {
        if (info.tree != null || tree == null) {
            return;
        }
        if (tree.equals(node)) {
            info.tree = tree;
            return;
        }
        findNode(tree.left, node, info);
        findNode(tree.right, node, info);
    }

    private static class TreeInfo {
        BinaryTree tree;
    }

    public static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }

        public BinaryTree(int value, BinaryTree left, BinaryTree right, BinaryTree parent) {
            this.value = value;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof BinaryTree that)) return false;
            return value == that.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }

}
