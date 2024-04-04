package rey.bos.two_sum;

import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	int[][] nums = new int[][]{
    		new int[] {1, 2, 3}, new int[] {1, 2, 3}, new int[] {1, 2, 3, 4, 5}
    		};
	    int[] target = new int[]{4, 5, 6};
	    int[][] expected = new int[][]{new int[] {0, 2}, new int[] {1, 2}, new int[] {1, 3}};
	
		for (int i = 0; i < nums.length; i++) {
			int[] result = Solution.twoSum(nums[i], target[i]);
			Arrays.sort(result);
			Arrays.sort(expected[i]);
			if (Arrays.equals(result, expected[i])) {
				System.out.println(i + " case is passed");
			} else {
				System.out.println(i + " case is failed");
			}
		}
    }

}
