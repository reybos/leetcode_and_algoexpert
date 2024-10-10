package rey.bos.permutations;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<List<Integer>> getPermutations(List<Integer> array) {
        if (CollectionUtils.isEmpty(array)) {
            return new ArrayList<>();
        }
        ArrayList<List<Integer>> result = new ArrayList<>();
        getPermutations(result, array, new ArrayList<>());
        return result;
    }
    
    private static void getPermutations(List<List<Integer>> result, List<Integer> curr, List<Integer> permutation) {
        if (CollectionUtils.isEmpty(curr)) {
            result.add(permutation);
            return;
        }
        for (int i = 0; i < curr.size(); i++) {
            Integer num = curr.get(i);
            List<Integer> permutationCopy = new ArrayList<>(permutation);
            permutationCopy.add(num);
            List<Integer> currCopy = new ArrayList<>(curr);
            currCopy.remove(num);
            getPermutations(result, currCopy, permutationCopy);
        }
    }

}
