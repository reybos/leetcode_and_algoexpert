package rey.bos.bubble_sort;

public class Solution {

    public static int[] bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            boolean changed = false;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    changed = true;
                }
            }
            if (!changed) {
                return array;
            }
            changed = false;
        }   
        return array;
    }

}
