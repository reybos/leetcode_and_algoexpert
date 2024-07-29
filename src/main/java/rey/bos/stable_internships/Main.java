package rey.bos.stable_internships;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][][] interns = new int[][][] {
            new int[][]{},
            new int[][]{new int[]{0}},
            new int[][]{new int[]{0, 1}, new int[]{1, 0}},
            new int[][]{new int[]{0, 1}, new int[]{0, 1}},
            new int[][]{new int[]{0, 1}, new int[]{0, 1}},
            new int[][]{new int[]{0, 1, 2}, new int[]{1, 0, 2}, new int[]{1, 2, 0}}
        };
        int[][][] teams = new int[][][] {
            new int[][]{},
            new int[][]{new int[]{0}},
            new int[][]{new int[]{0, 1}, new int[]{1, 0}},
            new int[][]{new int[]{0, 1}, new int[]{0, 1}},
            new int[][]{new int[]{0, 1}, new int[]{1, 0}},
            new int[][]{new int[]{2, 1, 0}, new int[]{1, 2, 0}, new int[]{0, 2, 1}}
        };
        int[][][] expected = new int[][][] {
            new int[][]{},
            new int[][]{new int[]{0, 0}},
            new int[][]{new int[]{0, 0}, new int[]{1, 1}},
            new int[][]{new int[]{0, 0}, new int[]{1, 1}},
            new int[][]{new int[]{0, 0}, new int[]{1, 1}},
            new int[][]{new int[]{0, 0}, new int[]{1, 1}, new int[]{2, 2}}
        };
        for (int i = 0; i < expected.length; i++) {
//            System.out.println("expected");
//            for (int[] test : expected[i]) {
//                System.out.println(Arrays.toString(test));
//            }
            if (Arrays.deepEquals(Solution.stableInternships(interns[i], teams[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
