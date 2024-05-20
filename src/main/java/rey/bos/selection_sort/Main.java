package rey.bos.selection_sort;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[]{1}, new int[]{1, 2}, new int[]{3, 1, 2}, new int[]{1, 3, 2}, new int[]{-1, -5, 2, -10}
        };
        int[][] expected = new int[][] {
            new int[]{1}, new int[]{1, 2}, new int[]{1, 2, 3}, new int[]{1, 2, 3}, new int[]{-10, -5, -1, 2}
        };

        for (int i = 0; i < arrays.length; i++) {
            if (Arrays.equals(expected[i], Solution.selectionSort(arrays[i]))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
