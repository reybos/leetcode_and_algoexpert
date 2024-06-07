package rey.bos.pascals_triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));
        if (numRows > 1) {
            result.add(List.of(1, 1));
        }
        List<Integer> prevRow;
        for (int i = 3; i <= numRows; i++) {
            prevRow = result.get(i - 2);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 2; j < i; j++) {
                newRow.add(prevRow.get(j - 2) + prevRow.get(j - 1));
            }
            newRow.add(1);
            result.add(newRow);
        }
        return result;
    }
    
}
