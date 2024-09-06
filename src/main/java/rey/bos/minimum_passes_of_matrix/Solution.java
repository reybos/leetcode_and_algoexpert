package rey.bos.minimum_passes_of_matrix;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static int minimumPassesOfMatrix(int[][] matrix) {
        Queue<int[]> check = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    check.add(new int[]{i, j});
                }
            }
        }
        check.add(new int[]{-1, -1});
        int iteration = changeMatrix(matrix, check);
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt < 0) {
                    return -1;
                }
            }
        }
        return iteration;
    }
    
    private static int changeMatrix(int[][] matrix, Queue<int[]> check) {
        int iteration = 0;
        while (!check.isEmpty()) {
            int[] next = check.poll();
            if (next[0] == -1) {
                if (check.isEmpty()) {
                    return iteration;
                }
                iteration++;
                check.add(new int[]{-1, -1});
                continue;
            }
            int row = next[0];
            int column = next[1];
            if (row - 1 >= 0 && matrix[row - 1][column] < 0) {
                matrix[row - 1][column] *= -1;
                check.add(new int[]{row - 1, column});
            }
            if (row + 1 < matrix.length && matrix[row + 1][column] < 0) {
                matrix[row + 1][column] *= -1;
                check.add(new int[]{row + 1, column});
            }
            if (column - 1 >= 0 && matrix[row][column - 1] < 0) {
                matrix[row][column - 1] *= -1;
                check.add(new int[]{row, column - 1});
            }
            if (column + 1 < matrix[row].length && matrix[row][column + 1] < 0) {
                matrix[row][column + 1] *= -1;
                check.add(new int[]{row, column + 1});
            }
        }
        return iteration;
    }

}








