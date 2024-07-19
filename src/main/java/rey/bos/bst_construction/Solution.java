package rey.bos.bst_construction;

import java.util.*;

public class Solution {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            if (this.value > value) {
                if (this.left == null) {
                    this.left = new BST(value);
                } else {
                    this.left.insert(value);
                }
            } else {
                if (this.right == null) {
                    this.right = new BST(value);
                } else {
                    this.right.insert(value);
                }
            }
            return this;
        }

        public boolean contains(int value) {
            if (this.value == value) {
                return true;
            } else if (this.value > value) {
                return this.left != null && this.left.contains(value);
            } else {
                return this.right != null && this.right.contains(value);
            }
        }

        public BST remove(int value) {
            if (this.left != null || this.right != null) {
                remove(value, this, this);
            }
            return this;
        }

        private void remove(int value, BST nod, BST root) {
            if (root.equals(nod) && root.value == value) {
                if (root.left == null) {
                    root.value = root.right.value;
                    root.left = root.right.left;
                    root.right = root.right.right;
                } else if (root.right == null) {
                    root.value = root.left.value;
                    root.right = root.left.right;
                    root.left = root.left.left;
                } else {
                    int min = min(root.right);
                    root.value = min;
                    nod.right.remove(min, root.right, root);
                }
            } else if (nod.value == value) {
                if (nod.left == null && nod.right == null) {
                    if (root.left != null && root.left.value == nod.value) {
                        root.left = null;
                    } else if (root.right != null && root.right.value == nod.value) {
                        root.right = null;
                    }
                } else if (nod.left == null) {
                    if (root.left != null && root.left.value == nod.value) {
                        root.left = nod.right;
                    } else if (root.right != null && root.right.value == nod.value) {
                        root.right = nod.right;
                    }
                } else if (nod.right == null) {
                    if (root.left != null && root.left.value == nod.value) {
                        root.left = nod.left;
                    } else if (root.right != null && root.right.value == nod.value) {
                        root.right = nod.left;
                    }
                } else {
                    int min = min(nod.right);
                    nod.value = min;
                    nod.right.remove(min, nod.right, nod);
                }
            } else if (nod.value > value) {
                if (nod.left != null) {
                    remove(value, nod.left, nod);
                }
            } else {
                if (nod.right != null) {
                    remove(value, nod.right, nod);
                }
            }
        }

        private int min(BST root) {
            if (root.left == null) {
                return root.value;
            }
            return min(root.left);
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
    }

}
