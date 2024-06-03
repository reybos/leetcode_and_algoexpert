package rey.bos.slimbing_stairs;

public class Solution {

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i += 2) {
            first = first + second;
            second = first + second;
        }
        if (n % 2 == 1) {
            return first;
        }
        return second;
    }
    
}
