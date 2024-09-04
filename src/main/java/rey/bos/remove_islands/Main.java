package rey.bos.remove_islands;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][][] arrays = new int[][][] {
            new int[][] {
                new int[] {1, 0, 0, 0, 0, 0},
                new int[] {0, 1, 0, 1, 1, 1},
                new int[] {0, 0, 1, 0, 1, 0},
                new int[] {1, 1, 0, 0, 1, 0},
                new int[] {1, 0, 1, 1, 0, 0},
                new int[] {1, 0, 0, 0, 0, 1}
            },
            new int[][] {
                new int[] {1, 0, 0, 1, 0},
                new int[] {0, 1, 0, 1, 0},
                new int[] {0, 0, 1, 1, 0}
            },
            new int[][] {
                new int[] {1}
            },
            new int[][] {
                new int[] {0, 0, 0, 0, 0},
                new int[] {0, 0, 1, 0, 0},
                new int[] {0, 1, 1, 1, 0},
                new int[] {0, 0, 1, 0, 0},
                new int[] {0, 0, 0, 0, 0}
            }
        };
        int[][][] expected = new int[][][] {
            new int[][] {
                new int[] {1, 0, 0, 0, 0, 0},
                new int[] {0, 0, 0, 1, 1, 1},
                new int[] {0, 0, 0, 0, 1, 0},
                new int[] {1, 1, 0, 0, 1, 0},
                new int[] {1, 0, 0, 0, 0, 0},
                new int[] {1, 0, 0, 0, 0, 1}
            },
            new int[][] {
                new int[] {1, 0, 0, 1, 0},
                new int[] {0, 0, 0, 1, 0},
                new int[] {0, 0, 1, 1, 0}
            },
            new int[][] {
                new int[] {1}
            },
            new int[][] {
                new int[] {0, 0, 0, 0, 0},
                new int[] {0, 0, 0, 0, 0},
                new int[] {0, 0, 0, 0, 0},
                new int[] {0, 0, 0, 0, 0},
                new int[] {0, 0, 0, 0, 0}
            }
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.deepEquals(Solution.removeIslands(arrays[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
