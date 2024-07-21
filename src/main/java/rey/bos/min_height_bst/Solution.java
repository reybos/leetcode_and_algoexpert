package rey.bos.min_height_bst;

import java.util.*;

public class Solution {

    public static BST minHeightBst(int[] array) {
//        System.out.println(root);
        return minHeightBst(array, 0, array.length - 1);
    }
    
    private static BST minHeightBst(int[] array, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        BST root = new BST(array[mid]);
        root.left = minHeightBst(array, start, mid - 1);
        root.right = minHeightBst(array, mid + 1, end);
        return root;
    }

    public static class BST {

        public int value;

        @Override
        public int hashCode() {
            return Objects.hash(value, left, right);
        }

        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public BST(int value, BST left, BST right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof BST bst)) return false;
            return value == bst.value && Objects.equals(left, bst.left) && Objects.equals(right, bst.right);
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
