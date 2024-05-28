package rey.bos.minimum_string_length_after_removing_substring;

import java.util.Stack;

public class Solution {

    public int minLength(String s) {
        if (s.length() == 1) {
            return 1;
        }
        StringBuilder builder = new StringBuilder(s);
        int start = 0;
        int end = 1;
        while (end < builder.length()) {
            while (start >= 0 && end < builder.length()
                && isPair(builder.charAt(start), builder.charAt(end))) {
                builder.delete(start, end + 1);
                start--;
                end--;
            }
            start = end++;
        }
        return builder.length();
    }

    private boolean isPair(char ch1, char ch2) {
        return (ch1 == 'A' && ch2 == 'B') || (ch1 == 'C' && ch2 == 'D');
    }

}
