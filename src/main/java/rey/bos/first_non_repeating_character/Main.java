package rey.bos.first_non_repeating_character;

public class Main {

    public static void main(String[] args) {
        String[] input = new String[] {"abcdcaf", "faadabcbbebdf", "a", "ab", "ababac", "", "aabbccddeeff"};
        int[] expected = new int[] {1, 6, 0, 0, 5, -1, -1};
        for (int i = 0; i < input.length; i++) {
            if (Solution.firstNonRepeatingCharacter(input[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
