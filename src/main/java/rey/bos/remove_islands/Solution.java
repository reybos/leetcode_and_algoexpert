package rey.bos.remove_islands;

import java.util.Stack;

public class Solution {

    public static int[][] removeIslands(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                boolean isRow = i == 0 || i == matrix.length - 1;
                boolean isColumn = j == 0 || j == matrix[i].length - 1;
                boolean isBorder = isRow || isColumn;
                if (!isBorder) {
                    continue;
                }
                checkIfBorder(i, j, matrix);
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] == -1 ? 1 : 0;
            }
        }
        return matrix;
    }
    
    private static void checkIfBorder(int row, int column, int[][] matrix) {
        Stack<int[]> check = new Stack<>();
        check.push(new int[] {row, column});
        while (!check.empty()) {
            int[] candidate = check.pop();
            row = candidate[0];
            column = candidate[1];
            if (matrix[row][column] == 1) {
                matrix[row][column] = -1;
                if (row + 1 < matrix.length && matrix[row + 1][column] == 1) {
                    check.push(new int[] {row + 1, column});
                }
                if (row - 1 >= 0 && matrix[row - 1][column] == 1) {
                    check.push(new int[] {row - 1, column});
                }
                if (column - 1 >= 0 && matrix[row][column - 1] == 1) {
                    check.push(new int[] {row, column - 1});
                }
                if (column + 1 < matrix[0].length && matrix[row][column + 1] == 1) {
                    check.push(new int[] {row, column + 1});
                }
            }
        }
    }

}
