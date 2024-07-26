package rey.bos.split_binary_tree;

import java.util.Objects;

public class Solution {

    public static int splitBinaryTree(BinaryTree tree) {
        int sum = findSum(tree);
        if (sum % 2 != 0 || sum == 0) {
            return 0;
        }
        TreeInfo info = new TreeInfo(sum / 2);
        subTreeExist(tree, info);
        return info.treeFound ? info.sum : 0;
    }
    
    private static class TreeInfo {
        boolean treeFound;
        int sum;
        
        public TreeInfo(int sum) {
            this.sum = sum;
        }

        @Override
        public String toString() {
            return "TreeInfo{" +
                "treeFound=" + treeFound +
                ", sum=" + sum +
                '}';
        }
    }
    
    private static int subTreeExist(BinaryTree tree, TreeInfo info) {
        if (tree == null) {
            return 0;
        }
        int leftSum = subTreeExist(tree.left, info);
        int rightSum = subTreeExist(tree.right, info);
        if (info.treeFound) {
            return 0;
        }
        if (leftSum == info.sum || rightSum == info.sum || leftSum + rightSum + tree.value == info.sum) {
            info.treeFound = true;
            return 0;
        }
        return leftSum + rightSum + tree.value;
    }
    
    private static int findSum(BinaryTree tree) {
        if (tree == null) {
            return 0;
        }
        return tree.value + findSum(tree.left) + findSum(tree.right);
    }

    public static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }

        public BinaryTree(int value, BinaryTree left, BinaryTree right) {
            this.value = value;
            this.left = left;
            this.right = right;
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

        @Override
        public String toString() {
            return "BinaryTree{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
        }
    }
    
}
