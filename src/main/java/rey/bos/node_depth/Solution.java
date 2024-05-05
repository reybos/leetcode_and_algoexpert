package rey.bos.node_depth;

public class Solution {

    public static int findDepth(BST tree) {
        return calcDepth(tree, 0);
    }
    
    public static int calcDepth(BST tree, int currDepth) {
        if (tree == null) {
            return 0;
        }
        return currDepth + calcDepth(tree.left, currDepth + 1) + calcDepth(tree.right, currDepth + 1);
    }

}
