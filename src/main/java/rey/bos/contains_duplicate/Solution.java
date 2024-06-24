package rey.bos.contains_duplicate;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> dict = new HashSet<>();
        for (int num : nums) {
            if (dict.contains(num)) {
                return true;
            }
            dict.add(num);
        }
        return false;
    }

}