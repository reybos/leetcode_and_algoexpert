package rey.bos.binary_serch;

public class Solution {

    public static int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (target > array[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
    }
}
