package rey.bos.subarray_sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19}, new int[] {1, 2}, new int[] {2, 1},
            new int[] {1, 2, 8, 4, 5}, new int[] {1, 2, 3, 4, 5, 6, 8, 7, 9, 10, 11},
            new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}
        };
        int[][] expected = new int[][] {
            new int[] {3, 9}, new int[] {-1, -1}, new int[] {0, 1}, new int[] {2, 4}, new int[] {6, 7},
            new int[] {-1, -1}
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.equals(Solution.subarraySort(arrays[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
