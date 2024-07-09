package rey.bos.binary_tree_paths;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        binaryTreePaths(root, result, "");
        return result;
    }

    private void binaryTreePaths(TreeNode root, List<String> result, String path) {
        if (root == null) {
            return;
        }
        path = path.isEmpty() ? path + root.val : path + "->" + root.val;
        if (root.left == null && root.right == null) {
            result.add(path);
            return;
        }
        binaryTreePaths(root.left, result, path);
        binaryTreePaths(root.right, result, path);
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
