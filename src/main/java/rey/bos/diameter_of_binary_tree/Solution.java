package rey.bos.diameter_of_binary_tree;

class Solution {
    
    public int diameterOfBinaryTree(TreeNode root) {
        TreeInfo info = infoOfBinaryTree(root);
        return info.diameter;
    }

    public TreeInfo infoOfBinaryTree(TreeNode root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = infoOfBinaryTree(root.left);
        TreeInfo right = infoOfBinaryTree(root.right);
        int diameter = Math.max(
            (left.length + right.length),
            Math.max(left.diameter, right.diameter)
        );
        int length = Math.max(left.length, right.length) + 1;
        return new TreeInfo(length, diameter);
    }

    public static class TreeInfo {
        int length;
        int diameter;

        public TreeInfo(int length, int diameter) {
            this.length = length;
            this.diameter = diameter;
        }
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