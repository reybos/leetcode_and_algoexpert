package rey.bos.merging_linked_lists;

public class Solution {

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value, LinkedList next) {
            this.value = value;
            this.next = next;
        }
    }

    public static LinkedList mergingLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
        int oneLength = findLength(linkedListOne);
        int twoLength = findLength(linkedListTwo);
        LinkedList pointerOne = linkedListOne;
        LinkedList pointerTwo = linkedListTwo;
        if (oneLength > twoLength) {
            pointerOne = skip(pointerOne, oneLength - twoLength);
        } else {
            pointerTwo = skip(pointerTwo, twoLength - oneLength);
        }
        LinkedList result = null;
        while (pointerOne != null || pointerTwo != null) {
            if (pointerOne.value == pointerTwo.value && result == null) {
                result = pointerOne;
            } else if (pointerOne.value != pointerTwo.value) {
                result = new LinkedList(-1, null);
            }
            pointerOne = pointerOne.next;
            pointerTwo = pointerTwo.next;
        }
        return result;
    }
    
    private static int findLength(LinkedList list) {
        int length = 0;
        while (list != null) {
            length++;
            list = list.next;
        }
        return length;
    }
    
    private static LinkedList skip(LinkedList list, int count) {
        while (count > 0) {
            list = list.next;
            count--;
        }
        return list;
    }

}
