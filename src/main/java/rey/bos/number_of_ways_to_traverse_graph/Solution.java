package rey.bos.number_of_ways_to_traverse_graph;

public class Solution {

    //  1 2 3  4  5
    //1 0 1 1  1  1
    //2 1 2 3  4  5
    //3 1 3 6  10 15
    //4 1 4 10 20 35
    public static int numberOfWaysToTraverseGraph(int width, int height) {
        int[][] matrix = new int[width][height];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || j == 0) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
                }
            }
        }
        return matrix[width - 1][height - 1];
    }

}
