package rey.bos.nth_fibonacci;

public class Solution {

    public static int getNthFib(int n) {
        int num1 = 0;
        int num2 = 1;

        if (n == 1) {
            return num1;
        } else if (n == 2) {
            return num2;
        }
        for (int i = 2; i < n; i += 2) {
            num1 = num1 + num2;
            num2 = num1 + num2;
        }
        return n % 2 == 1 ? num1 : num2;
    }

}
