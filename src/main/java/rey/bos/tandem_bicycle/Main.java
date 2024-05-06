package rey.bos.tandem_bicycle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> blue = List.of(
                new ArrayList<>(List.of(5, 5, 3, 9, 2)), new ArrayList<>(List.of(5, 5, 3, 9, 2))
        );
        List<List<Integer>> red = List.of(
                new ArrayList<>(List.of(3, 6, 7, 2, 1)), new ArrayList<>(List.of(3, 6, 7, 2, 1))
        );
        boolean[] fastest = new boolean[]{true, false};
        int[] expected = new int[]{32, 25};

        for (int i = 0; i < expected.length; i++) {
            if (expected[i] == Solution.tandemBicycle(blue.get(i), red.get(i), fastest[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
