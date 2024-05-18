package rey.bos.find_three_largest_numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static int[] findThreeLargestNumbers(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (result.get(2) == null) {
                result.put(2, nums[i]);
            } else if (result.get(2) <= nums[i]) {
                result.put(0, result.get(1));
                result.put(1, result.get(2));
                result.put(2, nums[i]);
            } else if (result.get(1) == null) {
                result.put(1, nums[i]);
            } else if (result.get(1) <= nums[i]) {
                result.put(0, result.get(1));
                result.put(1, nums[i]);
            } else if (result.get(0) == null) {
                result.put(0, nums[i]);
            } else if (result.get(0) <= nums[i]) { 
                result.put(0, nums[i]);
            }
        }
        return new int[] {result.get(0), result.get(1), result.get(2)};
    }

}
