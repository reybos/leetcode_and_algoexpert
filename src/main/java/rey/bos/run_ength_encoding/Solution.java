package rey.bos.run_ength_encoding;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static String runLengthEncoding(String str) {
        List<Character> result = new ArrayList<>();
        int length = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1) || length == 9) {
                result.add((char) ('0' + length));
                result.add(str.charAt(i - 1)); 
                length = 1;
            } else {
                length++;
            }
        }
        result.add(Integer.toString(length).charAt(0));
        result.add(str.charAt(str.length() - 1));
        
        StringBuilder sb = new StringBuilder();
        for (Character ch : result) {
            sb.append(ch);
        }
        return sb.toString();
    }

}
