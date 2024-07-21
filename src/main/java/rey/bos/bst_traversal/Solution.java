package rey.bos.bst_traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static int[] inOrderTraverse(BST tree) {
        List<Integer> result = new ArrayList<>();
        inOrderTraverse(tree, result);
        int[] result2 = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            result2[i] = result.get(i);
        }
        return result2;
    }
    
    private static void inOrderTraverse(BST node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inOrderTraverse(node.left, result);
        result.add(node.value);
        inOrderTraverse(node.right, result);
    }

    public static int[] preOrderTraverse(BST tree) {
        List<Integer> result = new ArrayList<>();
        preOrderTraverse(tree, result);
        int[] result2 = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            result2[i] = result.get(i);
        }
        return result2;
    }
    
    private static void preOrderTraverse(BST node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.value);
        preOrderTraverse(node.left, result);
        preOrderTraverse(node.right, result);
    }

    public static int[] postOrderTraverse(BST tree) {
        List<Integer> result = new ArrayList<>();
        postOrderTraverse(tree, result);
        int[] result2 = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            result2[i] = result.get(i);
        }
        return result2;
    }
    
    private static void postOrderTraverse(BST node, List<Integer> result) {
        if (node == null) {
            return;
        }
        postOrderTraverse(node.left, result);
        postOrderTraverse(node.right, result);
        result.add(node.value);
    }

    public static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST(int value, BST left, BST right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

}
