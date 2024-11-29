package rey.bos.group_anagrams;

import java.util.*;

public class Solution {

    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> storage = new HashMap<>();
        for (String word : words) {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String sorted = new String(letters);
            List<String> value = storage.get(sorted);
            if (value != null) {
                value.add(word);
            } else {
                value = new ArrayList<>();
                value.add(word);
                storage.put(sorted, value);
            }
        }
        return new ArrayList<>(storage.values());
    }

}
