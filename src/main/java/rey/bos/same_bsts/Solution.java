package rey.bos.same_bsts;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    //10, 15, 8, 12, 94, 81, 5, 2, 11
    //10, 8, 5, 15, 2, 12, 11, 94, 81
    public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
        if (CollectionUtils.isEmpty(arrayOne) && CollectionUtils.isEmpty(arrayTwo)) {
            return true;
        } else if (arrayOne == null || arrayTwo == null) {
            return false;
        }
        if (arrayOne.size() != arrayTwo.size() || arrayOne.get(0).intValue() != arrayTwo.get(0).intValue()) {
            return false;
        }
        List<Integer> leftOne = getLeft(arrayOne);
        List<Integer> leftTwo = getLeft(arrayTwo);
        
        List<Integer> rightOne = getRight(arrayOne);
        List<Integer> rightTwo = getRight(arrayTwo);
        return sameBsts(leftOne, leftTwo) && sameBsts(rightOne, rightTwo);
    }
    
    private static List<Integer> getLeft(List<Integer> array) {
        int root = array.get(0);
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < array.size(); i++) {
            int num = array.get(i);
            if (num < root) {
                result.add(num);
            }
        }
        return result;
    }
    
    private static List<Integer> getRight(List<Integer> array) {
        int root = array.get(0);
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < array.size(); i++) {
            int num = array.get(i);
            if (num >= root) {
                result.add(num);
            }
        }
        return result;
    }
    
}
