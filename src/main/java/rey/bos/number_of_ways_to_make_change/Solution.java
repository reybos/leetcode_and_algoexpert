package rey.bos.number_of_ways_to_make_change;

public class Solution {

    public int change(int amount, int[] coins) {
        int[] changeVariant = new int[amount + 1];
        changeVariant[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            for (int j = 1; j < changeVariant.length; j++) {
                if (j >= coin) {
                    changeVariant[j] = changeVariant[j] + changeVariant[j - coin];
                }
            }
        }
        return changeVariant[amount];
    }
    
}
