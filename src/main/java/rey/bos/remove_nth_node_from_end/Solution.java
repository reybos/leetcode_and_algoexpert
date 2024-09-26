package rey.bos.remove_nth_node_from_end;

public class Solution {

    //1 - 2 - 3 - 4
    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        LinkedList kNode = head;
        LinkedList lastNode = head;
        for (int i = 0; i < k; i++) {
            lastNode = lastNode.next;
        }
        if (lastNode == null) {
            head.value = head.next.value;
            head.next = head.next.next;
            return;
        }
        while (lastNode.next != null) {
            kNode = kNode.next;
            lastNode = lastNode.next;
        }
        kNode.next = kNode.next.next;
    }

    public static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }

}
