package rey.bos.run_ength_encoding;

public class Main {

    public static void main(String[] args) {
        String[] input = new String[] {"AAAAAAAAAAAAABBCCCCDD", "aA", "122333", "    ", "1  222 333"};
        String[] expected = new String[] {"9A4A2B4C2D", "1a1A", "112233", "4 ", "112 321 33"};
        for (int i = 0; i < input.length; i++) {
            String result = Solution.runLengthEncoding(input[i]);
            if (result.equals(expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
