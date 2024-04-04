package rey.bos.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> checkedNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int expectedNum = target - nums[i];
            if (checkedNums.get(expectedNum) != null) {
                return new int[]{i, checkedNums.get(expectedNum)};
            }
            checkedNums.put(nums[i], i);
        }
        return new int[]{nums[0]};
    }
    
}
