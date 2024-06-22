package rey.bos.isomorphic_strings;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> dictS = new HashMap();
        Map<Character, Character> dictT = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (dictS.get(sChar) == null && dictT.get(tChar) == null) {
                dictS.put(sChar, tChar);
                dictT.put(tChar, sChar);
            } else if (dictS.get(sChar) == null || dictS.get(sChar) != tChar) {
                return false;
            }
        }
        return true;
    }
}