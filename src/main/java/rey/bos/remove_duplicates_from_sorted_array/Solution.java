package rey.bos.remove_duplicates_from_sorted_array;

public class Solution {

    public int removeDuplicates(int[] nums) {
        int pointer = 1;
        int currentNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (currentNum != nums[i]) {
                currentNum = nums[i];
                nums[pointer++] = currentNum;
            }
        }
        return pointer;
    }

}
