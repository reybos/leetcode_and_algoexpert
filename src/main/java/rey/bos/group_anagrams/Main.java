package rey.bos.group_anagrams;

import org.apache.commons.collections4.CollectionUtils;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<String>> input = List.of(
            List.of("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"), List.of(), List.of("yo")
        );
        List<List<List<String>>> expected = List.of(
            List.of(List.of("yo", "oy"), List.of("flop", "olfp"), List.of("act", "tac", "cat"), List.of("foo")),
            List.of(), List.of(List.of("yo"))
        );
        for (int i = 0; i < expected.size(); i++) {
            if (CollectionUtils.isEqualCollection(Solution.groupAnagrams(input.get(i)), expected.get(i))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
