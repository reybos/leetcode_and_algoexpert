package rey.bos.linked_list_construction;

public class Main {

    public static void main(String[] args) {
        Solution.DoublyLinkedList list = new Solution.DoublyLinkedList();
        Node tail = new Node(2, null, null);
        Node head = new Node(1, null, null);
        list.setHead(tail);
        list.setHead(head);
        Node expectedTail = new Node(2, null, null);
        Node expectedHead = new Node(1, null, null);
        expectedTail.prev = expectedHead;
        expectedHead.next = expectedTail;
        if (expectedTail.equals(list.tail) && expectedHead.equals(list.head)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
    }

}
