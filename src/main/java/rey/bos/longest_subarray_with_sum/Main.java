package rey.bos.longest_subarray_with_sum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {1, 2, 3, 4, 3, 3, 1, 2, 1, 2}, new int[] {1, 2, 3, 4, 0, 0, 0, 0, 0, 3, 3, 1, 2, 1},
            new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            new int[] {25, 25, 25, 25, 100, 0, 0, 0, 0, 0, 0, 0}, new int[] {0}, new int[] {5}
        };
        int[] targets = new int[] {10, 10, 1, 1, 100, 0, 0};
        int[][] expected = new int[][] {
            new int[] {4, 8}, new int[] {4, 13}, new int[] {0, 9}, new int[] {0, 9}, new int[] {4, 11}, new int[] {0, 0},
            new int[] {}
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.equals(Solution.longestSubarrayWithSum(arrays[i], targets[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
