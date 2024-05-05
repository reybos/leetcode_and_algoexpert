package rey.bos.depth_first_search;

import rey.bos.evaluate_expression_tree.Solution;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Node> trees = List.of(
                new Node("A", List.of(
                        new Node("B", List.of(
                                new Node("E", null),
                                new Node("F", List.of(
                                        new Node("I", null), new Node("J", null)
                                ))
                        )),
                        new Node("C", null),
                        new Node("D", List.of(
                                new Node("G", List.of(
                                        new Node("K", null)
                                )),
                                new Node("H", null)
                        ))
                ))
        );
        List<List<String>> expected = List.of(
                List.of("A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H")
        );

        for (int i = 0; i < expected.size(); i++) {
            if (expected.get(i).equals(trees.get(i).depthFirstSearch())) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
