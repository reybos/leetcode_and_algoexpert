package rey.bos.valid_parentheses;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char next = s.charAt(i);
            if (isOpen(next)) {
                stack.push(next);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char curr = stack.pop();
                if (!isCorrect(curr, next)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpen(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    private boolean isCorrect(char curr, char next) {
        if (curr == '(') {
            return next == ')';
        } else if (curr == '{') {
            return next == '}';
        } else if (curr == '[') {
            return next == ']';
        }
        return false;
    }

}
