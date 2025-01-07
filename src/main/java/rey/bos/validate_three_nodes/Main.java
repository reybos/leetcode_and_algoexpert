package rey.bos.validate_three_nodes;

public class Main {

    public static void main(String[] args) {
        Solution.BST root = new Solution.BST(5);
        Solution.BST left = new Solution.BST(2);
        Solution.BST right = new Solution.BST(7);
        root.left = left;
        root.right = right;
        Solution.BST leftC = new Solution.BST(1);
        Solution.BST rightC = new Solution.BST(4);
        left.left = leftC;
        left.right = rightC;
        leftC.left = new Solution.BST(0);
        rightC.left = new Solution.BST(3);

        Solution.BST leftCR = new Solution.BST(6);
        Solution.BST rightCR = new Solution.BST(8);
        right.left = leftCR;
        right.right = rightCR;

        Solution.BST[][] input = new Solution.BST[][] {
            new Solution.BST[] {root, left, rightC.left},
            new Solution.BST[] {left, root, rightC.left},
            new Solution.BST[] {rightC, root, leftCR},
            new Solution.BST[] {left, leftC, leftC.left},
        };
        boolean[] expected = new boolean[] {true, false, false, true};

        for (int i = 0; i < input.length; i++) {
            Solution.BST[] curr = input[i];
            if (Solution.validateThreeNodes(curr[0], curr[1], curr[2]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
