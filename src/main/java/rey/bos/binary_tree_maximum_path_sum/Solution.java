package rey.bos.binary_tree_maximum_path_sum;

class Solution {
    public int maxPathSum(TreeNode root) {
        BranchInfo left = calc(root.left);
        BranchInfo right = calc(root.right);
        int maxPath = Math.max(left.maxPath, right.maxPath);
        int maxBranch = Math.max(
            Math.max(root.val, root.val + left.maxBranch + right.maxBranch),
            Math.max(root.val + right.maxBranch, root.val + left.maxBranch)
        );
        return Math.max(maxPath, maxBranch);
    }

    private BranchInfo calc(TreeNode root) {
        if (root == null) {
            return new BranchInfo(-1001, -1001);
        } else if (root.left == null && root.right == null) {
            return new BranchInfo(root.val, root.val);
        }
        BranchInfo left = calc(root.left);
        BranchInfo right = calc(root.right);

        int branch = Math.max(Math.max(left.maxBranch + root.val, right.maxBranch + root.val), root.val);
        int path = Math.max(
            Math.max(
                Math.max(left.maxPath, right.maxPath),
                Math.max(left.maxBranch + root.val, right.maxBranch + root.val)
            ),
            Math.max(left.maxBranch + root.val + right.maxBranch, root.val)
        );
        return new BranchInfo(path, branch);
    }

    static class BranchInfo {
        int maxPath;
        int maxBranch;

        public BranchInfo(int maxPath, int maxBranch) {
            this.maxPath = maxPath;
            this.maxBranch = maxBranch;
        }
    }

    public class TreeNode {
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