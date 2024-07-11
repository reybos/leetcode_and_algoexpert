package rey.bos.three_number_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static List<int[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int num = array[i];
                int leftNum = array[left];
                int rightNum = array[right];
                int sum = num + leftNum + rightNum;
                if (sum == targetSum) {
                    result.add(new int[] {num, leftNum, rightNum});
                    left++;
                    right--;
                } else if (sum < targetSum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

}
