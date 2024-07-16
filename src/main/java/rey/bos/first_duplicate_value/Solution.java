package rey.bos.first_duplicate_value;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int firstDuplicateValue(int[] array) {
        Set<Integer> nums = new HashSet<>();
        for (int num : array) {
            if (nums.contains(num)) {
                return num;
            }
            nums.add(num);
        }
        return -1;
    }

}
