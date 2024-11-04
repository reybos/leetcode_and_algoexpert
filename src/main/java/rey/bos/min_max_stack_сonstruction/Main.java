package rey.bos.min_max_stack_сonstruction;

public class Main {

    public static void main(String[] args) {
        var stack = new Solution.MinMaxStack();
        stack.push(1);
        if (stack.getMax() == 1 && stack.getMin() == 1 && stack.peek() == 1) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        stack.push(5);
        if (stack.getMax() == 5 && stack.getMin() == 1 && stack.peek() == 5) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        stack.push(-1);
        if (stack.getMax() == 5 && stack.getMin() == -1 && stack.peek() == -1) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        stack.pop();
        if (stack.getMax() == 5 && stack.getMin() == 1 && stack.peek() == 5) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
    }

}
