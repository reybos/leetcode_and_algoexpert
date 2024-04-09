package rey.bos.tournament_winner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    private static final int WIN_CONDITION = 1;

    public static String tournamentWinner(List<List<String>> competitions, List<Integer> result) {
        Map<String, Integer> scoreTable = new HashMap<>();
        String highScoreCommand = "";
        scoreTable.put(highScoreCommand, 0);
        String gameWinner;
        for (int i = 0; i < competitions.size(); i++) {
            gameWinner = result.get(i) == WIN_CONDITION 
                ? competitions.get(i).get(0) 
                : competitions.get(i).get(1);
            if (!scoreTable.containsKey(gameWinner)) {
                scoreTable.put(gameWinner, 1);
            } else {
                scoreTable.computeIfPresent(gameWinner, (k, v) -> v + 1);
            };
            if (scoreTable.get(gameWinner) > scoreTable.get(highScoreCommand)) 
                highScoreCommand = gameWinner;
        }
        return highScoreCommand;
    }
}
