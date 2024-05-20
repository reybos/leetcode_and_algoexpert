package rey.bos.selection_sort;

public class Solution {

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = findSmallestElement(array, i);
            if (i != smallestIndex) {
                swap(i, smallestIndex, array);
            }
        }
        return array;
    }

    private static int findSmallestElement(int[] array, int start) {
        int smallest = array[start];
        int index = start;
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    private static void swap(int firstIndex, int secondIndex, int[] array) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

}
