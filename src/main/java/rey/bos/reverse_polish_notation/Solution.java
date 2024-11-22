package rey.bos.reverse_polish_notation;

import java.util.List;
import java.util.Stack;

public class Solution {

    public static int reversePolishNotation(String[] tokens) throws Exception {
        Stack<Integer> storage = new Stack<>();
        List<String> operations = List.of("/", "+", "-", "*");
        for (String token : tokens) {
            if (!operations.contains(token)) {
                storage.push(Integer.parseInt(token));
                continue;
            }
            int second = storage.pop();
            int first = storage.pop();
            int result = switch (token) {
                case "/" -> first / second;
                case "*" -> first * second;
                case "+" -> first + second;
                case "-" -> first - second;
                default -> throw new Exception();
            };
            storage.push(result);
        }
        return storage.pop();
    }

}
