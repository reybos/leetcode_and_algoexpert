package rey.bos.validate_bst;

class Solution {

    public boolean isValidBST(TreeNode root) {
        return isValid(root.val, Long.MIN_VALUE, root.left)
            && isValid(Long.MAX_VALUE, root.val, root.right);
    }

    private boolean isValid(long maxValue, long minValue, TreeNode node) {
        if (node == null) {
            return true;
        }
        if (node.left == null && node.right == null) {
            return node.val > minValue && maxValue > node.val;
        }
        return node.val > minValue && maxValue > node.val
            && isValid(node.val, minValue, node.left)
            && isValid(maxValue, node.val, node.right);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
