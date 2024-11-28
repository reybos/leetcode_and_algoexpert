package rey.bos.longest_palindromic_substring;

public class Main {

    public static void main(String[] args) {
        String[] input = new String[] {
            "abaxyzzyxf", "a", "it's highnoon", "noon high it is", "abcdefgfedcbazzzzzzzzzzzzzzzzzzzz",
            "z234a5abbbba54a32z"
        };
        String[] expected = new String[] {
            "xyzzyx", "a", "noon", "noon", "zzzzzzzzzzzzzzzzzzzz", "5abbbba5"
        };
        for (int i = 0; i < expected.length; i++) {
            if (Solution.longestPalindromicSubstring(input[i]).equals(expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
