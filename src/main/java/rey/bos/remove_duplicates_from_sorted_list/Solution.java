package rey.bos.remove_duplicates_from_sorted_list;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pointer = head;
        while (true) {
            if (pointer.next == null) {
                return head;
            } else if (pointer.val == pointer.next.val) {
                pointer.next = pointer.next.next;
                continue;
            }
            pointer = pointer.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
