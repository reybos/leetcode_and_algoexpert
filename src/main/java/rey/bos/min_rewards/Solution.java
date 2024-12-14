package rey.bos.min_rewards;

import java.util.Arrays;

public class Solution {

    //8, 4, 2, 1, 3, 6, 7, 9, 5
    //4, 3, 2, 1, 2, 3, 4, 5, 1
    public static int minRewards(int[] scores) {
        int[] rewards = new int[scores.length];
        Arrays.fill(rewards, 1);
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > scores[i - 1]) {
                rewards[i] = rewards[i - 1] + 1;
            }
        }
        for (int i = scores.length - 2; i >= 0; i--) {
            if (scores[i] > scores[i + 1]) {
                rewards[i] = Math.max(rewards[i + 1] + 1, rewards[i]);
            }
        }
        int sum = 0;
        for (int reward : rewards) {
            sum += reward;
        }
        return sum;
    }

}
