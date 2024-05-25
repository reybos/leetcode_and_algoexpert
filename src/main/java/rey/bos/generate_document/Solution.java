package rey.bos.generate_document;

import java.util.*;

public class Solution {

    public static boolean generateDocument(String characters, String document) {
        if (document.length() > characters.length()) {
            return false;
        }
        if (document.length() == 0) {
            return true;
        }
        Map<Character, Integer> charactersCount = new HashMap<>();
        for (char ch : characters.toCharArray()) {
            charactersCount.compute(ch, (k, v) -> (v == null) ? 1 : v + 1);        
        }
        for (char ch : document.toCharArray()) {
            if (charactersCount.get(ch) == null || charactersCount.get(ch) == 0) {
                return false;
            } else { 
                charactersCount.compute(ch, (k, v) -> v--);
            }
        }
        return true;
    }

}
