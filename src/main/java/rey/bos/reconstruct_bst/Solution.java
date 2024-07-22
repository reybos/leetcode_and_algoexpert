package rey.bos.reconstruct_bst;

import java.util.*;

public class Solution {

    public static class BST {

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof BST bst)) return false;
            return value == bst.value && Objects.equals(left, bst.left) && Objects.equals(right, bst.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, left, right);
        }

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

    public static BST reconstructBst(int[] preOrderTraversalValues) {
        BST result = reconstructBst(preOrderTraversalValues, 0, preOrderTraversalValues.length - 1);
//        System.out.println(result);
        return result;
    }
    
    private static BST reconstructBst(int[] preOrderTraversalValues, int start, int end) {
        BST tree = new BST(preOrderTraversalValues[start]);
        if (start + 1 > end) {
            return tree;
        }
        int rightIdx = 0;
        for (int i = start + 1; i <= end; i++) {
            if (preOrderTraversalValues[i] > preOrderTraversalValues[start]) {
                rightIdx = i;
                break;
            }
        }
        if (rightIdx > 0) {
            tree.right = reconstructBst(preOrderTraversalValues, rightIdx, end);
            end = rightIdx - 1;
        }
        
        if (preOrderTraversalValues[start + 1] < preOrderTraversalValues[start]) {
            tree.left = reconstructBst(preOrderTraversalValues, start + 1, end);
        }
        
        return tree;
    }
}
