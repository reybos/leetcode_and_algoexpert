package rey.bos.river_sizes;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][][] arrays = new int[][][] {
            new int[][] {
                new int[] {1, 0, 0, 1, 0},
                new int[] {1, 0, 1, 0, 0},
                new int[] {0, 0, 1, 0, 1},
                new int[] {1, 0, 1, 0, 1},
                new int[] {1, 0, 1, 1, 0}
            },
            new int[][] {new int[] {0}},
            new int[][] {new int[] {1}},
            new int[][] {new int[] {1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0}}
        };
        List<List<Integer>> expected = List.of(
            List.of(1, 2, 2, 2, 5), List.of(), List.of(1), List.of(1, 2, 3)
        );
        for (int i = 0; i < expected.size(); i++) {
            if (CollectionUtils.isEqualCollection(Solution.riverSizes(arrays[i]), expected.get(i))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
