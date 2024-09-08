package rey.bos.task_assignment;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {1, 3, 5, 3, 1, 4}, new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new int[] {3, 5}
        };
        int[] ks = new int[] {3, 5, 1};
        int[][][] expected = new int[][][] {
            new int[][] {new int[] {0, 2}, new int[] {4, 5}, new int[] {1, 3}},
            new int[][] {new int[] {0, 1}, new int[] {2, 3}, new int[] {4, 5}, new int[] {6, 7}, new int[] {8, 9}},
            new int[][] {new int[] {0, 1}}
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.deepEquals(Solution.taskAssignment(ks[i], arrays[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
