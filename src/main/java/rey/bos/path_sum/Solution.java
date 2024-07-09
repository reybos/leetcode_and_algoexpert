package rey.bos.path_sum;

public class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        } else if (root != null && root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, targetSum, root.val) || hasPathSum(root.right, targetSum, root.val);
    }

    private boolean hasPathSum(TreeNode root, int targetSum, int sum) {
        if (root == null) {
            return false;
        } else if (root.left == null && root.right == null) {
            return root.val + sum == targetSum;
        }
        return hasPathSum(root.left, targetSum, root.val + sum)
            || hasPathSum(root.right, targetSum, root.val + sum);
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
