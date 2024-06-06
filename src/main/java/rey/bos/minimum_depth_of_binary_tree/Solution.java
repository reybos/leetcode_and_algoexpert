package rey.bos.minimum_depth_of_binary_tree;

class Solution {

    public int minDepth(TreeNode root) {
        return findDepth(root, 0);
    }

    private int findDepth(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        depth++;
        if (root.left == null && root.right == null) {
            return depth;
        }
        int leftDepth = root.left == null ? 100001 : findDepth(root.left, depth);
        int rightDepth = root.right == null ? 100001 : findDepth(root.right, depth);
        return Math.min(leftDepth, rightDepth);
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