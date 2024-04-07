package rey.bos.squares_of_a_sorted_array;

import java.lang.Math;

public class Solution {

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int leftPointer = 0;
        int rightPoinetr = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[leftPointer]) > Math.abs(nums[rightPoinetr])) {
                result[i] = nums[leftPointer] * nums[leftPointer];
                leftPointer++;
            } else {
                result[i] = nums[rightPoinetr] * nums[rightPoinetr];
                rightPoinetr--;
            }
        }
        return result;
    }

}
