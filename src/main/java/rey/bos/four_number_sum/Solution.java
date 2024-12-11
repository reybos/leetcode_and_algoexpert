package rey.bos.four_number_sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static List<List<Integer>> fourNumberSum(int[] array, int targetSum) {
        Map<Integer, List<List<Integer>>> dict = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            int curr = array[i];
            int j = i + 1;
            while (j < array.length) {
                int next = array[j++];
                List<List<Integer>> stored = dict.get(targetSum - curr - next);
                if (stored != null) {
                    for (List<Integer> pair : stored) {
                        List<Integer> answer = new ArrayList<>(pair);
                        answer.add(curr);
                        answer.add(next);
                        result.add(answer);
                    }
                }
            }
            j = i - 1;
            while (j >= 0) {
                int prev = array[j--];
                int key = curr + prev;
                dict.compute(key, (k, v) -> {
                    List<Integer> forStore = new ArrayList<>();
                    forStore.add(prev);
                    forStore.add(curr);
                    if (v == null) {
                        List<List<Integer>> box = new ArrayList<>();
                        box.add(forStore);
                        return box;
                    } else {
                        v.add(forStore);
                        return v;
                    }
                });
            }
        }
        return result;
    }

}
