package rey.bos.node_depth;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<BST> trees = List.of(
                new BST(10, new BST(5, null, null), new BST(15, null, null)),
                new BST(1,
                        new BST(2,
                                new BST(4,
                                        new BST(8, null, null),
                                        new BST(9, null, null)),
                                new BST(5,
                                        new BST(10, null, null),
                                        null)),
                        new BST(3,
                                new BST(6, null, null),
                                new BST(7, null, null)))
        );
        List<Integer> expected = List.of(2, 19);

        for (int i = 0; i < trees.size(); i++) {
            if (expected.get(i).equals(Solution.findDepth(trees.get(i)))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
