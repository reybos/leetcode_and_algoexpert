package rey.bos.remove_duplicates_from_linked_list;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Solution.LinkedList> trees = List.of(
            new Solution.LinkedList(1, null),
            new Solution.LinkedList(1, new Solution.LinkedList(1, null)),
            new Solution.LinkedList(
                1, new Solution.LinkedList(
                1, new Solution.LinkedList(
                2, new Solution.LinkedList(
                2, new Solution.LinkedList(
                3, null))))
            )
        );
        List<Solution.LinkedList> expected = List.of(
            new Solution.LinkedList(1, null),
            new Solution.LinkedList(1, null),
            new Solution.LinkedList(1, new Solution.LinkedList(2, new Solution.LinkedList(3, null)))
        );

        for (int i = 0; i < expected.size(); i++) {
            if (expected.get(i).equals(Solution.removeDuplicatesFromLinkedList(trees.get(i)))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
