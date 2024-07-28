package rey.bos.number_of_ways_to_traverse_graph;

public class Main {

    public static void main(String[] args) {
        int[] widths = new int[] {4, 2, 1, 4};
        int[] heights = new int[] {3, 1, 2, 5};
        int[] expected = new int[] {10, 1, 1, 35};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.numberOfWaysToTraverseGraph(widths[i], heights[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
