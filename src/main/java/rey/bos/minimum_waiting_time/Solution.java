package rey.bos.minimum_waiting_time;

import java.util.Arrays;

public class Solution {

    public static int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int result = 0;
        for (int i = 0, size = queries.length - 1; i < queries.length - 1; i++, size--) {
            result += queries[i] * size;
        }
        return result;
    }

}
