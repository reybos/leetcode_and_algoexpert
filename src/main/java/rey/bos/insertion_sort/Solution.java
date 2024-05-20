package rey.bos.insertion_sort;

import java.util.Arrays;

public class Solution {

    public static int[] insertionSort(int[] array) {
    	if (array.length < 2) {
    		return array;
    	}
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				} else {
					break;
				}
			}
		}
		return array;
    }

}
