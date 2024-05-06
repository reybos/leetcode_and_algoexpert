package rey.bos.class_photo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> blue = List.of(
                new ArrayList<>(List.of(5, 8, 1, 3, 4)), new ArrayList<>(List.of(5, 5)), new ArrayList<>(List.of(1, 8))
        );
        List<List<Integer>> red = List.of(
                new ArrayList<>(List.of(6, 9, 2, 4, 5)), new ArrayList<>(List.of(5, 5)), new ArrayList<>(List.of(1, 9))
        );
        boolean[] expected = new boolean[]{true, false, false};

        for (int i = 0; i < expected.length; i++) {
            if (expected[i] == Solution.classPhotos(blue.get(i), red.get(i))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
