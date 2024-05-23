package rey.bos.common_characters;

import java.util.*;

public class Solution {

    public static String[] commonCharacters(String[] strings) {
        String smallest = strings[0];
        for (String str : strings) {
            if (str.length() < smallest.length()) {
                smallest = str;
            }
        }
        Set<String> result = getSetOfLetters(smallest);
        for (String str : strings) {
            Set<String> currLetters = getSetOfLetters(str);
            result.removeIf(letter -> !currLetters.contains(letter));
        }
        return result.toArray(new String[0]);
    }
    
    private static Set<String> getSetOfLetters(String str) {
        Set<String> result = new HashSet<>();
        for (char ch : str.toCharArray()) {
            result.add(String.valueOf(ch));
        }
        return result;
    }

}
