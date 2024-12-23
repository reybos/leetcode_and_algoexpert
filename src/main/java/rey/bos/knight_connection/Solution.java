package rey.bos.knight_connection;

import java.util.*;

public class Solution {

    public static int knightConnection(int[] knightA, int[] knightB) {
        Queue<int[]> nextMoves = new LinkedList<>();
        nextMoves.add(new int[] {knightA[0], knightA[1], 0});
        Set<String> visited = new HashSet<>();
        visited.add(Arrays.toString(knightA));
        while (!nextMoves.isEmpty()) {
            int[] possible = nextMoves.poll();
            if (check(possible, knightB)) {
                return possible[2] % 2 == 0 ? possible[2] / 2 : possible[2] / 2 + 1;
            }
            addNewMove(nextMoves, visited, possible);
        }
        return -1;
    }
    
    private static boolean check(int[] knightA, int[] knightB) {
        return knightA[0] == knightB[0] && knightA[1] == knightB[1];
    }
    
    private static void addNewMove(Queue<int[]> nextMoves, Set<String> visited, int[] currPosition) {
        int[][] moves = new int[][] {
            new int[] {2, 1}, new int[] {2, -1}, new int[] {-2, 1}, new int[] {-2, -1}, 
            new int[] {1, 2}, new int[] {1, -2}, new int[] {-1, 2}, new int[] {-1, -2}
        };
        for (int[] move : moves) {
            move[0] += currPosition[0];
            move[1] += currPosition[1];
            if (!visited.contains(Arrays.toString(move))) {
                nextMoves.add(new int[] {move[0], move[1], currPosition[2] + 1});
                visited.add(Arrays.toString(move));
            }
        }
    }

}
