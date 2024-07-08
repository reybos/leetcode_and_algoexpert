package rey.bos.valid_anagram;

public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] dict = new int[200];
        for (int i = 0; i < s.length(); i++) {
            dict[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (dict[ch] == 0) {
                return false;
            }
            dict[ch]--;
        }
        return true;
    }

}
