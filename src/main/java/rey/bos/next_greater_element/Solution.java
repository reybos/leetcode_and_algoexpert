package rey.bos.next_greater_element;

import java.util.Arrays;
import java.util.Stack;

public class Solution {

    public static int[] nextGreaterElement(int[] array) {
        int[] result = new int[array.length];
        Arrays.fill(result, -1);
        Stack<Integer> storage = new Stack<>();
        for (int i = 0; i < array.length * 2; i++) {
            int idx = i % array.length;
            if (storage.empty()) {
                storage.push(idx);
                continue;
            }
            while (!storage.empty() && array[storage.peek()] < array[idx]) {
                int currIdx = storage.pop();
                result[currIdx] = array[idx];
            }
            storage.push(idx);
        }
        return result;
    }

}
