package rey.bos.three_number_sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {1, 0, 0, -1, -1, 0, 1, 1}, new int[] {}, new int[] {-2, -3, -3, -3, -3, -3, -2, -2, -3}
        };
        int[][] orders = new int[][] {
            new int[] {0, 1, -1}, new int[] {0, 1, -1}, new int[] {-2, -3, 0}
        };
        int[][] expected = new int[][] {
            new int[] {0, 0, 0, 1, 1, 1, -1, -1}, new int[] {}, new int[] {-2, -2, -2, -3, -3, -3, -3, -3, -3}
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.equals(Solution.threeNumberSort(arrays[i], orders[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
