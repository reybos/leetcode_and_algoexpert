package rey.bos.pascals_triangle_second;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return List.of(1);
        } else if (rowIndex == 1) {
            return List.of(1, 1);
        }
        List<Integer> prev = List.of(1, 1);
        List<Integer> curr = List.of();
        for (int i = 2; i <= rowIndex; i++) {
            curr = new ArrayList<>();
            curr.add(1);
            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);
            prev = curr;
        }
        return curr;
    }
}