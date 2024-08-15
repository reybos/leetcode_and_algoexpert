package rey.bos.river_sizes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public static List<Integer> riverSizes(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (visited[i][j]) {
                    continue;
                }
                visited[i][j] = true;
                if (matrix[i][j] == 0) {
                    continue;
                }
                int length = 0;
                Queue<int[]> forCheck = new LinkedList<>();
                forCheck.add(new int[] {i, j});
                while (!forCheck.isEmpty()) {
                    int[] curr = forCheck.poll();
                    if (matrix[curr[0]][curr[1]] == 1) {
                        length++;
                        if (curr[0] - 1 >= 0 && !visited[curr[0] - 1][curr[1]]) {
                            forCheck.add(new int[] {curr[0] - 1, curr[1]});
                            visited[curr[0] - 1][curr[1]] = true;
                        }
                        if (curr[1] - 1 >= 0 && !visited[curr[0]][curr[1] - 1]) {
                            forCheck.add(new int[] {curr[0], curr[1] - 1});
                            visited[curr[0]][curr[1] - 1] = true;
                        }
                        if (curr[0] + 1 < matrix.length && !visited[curr[0] + 1][curr[1]]) {
                            forCheck.add(new int[] {curr[0] + 1, curr[1]});
                            visited[curr[0] + 1][curr[1]] = true;
                        }
                        if (curr[1] + 1 < matrix[curr[0]].length && !visited[curr[0]][curr[1] + 1]) {
                            forCheck.add(new int[] {curr[0], curr[1] + 1});
                            visited[curr[0]][curr[1] + 1] = true;
                        }
                    }
                }
                result.add(length);
            }
        }
        return result;
    }

}
