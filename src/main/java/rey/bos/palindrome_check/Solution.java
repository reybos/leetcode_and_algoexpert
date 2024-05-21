package rey.bos.palindrome_check;

public class Solution {

    public static boolean isPalindrome(String str) {
		int start = 0;
		int finish = str.length() - 1;
		while (start <= finish) {
			if (str.charAt(start) != str.charAt(finish)) {
				return false;
			}
			start++;
			finish--;
		}
		return true;
    }

}
