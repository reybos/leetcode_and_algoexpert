package rey.bos.sqrt_x;

public class Solution {

    public int mySqrt(int x) {
        int closest = 0;
        int start = 0;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;
            if (square == x) {
                return mid;
            } else if (square > x) {
                end = mid - 1;//
            } else {
                start = mid + 1;
                closest = mid;
            }
        }
        return closest;
    }

}
