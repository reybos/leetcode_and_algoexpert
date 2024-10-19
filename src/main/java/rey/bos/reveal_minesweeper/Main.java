package rey.bos.reveal_minesweeper;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[][][] boards = new String[][][] {
            new String[][] {new String[] {"M", "M"}, new String[] {"H", "H"}, new String[] {"H", "H"}},
            new String[][] {new String[] {"M", "M"}, new String[] {"H", "H"}, new String[] {"H", "H"}},
            new String[][] {new String[] {"M", "M"}, new String[] {"H", "H"}, new String[] {"H", "H"}},
            new String[][] {new String[] {"H"}},
            new String[][] {new String[] {"M"}},
            new String[][] {new String[] {"M", "H"}},
        };
        int[] rows = new int[] {2, 1, 0, 0, 0, 0};
        int[] columns = new int[] {0, 0, 0, 0, 0, 1};
        String[][][] expected = new String[][][] {
            new String[][] {new String[] {"M", "M"}, new String[] {"2", "2"}, new String[] {"0", "0"}},
            new String[][] {new String[] {"M", "M"}, new String[] {"2", "H"}, new String[] {"H", "H"}},
            new String[][] {new String[] {"X", "M"}, new String[] {"H", "H"}, new String[] {"H", "H"}},
            new String[][] {new String[] {"0"}},
            new String[][] {new String[] {"X"}},
            new String[][] {new String[] {"M", "1"}},
        };
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.deepEquals(Solution.revealMinesweeper(boards[i], rows[i], columns[i]), expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
