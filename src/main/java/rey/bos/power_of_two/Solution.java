package rey.bos.power_of_two;

public class Solution {

    public boolean isPowerOfTwo(int n) {
        // while (n % 2 == 0 && n != 0) {
        //     n /= 2;
        // }
        // return n == 1;
        if (n < 1) {
            return false;
        }
        return n == 1 ? true : (n & (n - 1)) == 0;
    }

}
