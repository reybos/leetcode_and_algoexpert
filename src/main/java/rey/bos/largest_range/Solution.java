package rey.bos.largest_range;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int[] largestRange(int[] array) {
        Map<Integer, Boolean> dict = new HashMap<>();
        for (int num : array) {
            dict.put(num, false);
        }
        int[] result = new int[] {0, -1};
        for (int num : array) {
            Boolean visited = dict.get(num);
            if (visited) {
                continue;
            }
            int start = num - 1;
            while (true) {
                visited = dict.get(start);
                if (visited == null) {
                    break;
                }
                dict.put(start, true);
                start--;
            }
            start++;
            int end = num + 1;
            while (true) {
                visited = dict.get(end);
                if (visited == null) {
                    break;
                }
                dict.put(end, true);
                end++;
            }
            end--;
            if (result[1] - result[0] < end - start) {
                result[0] = start;
                result[1] = end;
            }
        }
        return result;
    }

}
