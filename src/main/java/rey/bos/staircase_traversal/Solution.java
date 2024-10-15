package rey.bos.staircase_traversal;

public class Solution {

    public static int staircaseTraversal(int height, int maxSteps) {
        int[] result = new int[height + 1];
        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            for (int j = 1; j <= maxSteps; j++) {
                int idx = i - j;
                if (idx >= 0) {
                    result[i] += result[idx];
                }
            }
        }
        return result[height];
    }

}
