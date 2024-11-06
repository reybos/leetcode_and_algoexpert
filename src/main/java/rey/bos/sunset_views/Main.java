package rey.bos.sunset_views;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] buildings = new int[][] {
            new int[] {3, 5, 4, 4, 3, 1, 3, 2}, new int[] {3, 5, 4, 4, 3, 1, 3, 2}, new int[] {10, 11}
        };
        String[] directions = new String[] {"EAST", "WEST", "EAST"};
        List<List<Integer>> expected = List.of(
            List.of(1, 3, 6, 7), List.of(0, 1), List.of(1)
        );
        for (int i = 0; i < expected.size(); i++) {
            if (CollectionUtils.isEqualCollection(Solution.sunsetViews(buildings[i], directions[i]), expected.get(i))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
