package rey.bos.cycle_in_graph;

public class Solution {

    public static boolean cycleInGraph(int[][] edges) {
        int size = edges.length;
        boolean[] visited = new boolean[size];
        boolean[] inStack = new boolean[size];
        for (int i = 0; i < size; i++) {
            if (visited[i]) {
                continue;
            }
            if (isCycle(edges, i, visited, inStack)) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean isCycle(int[][] edges, int node, boolean[] visited, boolean[] inStack) {
        visited[node] = true;
        inStack[node] = true;
        
        for (int edge : edges[node]) {
            if (!visited[edge]) {
                if (isCycle(edges, edge, visited, inStack)) {
                    return true;
                }
            } else if (inStack[edge]) {
                return true;
            }
        }
        
        inStack[node] = false;
        return false;
    }

}
