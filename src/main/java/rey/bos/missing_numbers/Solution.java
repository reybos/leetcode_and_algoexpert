package rey.bos.missing_numbers;

public class Solution {

    public static int[] missingNumbers(int[] nums) {
        int maxNum = nums.length + 2;
        int maxSum = 0; 
        for (int i = 1; i <= maxNum; i++) {
            maxSum += i;
        }
        int currSum = 0; 
        for (int num : nums) {
            currSum += num;
        }
        int twoSum = maxSum - currSum; 
        int mid = twoSum / 2; 
        int leftSum = 0; 
        int rightSum = 0; 
        for (int num : nums) {
            if (num <= mid) {
                leftSum += num;
            } else {
                rightSum += num;
            }
        }
        int expectedLeftSum = 0; 
        int expectedRightSum = 0; 
        for (int i = 1; i <= maxNum; i++) {
            if (i <= mid) {
                expectedLeftSum += i;
            } else {
                expectedRightSum += i;
            }
        }
        int[] result = new int[2];
        result[0] = expectedLeftSum - leftSum;
        result[1] = expectedRightSum - rightSum;
        return result;
    }

}
