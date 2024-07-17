package rey.bos.zero_sum_subarray;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {}, new int[] {0}, new int[] {1}, new int[] {1, 2, 3}, new int[] {0, 0, 0}, new int[] {2, -2},
            new int[] {-1, 2, 3, 4, -5, -3, 1, 2}
        };
        boolean[] expected = new boolean[] {false, true, false, false, true, true, true};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.zeroSumSubarray(arrays[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
