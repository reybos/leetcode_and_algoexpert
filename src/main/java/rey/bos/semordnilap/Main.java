package rey.bos.semordnilap;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[][] input = new String[][] {
            new String[]{}, new String[] {"aaa", "bbbb"}, new String[] {"dog", "god"},
            new String[] {"dog", "hello", "god"}, new String[] {"abcde", "bcd", "dcb", "edcba", "aaa"}
        };
        List<List<String>> test1 = new ArrayList<>();
        List<List<String>> test2 = new ArrayList<>();
        List<List<String>> test3 = new ArrayList<>(List.of(List.of("dog", "god")));
        List<List<String>> test4 = new ArrayList<>(List.of(List.of("dog", "god")));
        List<List<String>> test = new ArrayList<>(List.of(List.of("abcde", "edcba"), List.of("bcd", "dcb")));
        List<List<List<String>>> expected = List.of(
            test1, test2, test3, test4, test
        );
        for (int i = 0; i < input.length; i++) {
            if (Solution.semordnilap(input[i]).equals(expected.get(i))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
