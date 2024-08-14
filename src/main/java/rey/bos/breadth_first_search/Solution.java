package rey.bos.breadth_first_search;

import java.util.*;

public class Solution {

    static class Node {
        String name;
        List<Node> children = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> breadthFirstSearch() {
            List<String> result = new ArrayList<>();
            Queue<Node> nodes = new LinkedList<>();
            nodes.add(this);
            while(!nodes.isEmpty()) {
                Node curr = nodes.poll();
                result.add(curr.name);
                nodes.addAll(curr.children);
            }
            return result;
        }

        public void addChild(String name) {
            Node child = new Node(name);
            children.add(child);
        }

        public void addChild(Node child) {
            children.add(child);
        }
    }

}
