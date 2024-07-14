package rey.bos.spiral_traverse;

public class Solution {

    public static int[] spiralTraverse(int[][] array) {
        if (array.length == 1) {
            return array[0];
        }
        int[] result = new int[array.length * array[0].length];
        if (array[0].length == 1) {
            for (int i = 0; i < array.length; i++) {
                result[i] = array[i][0];
            }
            return result;
        }
        int sR = 0; 
        int eR = array.length - 1;
        int sC = 0;
        int eC = array[0].length - 1;
        int index = 0;
        while (sR <= eR && sC <= eC) {
            for (int i = sC; i <= eC; i++) {
                result[index++] = array[sR][i];
            }
            for (int i = sR + 1; i <= eR; i++) { //1
                result[index++] = array[i][eC];
            }
            for (int i = eC - 1; i >= sC; i--) {
                result[index++] = array[eR][i];
            }
            for (int i = eR - 1; i > sR; i--) {
                result[index++] = array[i][sC];
            }
            sR++; sC++; eR--; eC--;
        }
        return result;
    }

}
