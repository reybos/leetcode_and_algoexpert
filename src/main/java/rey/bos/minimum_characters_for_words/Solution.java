package rey.bos.minimum_characters_for_words;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static char[] minimumCharactersForWords(String[] words) {
        Map<Character, Integer> mainDict = new HashMap<>();
        for (String word : words) {
            Map<Character, Integer> wordDict = new HashMap<>();
            for (char ch : word.toCharArray()) {
                wordDict.compute(ch, (k, v) -> v == null ? 1 : v + 1);
            }
            for (Map.Entry<Character, Integer> curr : wordDict.entrySet()) {
                mainDict.compute(curr.getKey(), (k, v) -> v == null ? curr.getValue() : Math.max(v, curr.getValue()));
            }
        }
        int size = 0;
        for (int count : mainDict.values()) {
            size += count;
        }
        char[] result = new char[size];
        int idx = 0;
        for (Map.Entry<Character, Integer> curr : mainDict.entrySet()) {
            for (int i = 0; i < curr.getValue(); i++) {
                result[idx++] = curr.getKey();
            }
        }
        Arrays.sort(result);
        return result;
    }

}
