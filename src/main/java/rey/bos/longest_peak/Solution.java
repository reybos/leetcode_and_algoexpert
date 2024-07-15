package rey.bos.longest_peak;

public class Solution {

    public static int longestPeak(int[] array) {
        if (array.length < 2) {
            return 0;
        }
        int longestPeak = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                int currPeak = 3;
                int leftI = i - 2;
                while (leftI >= 0) {
                    if (array[leftI + 1] > array[leftI]) {
                        currPeak++;
                        leftI--;
                    } else {
                        break;
                    }
                }
                int rightI = i + 2;
                while (rightI < array.length) {
                    if (array[rightI - 1] > array[rightI]) {
                        currPeak++;
                        rightI++;
                    } else {
                        break;
                    }
                }
                i = rightI - 1;
                if (currPeak > longestPeak) {
                    longestPeak = currPeak;
                }
            }
        }
        return longestPeak;
    }

}
