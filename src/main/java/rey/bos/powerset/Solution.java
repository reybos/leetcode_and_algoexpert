package rey.bos.powerset;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<List<Integer>> powerset(List<Integer> array) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 0; i < array.size(); i++) {
            int size = result.size();
            for (int j = 0; j < size; j++) {
                List<Integer> mutate = new ArrayList<>(result.get(j));
                mutate.add(array.get(i));
                result.add(mutate);
            }
        }
        return result;
    }
    
}
