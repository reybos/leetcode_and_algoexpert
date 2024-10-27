package rey.bos.make_a_square_with_the_same_color;

public class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[i].length - 1; j++) {
                int count = 0;
                int[][] variants = new int[][] {
                    new int[]{i, j}, new int[]{i + 1, j}, new int[]{i, j + 1}, new int[]{i + 1, j + 1}
                };
                for (int[] variant : variants) {
                    if (grid[variant[0]][variant[1]] == 'W') {
                        count++;
                    } else {
                        count--;
                    }
                }
                if (count != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
