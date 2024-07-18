package rey.bos.sweet_and_savory;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {}, new int[] {1}, new int[] {-5, 10}, new int[] {1}, new int[] {-5, 10}, new int[] {5, -10},
            new int[] {5, -10}, new int[] {10, -5}, new int[] {5, -5, 5, -5, 5, -5}, new int[] {5, -5, 5, -5, 5, -5},
            new int[] {-5, -4, -3, -2, -1, 1, 2, 3, 4, 5}, new int[] {-11, -3, -1, 10, 20, 30}
        };
        int[] targets = new int[] {10, 10, 4, -10, -4, 5, 0, 10, 10, 0, -6, 30};
        int[][] expected = new int[][] {
            new int[] {0, 0}, new int[] {0, 0}, new int[] {-5, 10}, new int[] {0, 0}, new int[] {-5, 10},
            new int[] {-10, 5}, new int[] {-10, 5}, new int[] {-5, 10}, new int[] {-5, 5}, new int[] {-5, 5},
            new int[] {-5, 1}, new int[] {-1, 30}
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.equals(Solution.sweetAndSavory(arrays[i], targets[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
