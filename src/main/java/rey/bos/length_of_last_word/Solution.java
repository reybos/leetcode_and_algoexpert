package rey.bos.length_of_last_word;

public class Solution {

    public int lengthOfLastWord(String s) {
        int lastCharIndx = findLastChar(s);
        if (lastCharIndx == -1) {
            return s.length();
        }
        int firstCharIndx = findFirstChar(s, lastCharIndx - 1);
        return lastCharIndx - firstCharIndx + 1;
    }

    private int findLastChar(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                return i;
            }
        }
        return -1;
    }

    private int findFirstChar(String s, int start) {
        for (int i = start; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return i + 1;
            }
        }
        return 0;
    }

}
