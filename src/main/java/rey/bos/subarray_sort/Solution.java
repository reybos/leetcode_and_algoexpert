package rey.bos.subarray_sort;

public class Solution {

    //1, 2, 3, 4, 5, 6, 8, 7, 9, 10, 11
    public static int[] subarraySort(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean isOutOfOrder = false;
        for (int i = 0; i < array.length; i++) {
            if (isOutOfOrder(i, array)) {
                isOutOfOrder = true;
                min = Math.min(min, array[i]); //7
                max = Math.max(max, array[i]); //7
            }
        }
        if (!isOutOfOrder) {
            return new int[] {-1, -1};
        }
        int minIdx = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > min) {
                minIdx = i;
                break;
            }
        }
        int maxIdx = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < max) {
                maxIdx = i;
                break;
            }
        }
        return new int[] {minIdx, maxIdx};
    }
    
    private static boolean isOutOfOrder(int index, int[] array) {
        if (index == 0) {
            return array[index + 1] < array[index];
        } else if (index == array.length - 1) {
            return array[index] < array[index - 1];
        } else {
            return array[index] < array[index - 1] || array[index] > array[index + 1];
        }
    }

}
