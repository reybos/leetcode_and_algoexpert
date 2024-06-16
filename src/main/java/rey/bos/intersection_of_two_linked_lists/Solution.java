package rey.bos.intersection_of_two_linked_lists;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode lastA = headA;
        ListNode lastB = headB;
        int lengthA = 1;
        while (lastA.next != null) {
            lastA = lastA.next;
            lengthA++;
        }
        int lengthB = 1;
        while (lastB.next != null) {
            lastB = lastB.next;
            lengthB++;
        }
        if (!lastA.equals(lastB)) {
            return null;
        }
        ListNode shortest = lengthA > lengthB ? headB : headA;
        ListNode longest = lengthA > lengthB ? headA : headB;
        for (int i = 0; i < Math.abs(lengthA - lengthB); i++) {
            longest = longest.next;
        }
        ListNode result = null;
        while (shortest != null) {
            if (shortest.equals(longest) && result == null) {
                result = shortest;
            } else if (!shortest.equals(longest) && result != null) {
                result = null;
            }
            shortest = shortest.next;
            longest = longest.next;
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

