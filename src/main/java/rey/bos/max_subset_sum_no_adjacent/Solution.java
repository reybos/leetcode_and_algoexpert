package rey.bos.max_subset_sum_no_adjacent;

public class Solution {

    public static int maxSubsetSumNoAdjacent(int[] array) {
        if (array.length == 0) {
            return 0;
        } else if (array.length == 1) {
            return array[0];
        } else if (array.length == 2) {
            return Math.max(array[0], array[1]);
        }
        for (int i = 2; i < array.length; i++) {
            array[i] = Math.max(array[i - 1], array[i - 2] + array[i]);
        }
        return array[array.length - 1];
    }

}
