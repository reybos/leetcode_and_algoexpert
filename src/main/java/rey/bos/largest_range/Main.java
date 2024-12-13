package rey.bos.largest_range;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6}, new int[] {1}, new int[] {1, 2}, new int[] {4, 2, 1, 3}
        };
        int[][] expected = new int[][] {
            new int[] {0, 7}, new int[] {1, 1}, new int[] {1, 2}, new int[] {1, 4}
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.equals(Solution.largestRange(arrays[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
