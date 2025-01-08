package rey.bos.repair_bst;

public class Main {

    public static void main(String[] args) {
        Solution.BST root = new Solution.BST(10);
        Solution.BST left = new Solution.BST(7);
        Solution.BST right = new Solution.BST(20);
        Solution.BST leftL = new Solution.BST(3);
        Solution.BST leftR = new Solution.BST(12);
        Solution.BST leftLL = new Solution.BST(2);
        Solution.BST rightL = new Solution.BST(8);
        Solution.BST rightR = new Solution.BST(22);
        Solution.BST rightLR = new Solution.BST(14);

        root.left = left;
        root.right = right;
        left.left = leftL;
        left.right = leftR;
        leftL.left = leftLL;
        right.left = rightL;
        right.right = rightR;
        rightL.right = rightLR;

        printTree(root);
        Solution.repairBst(root);
        printTree(root);

        if (isValidBST(root)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
    }

    public static boolean isValidBST(Solution.BST root) {
        return isValidBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isValidBSTHelper(Solution.BST node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.value <= min || node.value >= max) {
            return false;
        }

        return isValidBSTHelper(node.left, min, node.value) &&
            isValidBSTHelper(node.right, node.value, max);
    }

    public static void printTree(Solution.BST root) {
        printTreeHelper(root, 0, false);
    }

    private static void printTreeHelper(Solution.BST node, int level, boolean isLeft) {
        if (node == null) {
            return;
        }

        // Печатаем текущий узел
        System.out.println(" ".repeat(level * 4) + (isLeft ? "L-- " : "R-- ") + node.value);

        // Обрабатываем левое и правое поддеревья
        printTreeHelper(node.left, level + 1, true);
        printTreeHelper(node.right, level + 1, false);
    }

}
