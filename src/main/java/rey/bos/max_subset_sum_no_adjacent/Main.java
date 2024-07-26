package rey.bos.max_subset_sum_no_adjacent;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {75, 105, 120, 75, 90, 135}, new int[] {}, new int[] {1}, new int[] {1, 2}, new int[] {1, 2, 3},
            new int[] {1, 15, 3}
        };
        int[] expected = new int[] {330, 0, 1, 2, 4, 15};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.maxSubsetSumNoAdjacent(arrays[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
