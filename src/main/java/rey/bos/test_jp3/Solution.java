package rey.bos.test_jp3;

public class Solution {

    //I, am Andrei -> 3
    // -> 0
    // I, am Andrei -> 3
    //_I, am Andrei_ -> 3
    public static int countWords(String sentence) {//_I_am_Andrei_
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        int start = 0;
        int end = 0;
        int result = 0;
        while (end < sentence.length()) {
            char currChar = sentence.charAt(end); //_
            if (currChar == ' ' && start != end) {
                result++;
                end++;
                start = end;
            } else if (currChar == ' ') {
                end++;
                start = end;
            } else {
                end++;
            }
        }
        if (sentence.charAt(sentence.length() - 1) != ' ') {
            result++;
        }
        return result;
    }
}
