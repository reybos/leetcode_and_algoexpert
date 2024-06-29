package rey.bos.summary_ranges;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return List.of();
        }
        List<String> result = new ArrayList<>();
        int start = nums[0];
        int end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - end != 1) {
                addString(start, end, result);
                start = nums[i];
                end = nums[i];
            } else {
                end = nums[i];
            }
        }
        addString(start, end, result);
        return result;
    }

    private void addString(int start, int end, List<String> result) {
        if (start == end) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + end);
        }
    }

}
