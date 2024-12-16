package rey.bos.zigzag_traverse;

public class Solution {

            //new int[] {1, 3, 4, 10},
            //new int[] {2, 5, 9, 11},
            //new int[] {6, 8, 12, 15},
            //new int[] {7, 13, 14, 16}
    public static int[] zigzagTraverse(int[][] array) {
        int[] result = new int[array.length * array[0].length];
        int row = 0;
        int column = 0;
        int idx = 0;
        boolean isDownDirection = true;
        while (row < array.length && row >= 0 && column < array[0].length && column >= 0) {
            result[idx++] = array[row][column];
            if (isDownDirection) {
                if (column == 0 && row != array.length - 1) {
                    isDownDirection = false;
                    row++;
                } else if (row == array.length - 1) {
                    isDownDirection = false;
                    column++;
                } else {
                    row++;
                    column--;
                }
            } else {
                if (row == 0 && column != array[0].length - 1) {
                    isDownDirection = true;
                    column++;
                } else if (column == array[0].length - 1) {
                    isDownDirection = true;
                    row++;
                } else {
                    row--;
                    column++;
                }
            }
        }
        return result;
    }

}
