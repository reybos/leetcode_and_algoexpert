package rey.bos.is_subsequence;

public class Solution {

    public static boolean isSubsequence(String s, String t) {
        int subseqPointer = 0;
        int strPointer = 0;
        while (subseqPointer < s.length() && strPointer < t.length()) {
            if (s.charAt(subseqPointer) == t.charAt(strPointer)) {
                subseqPointer++;
            }
            strPointer++;
        }
        return subseqPointer == s.length();
    }
    
}
