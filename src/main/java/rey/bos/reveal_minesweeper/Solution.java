package rey.bos.reveal_minesweeper;

public class Solution {

    public static String[][] revealMinesweeper(String[][] board, int row, int column) {
        if (board[row][column].equals("M")) {
            board[row][column] = "X";
        } else {
            countMines(board, row, column);
        }
        return board;
    }
    
    private static void countMines(String[][] board, int row, int column) {
        int result = 0;
        int[][] coords = new int[][] {
            new int[] {row - 1, column - 1}, new int[] {row - 1, column}, new int[] {row - 1, column + 1}, 
            new int[] {row, column - 1}, new int[] {row, column + 1}, new int[] {row + 1, column - 1}, 
            new int[] {row + 1, column}, new int[] {row + 1, column + 1}
        };
        for (int[] coord : coords) {
            int currRow = coord[0];
            int currColumn = coord[1];
            if (overSize(board, currRow, currColumn)) {
                continue;
            }
            if (board[currRow][currColumn].equals("M")) {
                result++;
            }
        }
        board[row][column] = String.valueOf(result);
        if (result != 0) {
            return;
        }
        for (int[] coord : coords) {
            int currRow = coord[0];
            int currColumn = coord[1];
            if (overSize(board, currRow, currColumn) || !board[currRow][currColumn].equals("H")) {
                continue;
            }
            countMines(board, currRow, currColumn);
        }
    }
    
    private static boolean overSize(String[][] board, int row, int column) {
        return row < 0 || row >= board.length || column < 0 || column >= board[row].length;
    }

}
