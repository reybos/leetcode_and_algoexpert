package rey.bos.palindrome_check;

public class Main {

    public static void main(String[] args) {
        String[] input = new String[] {"abcdcba", "a", "ab", "aba", "abb", "abba"};
        boolean[] expected = new boolean[] {true, true, false, true, false, true};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.isPalindrome(input[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
