package rey.bos.largest_combination_with_bitwise_and_greater_than_zero;

public class Solution {
    public int largestCombination(int[] candidates) {
        int[] result = new int[31];
        for (int cand : candidates) {
            int two = 1;
            int idx = 0;
            while (two < 20000000) {
                int check = two & cand;
                if (check > 0) {
                    result[idx]++;
                }
                idx++;
                two *= 2;
            }

        }
        int max = 0;
        for (int num : result) {
            max = Math.max(max, num);
        }
        return max;
    }
}
