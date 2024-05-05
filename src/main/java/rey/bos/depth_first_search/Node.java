package rey.bos.depth_first_search;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private final String name;
    private final List<Node> children;

    public Node(String name, List<Node> children) {
        this.name = name;
        this.children = children == null ? new ArrayList<>() : children;
    }

    public String getName() {
        return name;
    }

    public List<Node> getChildren() {
        return children;
    }

    public List<String> depthFirstSearch() {
        List<String> result = new ArrayList<>();
        depthFirstSearch(this, result);
        return result;
    }
    
    private void depthFirstSearch(Node tree, List<String> result) {
        result.add(tree.getName());
        for (int i = 0; i < tree.getChildren().size(); i++) {
            depthFirstSearch(tree.getChildren().get(i), result);
        }
    }


}