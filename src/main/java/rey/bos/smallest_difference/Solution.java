package rey.bos.smallest_difference;

import java.util.Arrays;

public class Solution {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int[] result = new int[2];
        int diffrence = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        while (true) {
            if (arrayOne[i] == arrayTwo[j]) {
                return new int[] {arrayOne[i], arrayTwo[j]};
            }
            if (Math.abs(arrayOne[i] - arrayTwo[j]) < diffrence) {
                diffrence = Math.abs(arrayOne[i] - arrayTwo[j]);
                result[0] = arrayOne[i];
                result[1] = arrayTwo[j];
            }
            if (arrayOne[i] > arrayTwo[j]) {
                j++;
                if (j >= arrayTwo.length) {
                    break;
                }
            } else {
                i++;
                if (i >= arrayOne.length) {
                    break;
                }
            }
        }
        return result;
    }

}
