package rey.bos.kadanes_algorithm;

public class Solution {

    //2, -1, 2, 3, 4
    //2,  1, 3, 7, 11
    
    //2, -3, 2, 3, 4
    //2, -1, 2, 5, 9
    
    //3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4
    //3, 8, -1, 1, 4,  2, 5, 9,16,18,  9,15,18, 19,14, 18
    public static int kadanesAlgorithm(int[] array) {
        int currSum = array[0]; 
        int max = currSum;
        for (int i = 1; i < array.length; i++) {
            currSum = Math.max(array[i], array[i] + currSum);
            if (currSum > max) {
                max = currSum;
            }
        }
        return max;
    }

}
