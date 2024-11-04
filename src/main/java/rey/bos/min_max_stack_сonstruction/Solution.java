package rey.bos.min_max_stack_сonstruction;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    static class MinMaxStack {

        private int idx = -1;
        private final List<Integer> stack = new ArrayList<>();
        private final List<Integer> min = new ArrayList<>();
        private final List<Integer> max = new ArrayList<>();


        public int peek() {
            return stack.get(idx);
        }

        public int pop() {
            Integer number = stack.get(idx);
            stack.remove(idx);
            min.remove(idx);
            max.remove(idx);
            idx--;
            return number;
        }

        public void push(Integer number) {
            stack.add(number);
            if (idx == -1) {
                min.add(number);
                max.add(number);
                idx++;
                return;
            }
            min.add(Math.min(min.get(idx), number));
            max.add(Math.max(max.get(idx), number));
            idx++;
        }

        public int getMin() {
            return min.get(idx);
        }

        public int getMax() {
            return max.get(idx);
        }
    }

}
