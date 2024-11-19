package rey.bos.next_greater_element;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {2, 5, -3, -4, 6, 7, 2}, new int[] {0, 1, 2, 3, 4}
        };
        int[][] expected = new int[][] {
            new int[] {5, 6, 6, 6, 7, -1, 5}, new int[] {1, 2, 3, 4, -1}
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.equals(Solution.nextGreaterElement(arrays[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
