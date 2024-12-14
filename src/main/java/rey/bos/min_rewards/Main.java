package rey.bos.min_rewards;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {8, 4, 2, 1, 3, 6, 7, 9, 5}, new int[] {8}, new int[] {5, 10}, new int[] {10, 5},
            new int[] {4, 2, 1, 3}
        };
        int[] expected = new int[] {25, 1, 3, 3, 8};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.minRewards(arrays[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
