package rey.bos.sort_stack;

import java.util.List;

public class Solution {

    public static List<Integer> sortStack(List<Integer> stack) {
        sort(stack);
        return stack;
    }

    private static void sort(List<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int lastIdx = stack.size() - 1;
        Integer curr = stack.get(lastIdx);
        stack.remove(lastIdx);
        sort(stack);
        putInStack(stack, curr);
    }
    
    private static void putInStack(List<Integer> stack, Integer val) {
        if (stack.isEmpty()) {
            stack.add(val);
            return;
        }
        int lastIdx = stack.size() - 1;
        Integer topEl = stack.get(lastIdx);
        if (val.compareTo(topEl) >= 0) {
            stack.add(val);
            return;
        }
        stack.remove(lastIdx);
        putInStack(stack, val);
        stack.add(topEl);
    }

}
