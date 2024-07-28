package rey.bos.levenshtein_distance;

public class Solution {

    //    " " a b c
    //" "   0 1 2 3
    //b     1 1 1 2
    //c     2 2 2 1
    public static int levenshteinDistance(String str1, String str2) {
        str1 = " " + str1;
        str2 = " " + str2;
        int[][] result = new int[str1.length()][str2.length()];
        for (int i = 0; i < result.length; i++) {
            result[i][0] = i;
        }
        for (int i = 0; i < result[0].length; i++) {
            result[0][i] = i;
        }
        for (int i = 1; i < result.length; i++) {
            for (int j = 1; j < result[0].length; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    result[i][j] = result[i - 1][j - 1];
                } else {
                    result[i][j] = 1 + Math.min(result[i - 1][j], Math.min(result[i][j - 1], result[i - 1][j - 1]));
                }
            }
        }
        return result[str1.length() - 1][str2.length() - 1];
    }

}
