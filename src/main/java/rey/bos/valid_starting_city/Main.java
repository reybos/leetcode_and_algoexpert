package rey.bos.valid_starting_city;

public class Main {

    public static void main(String[] args) {
        int[][] distances = new int[][] {
            new int[] {5, 25, 15, 10, 15}, new int[] {5, 2, 3}, new int[] {4, 6}
        };
        int[][] fuel = new int[][] {
            new int[] {1, 2, 1, 0, 3}, new int[] {1, 0, 1}, new int[] {1, 9}
        };
        int[] mpg = new int[] {10, 5, 1};
        int[] expected = new int[] {4, 2, 1};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.validStartingCity(distances[i], fuel[i], mpg[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
