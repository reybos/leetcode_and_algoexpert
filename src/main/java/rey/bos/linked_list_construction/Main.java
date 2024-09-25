package rey.bos.linked_list_construction;

public class Main {

    public static void main(String[] args) {
        Solution.DoublyLinkedList list = new Solution.DoublyLinkedList();
        Node tail = new Node(3, null, null);
        Node node = new Node(2, null, null);
        Node head = new Node(1, null, null);
        list.setHead(tail);
        list.setHead(node);
        list.setHead(head);
        Node expectedTail = new Node(3, null, null);
        Node expectedHead = new Node(1, null, null);
        expectedTail.prev = node;
        expectedHead.next = node;
        if (expectedTail.equals(list.tail) && expectedHead.equals(list.head)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

        list = new Solution.DoublyLinkedList();
        tail = new Node(3, null, null);
        node = new Node(2, null, null);
        head = new Node(1, null, null);
        list.setTail(head);
        list.setTail(node);
        list.setTail(tail);
        expectedTail = new Node(3, null, null);
        expectedHead = new Node(1, null, null);
        expectedTail.prev = node;
        expectedHead.next = node;
        if (expectedTail.equals(list.tail) && expectedHead.equals(list.head)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

        list = new Solution.DoublyLinkedList();
        tail = new Node(3, null, null);
        node = new Node(2, null, null);
        head = new Node(1, null, null);
        list.setTail(head);
        list.setTail(node);
        list.setTail(tail);
        expectedTail = new Node(3, null, null);
        Node expectedNode = new Node(2, null, null);
        expectedHead = new Node(1, null, null);
        expectedTail.prev = expectedNode;
        expectedHead.next = expectedNode;
        expectedNode.prev = expectedHead;
        expectedNode.next = expectedTail;

        list.remove(expectedHead);

        expectedHead = expectedNode;
        expectedHead.prev = null;
        if (expectedTail.equals(list.tail) && expectedHead.equals(list.head)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

        list = new Solution.DoublyLinkedList();
        tail = new Node(3, null, null);
        node = new Node(2, null, null);
        head = new Node(1, null, null);
        list.setHead(tail);
        list.setHead(node);
        list.setHead(head);
        expectedTail = new Node(3, null, null);
        expectedNode = new Node(2, null, null);
        expectedHead = new Node(1, null, null);
        expectedTail.prev = expectedNode;
        expectedHead.next = expectedNode;
        expectedNode.prev = expectedHead;
        expectedNode.next = expectedTail;

        list.remove(expectedNode);

        expectedHead.next = expectedTail;
        expectedTail.prev = expectedHead;
        if (expectedTail.equals(list.tail) && expectedHead.equals(list.head)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

        list = new Solution.DoublyLinkedList();
        tail = new Node(3, null, null);
        node = new Node(1, null, null);
        head = new Node(1, null, null);
        list.setHead(tail);
        list.setHead(node);
        list.setHead(head);
        expectedTail = new Node(3, null, null);
        expectedHead = new Node(3, null, null);

        list.removeNodesWithValue(1);

        if (expectedTail.equals(list.tail) && expectedHead.equals(list.head)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

        list = new Solution.DoublyLinkedList();
        tail = new Node(3, null, null);
        node = new Node(2, null, null);
        head = new Node(1, null, null);
        list.setHead(tail);
        list.setHead(node);
        list.setHead(head);
        expectedTail = new Node(3, null, null);
        expectedHead = new Node(1, null, null);
        expectedTail.prev = expectedHead;
        expectedHead.next = expectedTail;

        list.removeNodesWithValue(2);

        if (expectedTail.equals(list.tail) && expectedHead.equals(list.head)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

        list = new Solution.DoublyLinkedList();
        tail = new Node(1, null, null);
        node = new Node(1, null, null);
        head = new Node(3, null, null);
        list.setHead(tail);
        list.setHead(node);
        list.setHead(head);
        expectedTail = new Node(3, null, null);
        expectedHead = new Node(3, null, null);

        list.removeNodesWithValue(1);

        if (expectedTail.equals(list.tail) && expectedHead.equals(list.head)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

        list = new Solution.DoublyLinkedList();
        tail = new Node(1, null, null);
        node = new Node(1, null, null);
        head = new Node(1, null, null);
        list.setHead(tail);
        list.setHead(node);
        list.setHead(head);

        list.removeNodesWithValue(1);

        if (list.tail == null && list.head == null) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
    }

}
