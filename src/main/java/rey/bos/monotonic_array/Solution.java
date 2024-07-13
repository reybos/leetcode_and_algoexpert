package rey.bos.monotonic_array;

public class Solution {

    public static boolean isMonotonic(int[] array) {
        boolean isDecrised = true;
        boolean isIncresed = true;
        for (int i = 1; i < array.length; i++) {
            isDecrised &= array[i] >= array[i - 1];
            isIncresed &= array[i] <= array[i - 1];
        }
        return isDecrised || isIncresed;
    }

}
