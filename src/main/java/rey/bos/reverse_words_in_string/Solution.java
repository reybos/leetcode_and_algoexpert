package rey.bos.reverse_words_in_string;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    //1_
    public static String reverseWordsInString(String string) {
        if (string.length() < 2) {
            return string;
        }
        List<String> words = new ArrayList<>();
        boolean isWord = string.charAt(0) != ' '; //true
        int startIdx = 0;
        int endIdx = 0;
        for (int i = 1; i < string.length(); i++) {
            char curr = string.charAt(i); //_
            if ((curr == ' ' && isWord) || (curr != ' ' && !isWord)) {
                words.add(string.substring(startIdx, Math.min(endIdx + 1, string.length())));
                isWord = string.charAt(i) != ' ';
                startIdx = i;
                endIdx = i;
            } else {
                endIdx++;
            }
        }
        words.add(string.substring(startIdx));
        StringBuilder result = new StringBuilder();
        for (int i = words.size() - 1; i >= 0; i--) {
            result.append(words.get(i));
        }
        return result.toString();
    }

}
