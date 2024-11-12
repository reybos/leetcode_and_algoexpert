package rey.bos.test_jp;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] receps = new String[] {
            "O", "(M&F)", "(M&F)", "(E|(M&F))", "(EI(M&F))", "(E|(M&F))",
        };
        List<List<String>> engr = List.of(
            List.of("O"), List.of("M", "F"), List.of("M", "E"), List.of("M", "E"), List.of("M", "B"), List.of("M", "F")
        );
        boolean[] expected = new boolean[] {true, true, false, true, false, true};
        for (int i = 0; i < receps.length; i++) {
            System.out.println(Solution.canBePrepared(receps[i], engr.get(i)) + " - " + expected[i]);
        }
    }

}
