package rey.bos.breadth_first_search;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution.Node g = new Solution.Node("G");
        g.addChild("K");
        Solution.Node f = new Solution.Node("F");
        f.addChild("I");
        f.addChild("J");
        Solution.Node d = new Solution.Node("D");
        d.addChild(g);
        d.addChild("H");
        Solution.Node b = new Solution.Node("B");
        b.addChild("E");
        b.addChild(f);
        Solution.Node a = new Solution.Node("A");
        a.addChild(b);
        a.addChild("C");
        a.addChild(d);
        List<String> expected = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K");
        if (expected.equals(a.breadthFirstSearch())) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
    }

}
