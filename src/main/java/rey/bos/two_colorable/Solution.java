package rey.bos.two_colorable;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static boolean twoColorable(int[][] edges) {
        int[] colors = new int[edges.length];
        colors[0] = 1;
        Queue<Info> nodes = new LinkedList<>();
        fillNodes(0, edges, colors, nodes);
        while (!nodes.isEmpty()) {
            Info node = nodes.poll();
            if (colors[node.node] != 0 && colors[node.node] != node.color) {
                return false;
            } else if (colors[node.node] != 0 && colors[node.node] == node.color) {
                continue;
            }
            colors[node.node] = node.color;
            fillNodes(node.node, edges, colors, nodes);
        }
        return true;
    }
    
    private static void fillNodes(int node, int[][] edges, int[] colors, Queue<Info> nodes) {
        for (int edge : edges[node]) {
            nodes.add(new Info(edge, colors[node] * -1));
        }
    }
    
    private static class Info {
        int node;
        int color;
        
        public Info(int node, int color) {
            this.node = node;
            this.color = color;
        }
    }

}
