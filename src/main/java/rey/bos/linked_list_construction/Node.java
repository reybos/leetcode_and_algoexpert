package rey.bos.linked_list_construction;

import java.util.Objects;

public class Node {

    public int value;
    public Node prev;
    public Node next;

    public Node(int value, Node prev, Node next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node node)) return false;
        return value == node.value
            && ((prev != null && node.prev != null && prev.value == node.prev.value)
                || (prev == null && node.prev == null))
            && ((next != null && node.next != null && next.value == node.next.value)
                || (next == null && node.next == null));
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, prev, next);
    }

}
