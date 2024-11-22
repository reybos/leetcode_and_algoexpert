package rey.bos.colliding_asteroids;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {5}, new int[] {-5}, new int[] {5, -5}, new int[] {-5, 5}, new int[] {-5, -5}, new int[] {5, 5},
            new int[] {1, 2, 3, -5}, new int[] {4, -2, -3}
        };
        int[][] expected = new int[][] {
            new int[] {5}, new int[] {-5}, new int[] {}, new int[] {-5, 5}, new int[] {-5, -5}, new int[] {5, 5},
            new int[] {-5}, new int[] {4}
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.equals(Solution.collidingAsteroids(arrays[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
