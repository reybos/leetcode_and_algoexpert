package rey.bos.move_element_to_end;

public class Solution {

    public static int[] moveElementToEnd(int[] array, int toMove) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (array[left] != toMove && left < right) {
                left++;
            }
            while (array[right] == toMove && right > left) {
                right--;
            }
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        return array;
    }

}
