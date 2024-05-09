package rey.bos.remove_duplicates_from_linked_list;

import java.util.Objects;

class Solution {

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value, LinkedList next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof LinkedList that)) return false;
            return value == that.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }
    
    public static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList next = linkedList.next;
        LinkedList current = linkedList;
        while (next != null) {
            if (next.value == current.value) {
                next = next.next;
                current.next = next;
                continue;
            }
            current = next;
            next = next.next;
        } 
        return linkedList;
    }
}