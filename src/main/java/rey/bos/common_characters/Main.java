package rey.bos.common_characters;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[][] input = new String[][] {
            new String[] {"abc", "bcd", "cbad"}, new String[] {"a"}, new String[] {"a", "b", "c"},
            new String[] {"aa", "aa"}, new String[] {"aaaa", "a"}
        };
        String[][] expected = new String[][] {
            new String[] {"b", "c"}, new String[] {"a"}, new String[] {}, new String[] {"a"}, new String[] {"a"}
        };
        for (int i = 0; i < input.length; i++) {
            if (Arrays.equals(Solution.commonCharacters(input[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
