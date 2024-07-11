package rey.bos.smallest_difference;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] oneArrays = new int[][] {
            new int[] {-1, 5, 10, 20, 28, 3}, new int[] {-1, 5, 10, 20, 3}, new int[] {240, 124, 86, 111, 2, 84, 954, 27, 89}
        };
        int[][] twoArrays = new int[][] {
            new int[] {26, 134, 135, 15, 17}, new int[] {26, 134, 135, 15, 17}, new int[] {1, 3, 954, 19, 8}
        };
        int[][] expected = new int[][] {
            new int[] {28, 26}, new int[] {20, 17}, new int[] {954, 954}
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.equals(Solution.smallestDifference(oneArrays[i], twoArrays[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
