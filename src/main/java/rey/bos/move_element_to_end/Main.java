package rey.bos.move_element_to_end;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {2, 1, 2, 2, 2, 3, 4, 2}, new int[] {}, new int[] {1, 2, 4, 5, 6}
        };
        int[] moves = new int[] {2, 3, 3};
        int[][] expected = new int[][] {
            new int[] {4, 1, 3, 2, 2, 2, 2, 2}, new int[] {}, new int[] {1, 2, 4, 5, 6}
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.equals(Solution.moveElementToEnd(arrays[i], moves[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
