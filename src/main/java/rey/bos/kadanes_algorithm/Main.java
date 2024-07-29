package rey.bos.kadanes_algorithm;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4}, new int[] {1, 2, 3, 4, 5},
            new int[] {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10}, new int[] {-10, -2, -9, -4, -8, -6, -7, -1, -3, -5},
            new int[] {1, 2, 3, 4, 5, 6, -20, 7, 8, 9, 10}, new int[] {-1000, -1000, 2, 4, -5, -6, -7, -8, -2, -100},
            new int[] {1, 2, 3, 4, 5, 6, -22, 7, 8, 9, 10},
        };
        int[] expected = new int[] {19, 15, -1, -1, 35, 6, 34};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.kadanesAlgorithm(arrays[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
