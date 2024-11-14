package rey.bos.longest_increasing_path_in_a_matrix;

public class Solution {

    public static int longestIncreasingPath(int[][] matrix) {
        int max = 0;
        int[][] ways = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                max = Math.max(max, longestPath(matrix, ways, i, j));
            }
        }
        return max;
    }

    private static int longestPath(int[][] matrix, int[][] ways, int row, int column) {
        int[][] posWays = new int[][]{
            new int[] {-1, 0}, new int[] {1, 0}, new int[] {0, -1}, new int[] {0, 1}
        };
        if (ways[row][column] > 0) {
            return ways[row][column];
        }
        int max = 1;
        for (int[] posWay : posWays) {
            int checkRow = row + posWay[0];
            int checkColumn = column + posWay[1];
            if (checkRow < 0 || checkRow >= matrix.length || checkColumn < 0 || checkColumn >= matrix[checkRow].length) {
                continue;
            }
            if (matrix[row][column] < matrix[checkRow][checkColumn]) {
                max = Math.max(max, 1 + longestPath(matrix, ways, checkRow, checkColumn));
            }
        }
        ways[row][column] = max;
        return max;
    }

}
