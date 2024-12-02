package rey.bos.reverse_words_in_string;

public class Main {

    public static void main(String[] args) {
        String[] input = new String[] {
            "AlgoExpert is the best!", "Reverse These Words", "..H,, hello 678", "1 12 23 34 56", " ", "1", " 1", "1 "
        };
        String[] expected = new String[] {
            "best! the is AlgoExpert", "Words These Reverse", "678 hello ..H,,", "56 34 23 12 1", " ", "1", "1 ", " 1"
        };
        for (int i = 0; i < expected.length; i++) {
            if (Solution.reverseWordsInString(input[i]).equals(expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
