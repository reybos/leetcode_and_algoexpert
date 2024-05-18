package rey.bos.find_three_largest_numbers;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] nums = new int[][] {
            new int[] {2, 5, 0, -100, 19, 300, 1000}, new int[] {55, 7, 8}, new int[] {7, 7, 7, 7, 7, 7, 8, 7, 7, 7, 7},
            new int[] {-1, -2, -3, -7, -17, -27, -18, -541, -8, -7, 7}
        };
        int[][] expected = new int[][] {
            new int[] {19, 300, 1000}, new int[] {7, 8, 55}, new int[] {7, 7, 8}, new int[] {-2, -1, 7}
        };
        for (int i = 0; i < nums.length; i++) {
            if (Arrays.equals(expected[i], Solution.findThreeLargestNumbers(nums[i]))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
