package rey.bos.minimum_characters_for_words;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[][] input = new String[][] {
            new String[] {"this", "that", "did", "deed", "them!", "a"}, new String[] {"a", "abc", "ab", "boo"}
        };
        char[][] expected = new char[][] {
            new char[] {'t', 't', 'h', 'i', 's', 'a', 'd', 'd', 'e', 'e', 'm', '!'},
            new char[] {'a', 'b', 'c', 'o', 'o'}
        };
        for (int i = 0; i < expected.length; i++) {
            Arrays.sort(expected[i]);
            if (Arrays.equals(Solution.minimumCharactersForWords(input[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
