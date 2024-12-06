package rey.bos.one_edit;

public class Main {

    public static void main(String[] args) {
        String[] one = new String[] {"hello", "hello", "hllo", "a", "aaa", "a", "abc", "bb", "bb"};
        String[] two = new String[] {"hollo", "hllo", "hello", "a", "aaa", "b", "b", "ab", "bbb"};
        boolean[] expected = new boolean[] {true, true, true, true, true, true, false, true, true};
        for (int i = 0; i < expected.length; i++) {
            if (Solution.oneEdit(one[i], two[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
