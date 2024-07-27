package rey.bos.min_number_of_coins_for_change;

public class Solution {

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int[] amounts = new int[amount + 1];
        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            for (int j = 1; j < amounts.length; j++) {
                int change = j - coin;
                if (change > 0 && amounts[change] > 0 || change == 0) {
                    if (amounts[j] > 0) {
                        amounts[j] = Math.min(amounts[j], 1 + amounts[change]);
                    } else {
                        amounts[j] = 1 + amounts[change];
                    }
                }
            }
        }
        return amounts[amount] == 0 ? -1 : amounts[amount];
    }

}
