package rey.bos.balanced_binary_tree;

class Solution {
    
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftDepth = findDepth(root.left, 1);
        int rightDepth = findDepth(root.right, 1);
        return leftDepth != -1 && rightDepth != -1 && Math.abs(leftDepth - rightDepth) <= 1;
    }

    private int findDepth(TreeNode root, int depth) {
        if (depth == -1) {
            return depth;
        }
        if (root == null) {
            return depth;
        }
        depth++;
        if (root.left == null && root.right == null) {
            return depth;
        }
        int leftDepth = findDepth(root.left, depth);
        int rightDepth = findDepth(root.right, depth);
        if (Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }
        return Math.max(leftDepth, rightDepth);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}