package rey.bos.first_duplicate_value;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {2, 1, 5, 2, 3, 3, 4}, new int[] {2, 1, 5, 3, 3, 2, 4}, new int[] {1, 1, 2, 3, 3, 2, 2},
            new int[] {3, 1, 3, 1, 1, 4, 4}, new int[] {}, new int[] {1}, new int[] {1, 1}
        };
        int[] expected = new int[] {2, 3, 1, 3, -1, -1, 1};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.firstDuplicateValue(arrays[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
