package rey.bos.search_in_sorted_matrix;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][][] arrays = new int[][][] {
            new int[][] {
                new int[] {1, 4, 7, 12, 15, 1000},
                new int[] {2, 5, 19, 31, 32, 1001},
                new int[] {3, 8, 24, 33, 35, 1002},
                new int[] {40, 41, 42, 44, 45, 1003},
                new int[] {99, 100, 103, 106, 128, 1004}
            }
        };
        int[] targets = new int[] {44, 1, 1000, -1, 1005};
        int[][] expected = new int[][] {
            new int[] {3, 3}, new int[] {0, 0}, new int[] {0, 5}, new int[] {-1, -1}, new int[] {-1, -1}
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.equals(Solution.searchInSortedMatrix(arrays[0], targets[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
