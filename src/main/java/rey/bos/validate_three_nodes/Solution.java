package rey.bos.validate_three_nodes;

public class Solution {

    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public static boolean validateThreeNodes(BST nodeOne, BST nodeTwo, BST nodeThree) {
        return findNode(nodeOne, nodeThree, nodeTwo, false) || findNode(nodeThree, nodeOne, nodeTwo, false);
    }
    
    private static boolean findNode(BST root, BST search, BST middle, boolean secondSeen) {
        if (root == null) {
            return false;
        }
        secondSeen = secondSeen || root.value == middle.value;
        if (root.value == search.value) {
            return secondSeen;
        } else if (root.value > search.value) {
            return findNode(root.left, search, middle, secondSeen);
        } else {
            return findNode(root.right, search, middle, secondSeen);
        }
    }

}
