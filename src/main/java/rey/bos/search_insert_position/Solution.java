package rey.bos.search_insert_position;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        return checkNext(start, end, nums, target);
    }

    private int checkNext(int start, int end, int[] nums, int target) {
        if (start > end) {
            return start;
        }
        int index = (start + end) / 2;
        if (nums[index] < target) {
            return checkNext(index + 1, end, nums, target);
        } else if (nums[index] > target) {
            return checkNext(start, index - 1, nums, target);
        } else if (nums[index] == target) {
            return index;
        }
        return ++index;
    }
    
}
