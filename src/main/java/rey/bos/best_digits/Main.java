package rey.bos.best_digits;

public class Main {

    public static void main(String[] args) {
        String[] numbers = new String[] {"462839", "19", "999", "123", "123"};
        int[] numDigits = new int[] {2, 1, 1, 1, 2};
        String[] expected = new String[] {"6839", "9", "99", "23", "3"};

        for (int i = 0; i < expected.length; i++) {
            if (Solution.bestDigits(numbers[i], numDigits[i]).equals(expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
