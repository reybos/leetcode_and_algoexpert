package rey.bos.middle_node;

public class Solution {

    public static LinkedList middleNode(LinkedList linkedList) {
        int counter = 1;
        LinkedList newList = linkedList;
        while (newList.node != null) {
            counter++;
            newList = newList.node;
        }
        for (int i = 0; i < counter / 2; i++) {
            linkedList = linkedList.node;
        }
        return linkedList;
    }

}
