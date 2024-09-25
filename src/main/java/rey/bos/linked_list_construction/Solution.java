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
                head.prev = node;
                head = node;
            }
        }

        public void setTail(Node node) {
            if (tail == null) {
                tail = node;
                head = node;
            } else if (tail.equals(head)) {
                node.prev = head;
                tail = node;
                head.next = tail;
            } else {
                node.prev = tail;
                tail.next = node;
                tail = node;
            }
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
            Node curr = head;
            while (curr != null) {
                Node delete = curr;
                curr = curr.next;
                if (delete.value == value) {
                    if (head.equals(tail)) {
                        head = null;
                        tail = null;
                    } else if (head.equals(delete)) {
                        head = head.next;
                        head.prev = null;
                    } else if (tail.equals(delete)) {
                        tail = tail.prev;
                        tail.next = null;
                    } else {
                        delete.prev.next = delete.next;
                        delete.next.prev = delete.prev;
                    }
                }
            }
        }

        public void remove(Node node) {
            if (node == null) {
                return;
            }
            if (head.equals(node)) {
                head = head.next;
                head.prev = null;
                return;
            } else if (tail.equals(node)) {
                tail = tail.prev;
                tail.next = null;
                return;
            }
            Node curr = head;
            while (curr.next != null && !curr.next.equals(node)) {
                curr = curr.next;
            }
            if (curr.next == null) {
                return;
            }
            curr.next = curr.next.next;
            curr.next.prev = curr;
        }

    }
}
