package rey.bos.majority_element_2;

public class Main {

    public static void main(String[] args) {
        int[][] arrays = new int[][] {
            new int[] {2}, new int[] {1, 2, 1}, new int[] {3, 3, 1}, new int[] {1, 2, 3, 2, 2, 1, 2},
            new int[] {1, 2, 3, 4, 4, 4, 4, 4, 4, 4, 3, 2, 1}
        };
        int[] expected = new int[] {2, 1, 3, 2, 4};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.majorityElement(arrays[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
