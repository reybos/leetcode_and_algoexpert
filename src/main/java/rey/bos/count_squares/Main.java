package rey.bos.count_squares;

public class Main {

    public static void main(String[] args) {
        int[][][] arrays = new int[][][] {
            new int[][] {
                new int[] {1, 1}, new int[] {0, 0}, new int[] {-4, 2}, new int[] {-2, -1},
                new int[] {0, 1}, new int[] {1, 0}, new int[] {-1, 4}
            },
            new int[][] {},
            new int[][] {new int[] {1, 1}},
            new int[][] {new int[] {0, 1}, new int[] {1, 0}},
            new int[][] {new int[] {0, 1}, new int[] {1, 0}, new int[] {0, 0}, new int[] {1, 1}},
        };
        int[] expected = new int[] {2, -1, -1, -1, 1};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.countSquares(arrays[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
