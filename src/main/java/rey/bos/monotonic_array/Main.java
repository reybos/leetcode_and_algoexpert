package rey.bos.monotonic_array;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001}, new int[] {}, new int[] {1},
            new int[] {2, 1}, new int[] {1, 2, 0}, new int[] {1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 7, 9, 10, 11}
        };
        boolean[] expected = new boolean[] {true, true, true, true, false, false};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.isMonotonic(arrays[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
