package rey.bos.convert_sorted_array_to_binary_search_tree;

public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildNode(0, nums.length - 1, nums);

    }

    private TreeNode buildNode(int start, int end, int[] nums) {
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        if (mid != start) {
            root.left = buildNode(start, mid - 1, nums);
        }
        if (mid != end) {
            root.right = buildNode(mid + 1, end, nums);
        }
        return root;
    }

    public class TreeNode {
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
