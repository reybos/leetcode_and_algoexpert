package rey.bos.nth_fibonacci;

import java.util.*;

public class Solution2 {

    public static int getNthFib(int n) {
        Map<Integer, Integer> results = new HashMap<>();
        return getNthFib(n, results);
    }
    
    private static int getNthFib(int n, Map<Integer, Integer> results) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else if (results.get(n) != null) {
            return results.get(n);
        } else {
            results.put(n, getNthFib(n - 1, results) + getNthFib(n - 2, results));
            return results.get(n);
        }
    }

}
