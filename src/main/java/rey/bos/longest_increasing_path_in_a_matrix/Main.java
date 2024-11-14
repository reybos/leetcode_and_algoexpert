package rey.bos.longest_increasing_path_in_a_matrix;

public class Main {

    public static void main(String[] args) {
        int[][][] matrix = new int[][][] {
            new int[][] {
                new int[] {9,9,4},
                new int[] {6,6,8},
                new int[] {2,1,1}
            }
        };
        Solution.longestIncreasingPath(matrix[0]);
    }

}
