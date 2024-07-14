package rey.bos.spiral_traverse;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][][] arrays = new int[][][] {
            new int[][] {
                new int[] {1, 2, 3, 4},
                new int[] {12, 13, 14, 5},
                new int[] {11, 16, 15, 6},
                new int[] {10, 9, 8, 7}
            },
            new int[][] {new int[] {1}},
            new int[][] {
                new int[] {1, 2},
                new int[] {4, 3}
            },
            new int[][] {
                new int[] {1, 2, 3},
                new int[] {8, 9, 4},
                new int[] {7, 6, 5}
            },
            new int[][] {
                new int[] {1, 2},
                new int[] {6, 3},
                new int[] {5, 4}
            },
            new int[][] {
                new int[] {1, 2, 3},
                new int[] {6, 5, 4}
            },
            new int[][] {
                new int[] {1, 2, 3}
            },
            new int[][] {
                new int[] {1},
                new int[] {2},
                new int[] {3}
            }
        };
        int[][] expected = new int[][] {
            new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, new int[] {1},
            new int[] {1, 2, 3, 4}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[] {1, 2, 3, 4, 5, 6},
            new int[] {1, 2, 3, 4, 5, 6}, new int[] {1, 2, 3}, new int[] {1, 2, 3}
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.equals(Solution.spiralTraverse(arrays[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
