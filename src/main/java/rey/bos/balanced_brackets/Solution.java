package rey.bos.balanced_brackets;

import java.util.Map;
import java.util.Stack;

public class Solution {

    public static boolean balancedBrackets(String str) {
        Stack<Character> chars = new Stack<>();
        Map<Character, Character> dict = Map.of(')', '(', ']', '[', '}', '{');
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == '[' || curr == '(' || curr == '{') {
                chars.push(curr);
            } else {
                char inStack = chars.pop();
                if (dict.get(curr) != inStack) {
                    return false;
                }
            }
        }
        return chars.isEmpty();
    }

}
