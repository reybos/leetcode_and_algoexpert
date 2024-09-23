package rey.bos.linked_list_construction;

public class Solution {

    static class DoublyLinkedList {

        public Node head;
        public Node tail;

        public void setHead(Node node) {
            if (head == null) {
                head = node;
                tail = node;
            } else if (head.equals(tail)) {
                node.next = tail;
                head = node;
                tail.prev = head;
            } else {
                node.next = head;
                head = node;
            }
        }

        public void setTail(Node node) {
            // Write your code here.
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            // Write your code here.
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            // Write your code here.
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            // Write your code here.
        }

        public void removeNodesWithValue(int value) {
            // Write your code here.
        }

        public void remove(Node node) {
            // Write your code here.
        }

    }
}
