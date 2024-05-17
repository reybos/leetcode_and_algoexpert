package rey.bos.product_sum;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static int productSum(List<Object> array) {
		return productSum(array, 1);
    }
    
    private static int productSum(List<Object> array, int lvl) {
    	int sum = 0;
    	for (Object item : array) {
    		if (item instanceof List) {
    			sum += productSum((List) item, lvl + 1);
    		} else {
    			sum += (Integer) item;
    		}
    	}
    	return sum * lvl;
    }

}
