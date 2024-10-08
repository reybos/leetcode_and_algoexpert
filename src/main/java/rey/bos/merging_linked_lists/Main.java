package rey.bos.merging_linked_lists;

public class Main {

    public static void main(String[] args) {
        Solution.LinkedList[] first = new Solution.LinkedList[] {
            new Solution.LinkedList(1, null),
            new Solution.LinkedList(1, new Solution.LinkedList(0, new Solution.LinkedList(1, null))),
            new Solution.LinkedList(1, new Solution.LinkedList(0, new Solution.LinkedList(1, null))),
            new Solution.LinkedList(2, null)
        };
        Solution.LinkedList[] second = new Solution.LinkedList[] {
            new Solution.LinkedList(0, null),
            new Solution.LinkedList(0, null),
            new Solution.LinkedList(0, new Solution.LinkedList(1, null)),
            new Solution.LinkedList(1, new Solution.LinkedList(0, new Solution.LinkedList(2, null)))
        };
        int[] expected = new int[] {-1, -1, 0, 2};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.mergingLinkedLists(first[i], second[i]).value == expected[i]) {
                System.out.println("test passed");
            } else {
                System.out.println("test failed");
            }
        }
    }

}
