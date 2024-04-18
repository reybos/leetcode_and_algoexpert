package rey.bos.non_constructible_change;

import java.util.Arrays;

public class Solution {

    public static int find(int[] coins) {
        Arrays.sort(coins);
        int currChange = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] > currChange + 1) {
                return currChange + 1;
            }
            currChange += coins[i];
        }
        return currChange + 1;
    }

}
