package rey.bos.three_number_sum;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {12, 3, 1, 2, -6, 5, -8, 6}, new int[] {1, 2, 3}
        };
        int[] targets = new int[] {0, 6};
        List<List<int[]>> expected = List.of(
            List.of(new int[] {-8, 2, 6}, new int[] {-8, 3, 5}, new int[] {-6, 1, 5}), List.of(new int[] {1, 2, 3})
        );
        for (int i = 0; i < expected.size(); i++) {
            System.out.println("i = " + i);
            var result = Solution.threeNumberSum(arrays[i], targets[i]);
            for (int[] nums : result) {
                System.out.println(Arrays.toString(nums));
            }
            for (int[] nums : expected.get(i)) {
                System.out.println(Arrays.toString(nums));
            }
        }
    }

}
