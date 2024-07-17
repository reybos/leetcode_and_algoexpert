package rey.bos.best_seat;


public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {1}, new int[] {1, 0, 1, 0, 0, 0, 1}, new int[] {1, 0, 1}, new int[] {1, 0, 0, 1},
            new int[] {1, 1, 1, 1}, new int[] {1, 0, 0, 1, 0, 0, 1}, new int[] {1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1}
        };
        int[] expected = new int[] {-1, 4, 1, 1, -1, 1, 3};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.bestSeat(arrays[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
