package rey.bos.remove_element;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter++] = nums[i];
            }
        }
        return counter;
    }

}
