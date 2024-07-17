package rey.bos.best_seat;

public class Solution {

    public static int bestSeat(int[] seats) {
        int size = 0;
        int index = -1;
        int leftPointer = 0;
        int rightPointer = 0;
        while (rightPointer < seats.length) {
            if ((rightPointer == leftPointer) || (rightPointer != leftPointer && seats[rightPointer] == 0)) {
                rightPointer++;
                continue;
            }
            int newSize = rightPointer - leftPointer - 1;
            if (newSize > size) {
                size = newSize;
                index = (rightPointer + leftPointer) / 2;
            }
            leftPointer = rightPointer;
        }
        return index;
    }

}
