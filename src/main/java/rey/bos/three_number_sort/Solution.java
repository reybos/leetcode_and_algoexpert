package rey.bos.three_number_sort;

public class Solution {

    public static int[] threeNumberSort(int[] array, int[] order) {
        int first = order[0]; 
        int last = order[2]; 
        int fIdx = 0; 
        int sIdx = 0; 
        int tIdx = array.length - 1; 
        while (sIdx <= tIdx) {
            if (array[sIdx] == first) {
                swap(sIdx, fIdx, array);
                sIdx++;
                fIdx++;
            } else if (array[sIdx] == last) {
                swap(sIdx, tIdx, array);
                tIdx--;
            } else {
                sIdx++;
            }
        }
        return array;
    }
    
    private static void swap(int fIdx, int sIdx, int[] array) {
        int temp = array[fIdx];
        array[fIdx] = array[sIdx];
        array[sIdx] = temp;
    }

}
