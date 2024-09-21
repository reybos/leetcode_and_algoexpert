package rey.bos.cycle_in_graph;

public class Main {

    public static void main(String[] args) {
        int[][][] arrays = new int[][][] {
            new int[][] {
                new int[] {1, 3},
                new int[] {2, 3, 4},
                new int[] {0},
                new int[] {},
                new int[] {2, 5},
                new int[] {},
            },
            new int[][] {
                new int[] {1, 2},
                new int[] {2},
                new int[] {}
            },
            new int[][] {
                new int[] {1, 2},
                new int[] {2},
                new int[] {1}
            },
            new int[][] {
                new int[] {0}
            }
        };
        boolean[] expected = new boolean[] {true, false, true, true};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.cycleInGraph(arrays[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
