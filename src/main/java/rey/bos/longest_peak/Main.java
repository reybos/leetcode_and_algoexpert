package rey.bos.longest_peak;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3}, new int[] {}, new int[] {1, 3, 2},
            new int[] {1, 2, 3, 4, 5, 6, 10, 100, 1000}, new int[] {1, 2, 3, 3, 2, 1}, new int[] {1, 1, 3, 2, 1},
            new int[] {1, 1, 1, 2, 3, 10, 12, -3, -3, 2, 3, 45, 800, 99, 98, 0, -1, -1, 2, 3, 4, 5, 0, -1, -1}
        };
        int[] expected = new int[] {6, 0, 3, 0, 0, 4, 9};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.longestPeak(arrays[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
