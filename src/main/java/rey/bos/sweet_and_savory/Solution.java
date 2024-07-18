package rey.bos.sweet_and_savory;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static int[] sweetAndSavory(int[] dishes, int target) {
        List<Integer> negative = new ArrayList<>();
        List<Integer> positive = new ArrayList<>();
        for (int i = 0; i < dishes.length; i++) {
            if (dishes[i] < 0) {
                negative.add(dishes[i]);
            } else {
                positive.add(dishes[i]);
            }
        }
        if (negative.isEmpty() || positive.isEmpty()) {
            return new int[] {0, 0};
        }
        negative.sort(Integer::compare);
        positive.sort(Integer::compare);
        int[] result = new int[2];
        result[0] = negative.get(0);
        result[1] = positive.get(0);
        int sum;
        int positiveIndex = 0;
        int negativeIndex = 0;
        while (positiveIndex < positive.size() && negativeIndex < negative.size()) {
            sum = positive.get(positiveIndex) + negative.get(negativeIndex);
            if (target == sum) {
                result[0] = negative.get(negativeIndex);
                result[1] = positive.get(positiveIndex);
                return result;
            }
            int currSum = result[0] + result[1];
            if (Math.abs(target - currSum) > Math.abs(target - sum)) {
                result[0] = negative.get(negativeIndex); 
                result[1] = positive.get(positiveIndex); 
            }
            if (sum < target) {
                if (positiveIndex < positive.size() - 1) {
                    positiveIndex++;
                } else {
                    negativeIndex++;
                }
            } else {
                if (negativeIndex < negative.size() - 1) {
                    negativeIndex++;
                } else {
                    positiveIndex++;
                }
            }
        }
        return result;
    }

}
