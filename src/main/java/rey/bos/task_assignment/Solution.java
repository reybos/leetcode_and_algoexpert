package rey.bos.task_assignment;

import java.util.*;

public class Solution {

    public static int[][] taskAssignment(int k, int[] tasks) {
        int[] tasksSort = Arrays.copyOf(tasks, tasks.length);
        Arrays.sort(tasksSort);
        Map<Integer, Queue<Integer>> idxs = fillIdxs(tasks);
        int[][] result = new int[k][2];
        for (int i = 0, j = tasksSort.length - 1; i < tasksSort.length / 2; i++, j--) {
            result[i] = new int[] {
                idxs.get(tasksSort[i]).poll(), idxs.get(tasksSort[j]).poll()
            };
        }
        return result;
    }
    
    private static Map<Integer, Queue<Integer>> fillIdxs(int[] tasks) {
        Map<Integer, Queue<Integer>> idxs = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            Queue<Integer> val = idxs.get(tasks[i]);
            if (val == null) {
                val = new LinkedList<>();
                val.add(i);
                idxs.put(tasks[i], val);
                continue;
            }
            val.add(i);
        }
        return idxs;
    }

}
