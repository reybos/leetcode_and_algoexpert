package rey.bos.zero_sum_subarray;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static boolean zeroSumSubarray(int[] nums) {
        Set<Integer> sums = new HashSet<>();
        sums.add(0);
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (sums.contains(currSum)) {
                return true;
            }
            sums.add(currSum);
        }
        return false;
    }

}
