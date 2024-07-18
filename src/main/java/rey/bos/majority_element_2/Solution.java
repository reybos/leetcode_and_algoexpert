package rey.bos.majority_element_2;

public class Solution {

    public static int majorityElement(int[] array) {
        int majorityElement = array[0];
        int counter = 1;
        for (int i = 1; i < array.length; i++) {
            if (majorityElement != array[i] && counter == 0) {
                majorityElement = array[i];
                counter++;
            } else if (majorityElement != array[i]) {
                counter--;
            } else if (majorityElement == array[i]) {
                counter++;
            }
        }
        return majorityElement;
    }

}
