package rey.bos.minimum_passes_of_matrix;

public class Main {

    public static void main(String[] args) {
        int[][][] arrays = new int[][][] {
            new int[][] {
                new int[] {0, -1, -3, 2, 0},
                new int[] {1, -2, -5, -1, -3},
                new int[] {3, 0, 0, -4, -1}
            },
            new int[][] {
                new int[] {1}
            },
            new int[][] {
                new int[] {-1}
            },
            new int[][] {
                new int[] {1, 2, 3},
                new int[] {4, 5, 6},
                new int[] {7, 8, 9}
            },
            new int[][] {
                new int[] {-1, -2, -3},
                new int[] {-4, -5, -6},
                new int[] {-7, -8, -9}
            },
            new int[][] {
                new int[] {-2, -3, -4, -1, -9},
                new int[] {-4, -3, -4, -1, -2},
                new int[] {-6, -7, -2, -1, -1},
                new int[] {0, 0, 0, 0, -3},
                new int[] {1, -2, -3, -6, -1},
            },
            new int[][] {
                new int[] {-2, -3, -4, -1, -9},
                new int[] {-4, -3, -4, -1, -2},
                new int[] {-6, -7, -2, -1, -1},
                new int[] {0, 0, 0, 0, 0},
                new int[] {1, -2, -3, -6, -1},
            },
            new int[][] {
                new int[] {-1, -2, -3},
                new int[] {0, 0, -6},
                new int[] {7, 0, -9}
            },
            new int[][] {
                new int[] {-1, 2, 3},
                new int[] {4, 5, 6},
                new int[] {7, 8, 9}
            },
        };
        int[] expected = new int[] {3, 0, -1, 0, -1, 12, -1, -1, 1};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.minimumPassesOfMatrix(arrays[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
