package rey.bos.two_colorable;

public class Main {

    public static void main(String[] args) {
        int[][][] arrays = new int[][][] {
            new int[][] {new int[] {1}, new int[] {0}},
            new int[][] {new int[] {0}},
            new int[][] {new int[] {1, 2}, new int[] {0, 2}, new int[] {0, 1}},
            new int[][] {new int[] {1}, new int[] {0, 2}, new int[] {1}},
            new int[][] {new int[] {1, 2, 3}, new int[] {0}, new int[] {0}, new int[] {0}}
        };
        boolean[] expected = new boolean[] {true, false, false, true, true};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.twoColorable(arrays[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
