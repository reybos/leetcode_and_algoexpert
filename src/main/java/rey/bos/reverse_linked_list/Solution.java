package rey.bos.reverse_linked_list;

class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        while (head != null) {
            ListNode next = result;
            result = new ListNode(head.val);
            result.next = next;
            head = head.next;
        }
        return result;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}