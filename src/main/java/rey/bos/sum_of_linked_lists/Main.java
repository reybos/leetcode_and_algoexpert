package rey.bos.sum_of_linked_lists;

public class Main {

    public static void main(String[] args) {
        Solution.LinkedList [] first = new Solution.LinkedList[] {
            new Solution.LinkedList(9, new Solution.LinkedList(9)),
            new Solution.LinkedList(1, new Solution.LinkedList(1)),
            new Solution.LinkedList(0),
            new Solution.LinkedList(1, new Solution.LinkedList(1))
        };
        Solution.LinkedList [] second = new Solution.LinkedList[] {
            new Solution.LinkedList(9, new Solution.LinkedList(9)),
            new Solution.LinkedList(1, new Solution.LinkedList(1)),
            new Solution.LinkedList(0),
            new Solution.LinkedList(0)
        };
        Solution.LinkedList [] expected = new Solution.LinkedList[] {
            new Solution.LinkedList(8, new Solution.LinkedList(9, new Solution.LinkedList(1))),
            new Solution.LinkedList(2, new Solution.LinkedList(2)),
            new Solution.LinkedList(0),
            new Solution.LinkedList(1, new Solution.LinkedList(1))
        };
        for (int i = 0; i < expected.length; i++) {
            if (expected[i].equals(Solution.sumOfLinkedLists(first[i], second[i]))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
