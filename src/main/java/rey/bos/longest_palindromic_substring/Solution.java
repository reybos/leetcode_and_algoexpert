package rey.bos.longest_palindromic_substring;

public class Solution {

    public static String longestPalindromicSubstring(String str) {
        int[] result = new int[] {0, 0};
        
        for (int i = 0; i < str.length(); i++) {
            int left = i - 1;
            int right = i + 1;
            checkSubstring(left, right, result, str);
            
            left = i;
            right = i + 1;
            checkSubstring(left, right, result, str);
        }
        return str.substring(result[0], result[1] + 1);
    }
    
    private static void checkSubstring(int left, int right, int[] result, String str) {
        int start = result[0];
        int end = result[1];
        while (left >= 0 && right < str.length()) {
            if (str.charAt(left) == str.charAt(right)) {
                if (right - left > end - start) {
                    start = left;
                    end = right;
                }
                left--;
                right++;
            } else {
                break;
            }
        }
        result[0] = start;
        result[1] = end;
    }

}
