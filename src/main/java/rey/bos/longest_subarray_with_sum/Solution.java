package rey.bos.longest_subarray_with_sum;

public class Solution {

    public static int[] longestSubarrayWithSum(int[] array, int targetSum) {
        // 0, 0, 0, 0, 0, 1, 0, 0, 0, 0
        int[] result = new int[] {0, -1};
        int start = 0; 
        int end = 0;
        int curSum = 0;
        while (end < array.length) {
            curSum += array[end];
            if (curSum == targetSum && (end - start > result[1] - result[0])) {
                result[0] = start;
                result[1] = end;
            }
            while (curSum > targetSum && start < end) {
                curSum -= array[start++];
            }
            end++;
        }
        return result[1] >= 0 ? result : new int[] {};
    }

}
