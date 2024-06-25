package rey.bos.contains_duplicate_two;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> dict = new HashSet<>();
        for (int i = 0; i <= Math.min(k, (nums.length - 1)); i++) {
            if (dict.contains(nums[i])) {
                return true;
            }
            dict.add(nums[i]);
        }
        for (int i = k + 1; i < nums.length; i++) {
            dict.remove(nums[i - k - 1]);
            if (dict.contains(nums[i])) {
                return true;
            }
            dict.add(nums[i]);
        }
        return false;
    }

}
