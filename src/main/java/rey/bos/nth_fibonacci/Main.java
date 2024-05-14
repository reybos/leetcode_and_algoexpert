package rey.bos.nth_fibonacci;

public class Main {

    public static void main(String[] args) {
        int[] input = new int[] {1, 2, 6, 3, 4};
        int[] expected = new int[] {0, 1, 5, 1, 2};
        System.out.println("Solution 1");
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] == Solution.getNthFib(input[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }

        System.out.println();
        System.out.println("Solution 2");
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] == Solution2.getNthFib(input[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
