package rey.bos.middle_node;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<LinkedList> lists = List.of(
            new LinkedList(1, null),
            new LinkedList(1, new LinkedList(2, null)),
            new LinkedList(1, new LinkedList(2, new LinkedList(3, null))),
            new LinkedList(1, new LinkedList(2, new LinkedList(3, new LinkedList(4, null)))),
            new LinkedList(1, new LinkedList(2, new LinkedList(3, new LinkedList(4, new LinkedList(5, null)))))
        );
        List<LinkedList> expected = List.of(
            new LinkedList(1, null),
            new LinkedList(2, null),
            new LinkedList(2, null),
            new LinkedList(3, null),
            new LinkedList(3, null)
        );
        for (int i = 0; i < expected.size(); i++) {
            if (expected.get(i).value == Solution.middleNode(lists.get(i)).value) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
