package rey.bos.balanced_brackets;

public class Main {

    public static void main(String[] args) {
        String[] arrays = new String[] {"()[]{}{", "([])(){}(())()()", "()()[{()})]", "{}()", "()([])"};
        boolean[] expected = new boolean[] {false, true, false, true, true};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.balancedBrackets(arrays[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
