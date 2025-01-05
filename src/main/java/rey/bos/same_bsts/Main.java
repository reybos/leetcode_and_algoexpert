package rey.bos.same_bsts;

public class Main {

    public static void main(String[] args) {
        int[][] arrays1 = new int[][] {
            new int[] {10, 15, 8, 12, 94, 81, 5, 2, 11}, new int[] {1, 2, 3, 4, 5, 6, 7}, new int[] {7, 6, 5, 4, 3, 2, 1},
            new int[] {1, 2, 3, 4, 5, 6, 7, 8}
        };
        int[][] arrays2 = new int[][] {
            new int[] {10, 8, 5, 15, 2, 12, 11, 94, 81}, new int[] {1, 2, 3, 4, 5, 6, 7}, new int[] {7, 6, 5, 4, 3, 2, 1},
            new int[] {1, 2, 3, 4, 5, 6, 7}
        };
        boolean[] expected = new boolean[] {true, true, true, false};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.sameBsts(arrays1[i], arrays2[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
