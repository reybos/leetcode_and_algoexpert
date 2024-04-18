package rey.bos.non_constructible_change;

public class Main {

    public static void main(String[] args) {
        int[][] input = new int[][] {
            new int[] {1, 1}, new int[] {5, 7, 1, 1, 2, 3, 22}, new int[] {1, 1, 3}
        };
        int[] expected = new int[]{3, 20, 6};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.find(input[i]) == expected[i]) {
                System.out.println("Test " + i + " passed");
            } else {
                System.out.println("Test " + i + " failed");
            }
        }
    }
}
