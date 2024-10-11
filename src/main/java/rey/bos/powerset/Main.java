package rey.bos.powerset;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> input = List.of(
            List.of(1, 2, 3), List.of(), List.of(1)
        );
        List<List<List<Integer>>> expected = List.of(
            List.of(
                List.of(), List.of(1), List.of(2), List.of(3), List.of(1, 2), List.of(1, 3), List.of(2, 3), List.of(1, 2, 3)
            ),
            List.of(List.of()),
            List.of(List.of(), List.of(1))
        );
        for (int i = 0; i < expected.size(); i++) {
            if (CollectionUtils.isEqualCollection(Solution.powerset(input.get(i)), expected.get(i))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
