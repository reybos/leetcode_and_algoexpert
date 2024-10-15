package rey.bos.staircase_traversal;

public class Main {

    public static void main(String[] args) {
        int[] heights = new int[] {4, 3, 10, 1};
        int[] steps = new int[] {2, 2, 1, 1};
        int[] expected = new int[] {5, 3, 1, 1};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.staircaseTraversal(heights[i], steps[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
