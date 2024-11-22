package rey.bos.reverse_polish_notation;

public class Main {

    public static void main(String[] args) throws Exception {
        String[][] arrays = new String[][] {
            new String[] {"50", "3", "17", "+", "2", "-", "/"}, new String[] {"10"}, new String[] {"10", "5", "+"},
            new String[] {"10", "5", "-"}, new String[] {"10", "5", "/"}, new String[] {"10", "5", "*"}
        };
        int[] expected = new int[] {2, 10, 15, 5, 2, 50};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.reversePolishNotation(arrays[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
