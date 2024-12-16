package rey.bos.zigzag_traverse;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][][] arrays = new int[][][] {
            new int[][] {
                new int[] {1, 3, 4, 10},
                new int[] {2, 5, 9, 11},
                new int[] {6, 8, 12, 15},
                new int[] {7, 13, 14, 16}
            },
            new int[][] {new int[] {1}},
            new int[][] {new int[] {1, 2, 3, 4, 5}},
            new int[][] {
                new int[] {1},
                new int[] {2},
                new int[] {3},
                new int[] {4},
                new int[] {5}
            },
        };
        int[][] expected = new int[][] {
            new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, new int[] {1}, new int[] {1, 2, 3, 4, 5},
            new int[] {1, 2, 3, 4, 5}
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.equals(Solution.zigzagTraverse(arrays[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
