package rey.bos.merge_overlapping_intervals;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][][] arrays = new int[][][]{
            new int[][]{
                new int[]{1, 2},
                new int[]{3, 5},
                new int[]{4, 7},
                new int[]{6, 8},
                new int[]{9, 10}
            },
            new int[][]{
                new int[]{10, 20},
                new int[]{20, 30},
                new int[]{30, 40},
                new int[]{40, 50},
                new int[]{50, 60}
            },
            new int[][]{
                new int[]{10, 20},
                new int[]{21, 30},
                new int[]{31, 40},
                new int[]{41, 50},
                new int[]{51, 60}
            },
            new int[][]{
                new int[]{89, 90},
                new int[]{-10, 20},
                new int[]{-50, 0},
                new int[]{70, 90},
                new int[]{90, 91},
                new int[]{90, 95}
            }
        };
        int[][][] expected = new int[][][]{
            new int[][]{
                new int[]{1, 2},
                new int[]{3, 8},
                new int[]{9, 10}
            },
            new int[][]{
                new int[]{10, 60}
            },
            new int[][]{
                new int[]{10, 20},
                new int[]{21, 30},
                new int[]{31, 40},
                new int[]{41, 50},
                new int[]{51, 60}
            },
            new int[][]{
                new int[]{-50, 20},
                new int[]{70, 95}
            }
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.deepEquals(Solution.mergeOverlappingIntervals(arrays[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
