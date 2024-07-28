package rey.bos.levenshtein_distance;

public class Main {

    public static void main(String[] args) {
        String[] str1 = new String[] {"abc", "", "abc", "abc", "abc", "abc", "abc", "algoexpert"};
        String[] str2 = new String[] {"yabd", "", "", "abc", "abx", "abcx", "yabcx", "algozexpert"};
        int[] expected = new int[] {2, 0, 3, 0, 1, 1, 2, 1};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.levenshteinDistance(str1[i], str2[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
