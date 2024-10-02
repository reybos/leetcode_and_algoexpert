package rey.bos.sum_of_linked_lists;

import java.util.Objects;

public class Solution {

    public static LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
        int balance = linkedListOne.value + linkedListTwo.value; 
        linkedListOne = linkedListOne.next;
        linkedListTwo = linkedListTwo.next;
        LinkedList head = new LinkedList(balance % 10); 
        balance /= 10; 
        LinkedList curr = head;
        while (linkedListOne != null || linkedListTwo != null || balance > 0) {
            if (linkedListOne != null) {
                balance += linkedListOne.value; 
                linkedListOne = linkedListOne.next;
            }
            if (linkedListTwo != null) {
                balance += linkedListTwo.value; 
                linkedListTwo = linkedListTwo.next;
            }
            curr.next = new LinkedList(balance % 10);
            curr = curr.next;
            balance /= 10;
        }
        return head;
    }

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }

        public LinkedList(int value, LinkedList next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof LinkedList that)) return false;
            return value == that.value && Objects.equals(next, that.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, next);
        }

    }

}
