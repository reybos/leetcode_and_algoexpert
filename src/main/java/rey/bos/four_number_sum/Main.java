package rey.bos.four_number_sum;

import org.apache.commons.collections4.CollectionUtils;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] array = new int[][] {
            new int[] {7, 6, 4, -1, 1, 2}, new int[] {5, -5, -2, 2, 3, -3}, new int[] {5, -5, -2, 2, 3, -3}
        };
        int[] target = new int[] {16, 0, 100};
        List<List<List<Integer>>> expected = List.of(
            List.of(List.of(7, 6, 4, -1), List.of(7, 6, 1, 2)),
            List.of(List.of(5, -5, -2, 2), List.of(5, -5, 3, -3), List.of(-2, 2, 3, -3)),
            List.of()
        );
        for (int i = 0; i < expected.size(); i++) {
            if (CollectionUtils.isEqualCollection(Solution.fourNumberSum(array[i], target[i]), expected.get(i))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
