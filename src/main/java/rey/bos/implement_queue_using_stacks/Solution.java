package rey.bos.implement_queue_using_stacks;

import java.util.Stack;

public class Solution {

    private final Stack<Integer> incoming;
    private final Stack<Integer> outgoing;

    public Solution() {
        incoming = new Stack<>();
        outgoing = new Stack<>();
    }

    public void push(int x) {
        incoming.push(x);
        moveElements();
    }

    public int pop() {
        moveElements();
        return outgoing.pop();
    }

    public int peek() {
        moveElements();
        return outgoing.peek();
    }

    public boolean empty() {
        return incoming.empty() && outgoing.empty();
    }

    private void moveElements() {
        if (outgoing.empty()) {
            while (!incoming.empty()) {
                outgoing.push(incoming.pop());
            }
        }
    }

}
