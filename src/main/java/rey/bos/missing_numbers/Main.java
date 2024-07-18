package rey.bos.missing_numbers;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {}, new int[] {1}, new int[] {2}, new int[] {3}, new int[] {1, 3},
            new int[] {4, 5, 3}, new int[] {3, 5, 1, 2, 4, 7, 6}
        };
        int[][] expected = new int[][] {
            new int[] {1, 2}, new int[] {2, 3}, new int[] {1, 3}, new int[] {1, 2}, new int[] {2, 4},
            new int[] {1, 2}, new int[] {8, 9}
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.equals(Solution.missingNumbers(arrays[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
