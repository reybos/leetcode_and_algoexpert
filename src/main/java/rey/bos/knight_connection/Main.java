package rey.bos.knight_connection;

public class Main {

    public static void main(String[] args) {
        int[][] knightA = new int[][] {
            new int[] {0, 0}, new int[] {0, 0}, new int[] {15, -12}, new int[] {0, 0}, new int[] {1, 0}, new int[] {1, 1}
        };
        int[][] knightB = new int[][] {
            new int[] {4, 2}, new int[] {0, 0}, new int[] {15, -12}, new int[] {1, 0}, new int[] {0, 0}, new int[] {0, 0}
        };
        int[] expected = new int[] {1, 0, 0, 2, 2, 1};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.knightConnection(knightA[i], knightB[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
