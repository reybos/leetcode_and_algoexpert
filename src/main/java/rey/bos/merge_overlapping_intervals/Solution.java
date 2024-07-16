package rey.bos.merge_overlapping_intervals;

import java.util.*;

public class Solution {

    public static int[][] mergeOverlappingIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        int index = 0;
        for (int i = 1; i < intervals.length; i++) {
            int[] saved = result.get(index);
            if (saved[1] >= intervals[i][0]) {
                saved[1] = Math.max(saved[1], intervals[i][1]);
            } else {
                result.add(intervals[i]);
                index++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }

}
