package rey.bos.find_kth_largest_value_in_bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public static int findKthLargestValueInBst(BST tree, int k) {
        TreeInfo info = new TreeInfo(0);
        findKthLargestValueInBst(tree, k, info);
        return info.value;
    }
    
    private static void findKthLargestValueInBst(BST tree, int k, TreeInfo info) {
        if (tree == null) {
            return;
        }
        findKthLargestValueInBst(tree.right, k, info);
        if (info.position == k) {
            return;
        }
        info.position++;
        info.value = tree.value;
        if (info.position == k) {
            return;
        }
        findKthLargestValueInBst(tree.left, k, info);
    }
    
    private static class TreeInfo {
        int position;
        int value;
        
        public TreeInfo(int position) {
            this.position = position;
        }

    }

    public static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }

        public BST(int value, BST left, BST right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return bfsToString(this);
        }

        private String bfsToString(BST root) {
            if (root == null) {
                return "";
            }

            StringBuilder sb = new StringBuilder();
            Queue<BST> queue = new LinkedList<>();
            queue.add(root);

            int maxLevel = maxLevel(root);
            int currentLevel = 0;

            while (!queue.isEmpty() && currentLevel <= maxLevel) {
                int levelSize = queue.size();
                List<String> currentLevelNodes = new ArrayList<>();
                List<BST> nextQueue = new ArrayList<>();

                for (int i = 0; i < levelSize; i++) {
                    BST currentNode = queue.poll();
                    if (currentNode != null) {
                        currentLevelNodes.add(String.valueOf(currentNode.value));
                        nextQueue.add(currentNode.left);
                        nextQueue.add(currentNode.right);
                    } else {
                        currentLevelNodes.add(" ");
                        nextQueue.add(null);
                        nextQueue.add(null);
                    }
                }

                int levelIndent = (int) Math.pow(2, maxLevel - currentLevel) - 1;
                int interNodeSpacing = (int) Math.pow(2, maxLevel - currentLevel + 1) - 1;

                sb.append(" ".repeat(levelIndent));
                for (int j = 0; j < currentLevelNodes.size(); j++) {
                    sb.append(currentLevelNodes.get(j));
                    if (j < currentLevelNodes.size() - 1) {
                        sb.append(" ".repeat(interNodeSpacing));
                    }
                }
                sb.append("\n");

                queue.addAll(nextQueue);
                currentLevel++;
            }

            return sb.toString();
        }

        private int maxLevel(BST node) {
            if (node == null) {
                return 0;
            }
            return Math.max(maxLevel(node.left), maxLevel(node.right)) + 1;
        }
    }

}
