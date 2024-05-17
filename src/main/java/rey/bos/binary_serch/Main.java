package rey.bos.binary_serch;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int[] target = new int[] {1, 4, 3, 8, 9, 0};
        int[] expected = new int[] {0, 3, 2, 7, -1, -1};
        checkSolution(array, target, expected);
        array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        target = new int[] {1, 5, 3, 9};
        expected = new int[] {0, 4, 2, 8};
        checkSolution(array, target, expected);
    }

    private static void checkSolution(int[] array, int[] target, int[] expected) {
        for (int i = 0; i < target.length; i++) {
            if (Solution.binarySearch(array, target[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
