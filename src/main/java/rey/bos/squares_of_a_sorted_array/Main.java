package rey.bos.squares_of_a_sorted_array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
		int[][] input = new int[][]{new int[]{-2, -1, 0, 1}, new int[]{-7, -3, 2, 3, 11}};
		int[][] expected = new int[][]{new int[]{0, 1, 1, 4}, new int[]{4, 9, 9, 49, 121}};
		for (int i = 0; i < input.length; i++) {
			if (Arrays.equals(Solution.sortedSquares(input[i]), expected[i])) {
				System.out.println("test " + i + " passed");
			} else {
				System.out.println("test " + i + " failed");

			}
		}
    }

}
