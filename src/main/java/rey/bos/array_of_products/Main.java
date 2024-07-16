package rey.bos.array_of_products;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {5, 1, 4, 2}, new int[] {1, 8, 6, 2, 4}, new int[] {4, 4}, new int[] {0, 0, 0, 0},
            new int[] {1, 1, 1, 1}, new int[] {-1, -1, -1}
        };
        int[][] expected = new int[][] {
            new int[] {8, 40, 10, 20}, new int[] {384, 48, 64, 192, 96}, new int[] {4, 4}, new int[] {0, 0, 0, 0},
            new int[] {1, 1, 1, 1}, new int[] {1, 1, 1}
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.equals(Solution.arrayOfProducts(arrays[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
