package rey.bos.tournament_winner;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<List<String>>> competitions = List.of(
            List.of(List.of("A", "B"), List.of("A", "C")),
            List.of(List.of("A", "B")),
            List.of(List.of("A", "B"), List.of("A", "C"), List.of("B", "C"))
        );
        List<List<Integer>> results = List.of(
            List.of(1, 1), List.of(0), List.of(0, 1, 1)
        );
        List<String> output = List.of("A", "B", "B");
        for (int i = 0; i < output.size(); i++) {
            if (Solution.tournamentWinner(competitions.get(i), results.get(i)).equals(output.get(i))) {
                System.out.println("Test " + i + " is passed");
            } else {
                System.out.println("Test " + i + " is failed");
            }
        }
    }
    
}
