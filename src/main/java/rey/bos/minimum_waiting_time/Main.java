package rey.bos.minimum_waiting_time;

public class Main {

    public static void main(String[] args) {
        int[][] queries = new int[][] {
                new int[] {3, 2, 1, 2, 6}
        };
        int[] expected = new int[] {17};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.minimumWaitingTime(queries[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
