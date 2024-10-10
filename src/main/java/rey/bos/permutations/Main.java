package rey.bos.permutations;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> input = List.of(
            List.of(1, 2, 3), List.of(), List.of(1), List.of(1, 2)
        );
        List<List<List<Integer>>> expected = List.of(
            List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1)),
            List.of(), List.of(List.of(1)), List.of(List.of(1, 2), List.of(2, 1))
        );
        for (int i = 0; i < expected.size(); i++) {
            if (CollectionUtils.isEqualCollection(expected.get(i), Solution.getPermutations(input.get(i)))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
