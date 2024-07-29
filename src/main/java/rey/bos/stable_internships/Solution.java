package rey.bos.stable_internships;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    // interns
    // 0 1
    // 1 0
    //team
    // 0 1
    // 1 0
    public static int[][] stableInternships(int[][] interns, int[][] teams) {
        if (interns.length == 0) {
            return new int[][]{};
        }
        int[] choices = new int[interns.length];
        Map<Integer, Integer> internships = new HashMap<>();
        Map<Integer, Map<Integer, Integer>> teamPreferences = new HashMap<>();
        for (int i = 0; i < teams.length; i++) {
            Map<Integer, Integer> teamPreference = new HashMap<>();
            teamPreferences.put(i, teamPreference);
            for (int j = 0; j < teams[i].length; j++) {
                teamPreference.put(teams[i][j], j);
            }
        }
        Stack<Integer> freeInterns = new Stack<>();
        freeInterns.push(0);
        int nextIntern = 1;
        while (!freeInterns.empty()) {
            int currIntern = freeInterns.pop();
            int wishTeam = interns[currIntern][choices[currIntern]++];
            if (internships.get(wishTeam) == null) {
                internships.put(wishTeam, currIntern);
                if (nextIntern < interns.length) {
                    freeInterns.push(nextIntern++);
                }
                continue;
            }
            int existIntern = internships.get(wishTeam);
            Map<Integer, Integer> teamPreference = teamPreferences.get(wishTeam);
            if (teamPreference.get(currIntern) < teamPreference.get(existIntern)) {
                internships.put(wishTeam, currIntern);
                freeInterns.push(existIntern);
            } else {
                freeInterns.push(currIntern);
            }
        }
        int[][] result = new int[interns.length][2];
        for (int i = 0; i < teams.length; i++) {
            result[i] = new int[] {internships.get(i), i};
//            System.out.println(Arrays.toString(result[i]));
        }
        return result;
    }

}
