package rey.bos.sunset_views;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static List<Integer> sunsetViews(int[] buildings, String direction) {
        List<Integer> result = new ArrayList<>();
        
        if (direction.equals("WEST")) {
            checkWest(buildings, result);
        } else {
            checkEast(buildings, result);
            Collections.reverse(result);
        }
        
        return result;
    }
    
    private static void checkWest(int[] buildings, List<Integer> result) {
        int max = buildings[0];
        result.add(0);
        for (int i = 1; i < buildings.length; i++) {
            if (buildings[i] > max) {
                max = buildings[i];
                result.add(i);
            }
        }
    }
    
    private static void checkEast(int[] buildings, List<Integer> result) {
        int max = buildings[buildings.length - 1];
        result.add(buildings.length - 1);
        for (int i = buildings.length - 2; i >= 0; i--) {
            if (buildings[i] > max) {
                max = buildings[i];
                result.add(i);
            }
        }
    }
    
}
