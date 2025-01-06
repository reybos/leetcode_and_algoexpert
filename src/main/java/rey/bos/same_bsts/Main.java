package rey.bos.same_bsts;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> array1 = List.of(
            List.of(10, 15, 8, 12, 94, 81, 5, 2, 11),
            List.of(1, 2, 3, 4, 5, 6, 7),
            List.of(7, 6, 5, 4, 3, 2, 1),
            List.of(1, 2, 3, 4, 5, 6, 7, 8)
        );
        List<List<Integer>> array2 = List.of(
            List.of(10, 8, 5, 15, 2, 12, 11, 94, 81),
            List.of(1, 2, 3, 4, 5, 6, 7),
            List.of(7, 6, 5, 4, 3, 2, 1),
            List.of(1, 2, 3, 4, 5, 6, 7)
        );
        boolean[] expected = new boolean[] {true, true, true, false};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.sameBsts(array1.get(i), array2.get(i)) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
