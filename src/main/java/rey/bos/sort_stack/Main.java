package rey.bos.sort_stack;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> input = List.of(
            new ArrayList<>(List.of(-5, 2, -2, 4, 3, 1)), new ArrayList<>(), new ArrayList<>(List.of(-1, 0, 2, 3, 4, 1, 1, 1))
        );
        List<List<Integer>> expected = List.of(
            List.of(-5, -2, 1, 2, 3, 4), List.of(), List.of(-1, 0, 1, 1, 1, 2, 3, 4)
        );
        for (int i = 0; i < expected.size(); i++) {
            if (CollectionUtils.isEqualCollection(Solution.sortStack(input.get(i)), expected.get(i))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
