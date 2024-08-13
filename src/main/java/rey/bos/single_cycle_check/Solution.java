package rey.bos.single_cycle_check;

public class Solution {

//2, 2, -1
//3, 1, 1, 1
//11, 1, 1, 1, 1
    public static boolean hasSingleCycle(int[] array) {
        int currIdx = 0;
        int count = 0;
        while (count < array.length) {
            if (array[currIdx] == 0) {
                return false;
            }
            int temp = currIdx;
            currIdx += array[currIdx] % array.length;
            if (currIdx < 0) {
                currIdx += array.length;
            } else {
                currIdx = currIdx % array.length;
            }
            array[temp] = 0;
            count++;
        }
        return currIdx == 0;
    }

}
