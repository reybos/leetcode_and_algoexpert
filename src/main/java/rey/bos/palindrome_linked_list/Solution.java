package rey.bos.palindrome_linked_list;

public class Solution {

    public boolean isPalindrome(ListNode head) {
        ListNode pointer = head;
        ListNode reverse = new ListNode(pointer.val);
        while (pointer.next != null) {
            pointer = pointer.next;
            reverse = new ListNode(pointer.val, reverse);
        }
        while (head != null) {
            if (head.val != reverse.val) {
                return false;
            }
            head = head.next;
            reverse = reverse.next;
        }
        return true;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
