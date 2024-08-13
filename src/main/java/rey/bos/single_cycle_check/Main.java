package rey.bos.single_cycle_check;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {2, 3, 1, -4, -4, 2}, new int[] {2, 2, -1}, new int[] {2, 2, 2},
            new int[] {1, 1, 1, 1, 1}, new int[] {-1, 2, 2}, new int[] {0, 1, 1, 1, 1}, new int[] {1, 1, 0, 1, 1},
            new int[] {1, 1, 1, 1, 2}, new int[] {11, 1, 1, 1, 1}, new int[] {-7, 2, 2}, new int[] {3, 1, 1, 1}
        };
        boolean[] expected = new boolean[] {true, true, true, true, true, false, false, false, true, true, false};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.hasSingleCycle(arrays[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
