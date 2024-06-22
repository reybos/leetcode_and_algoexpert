package rey.bos.remove_linked_list_elements;

class Solution {

    public ListNode removeElements(ListNode head, int val) {
        ListNode result = null;
        ListNode temp = null;
        while (head != null) {
            if (head.val != val) {
                if (result == null) {
                    result = new ListNode(head.val);
                    temp = result;
                } else {
                    temp.next = new ListNode(head.val);
                    temp = temp.next;
                }
            }
            head = head.next;
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}

