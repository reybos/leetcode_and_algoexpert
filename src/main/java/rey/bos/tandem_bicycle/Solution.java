package rey.bos.tandem_bicycle;

import java.util.*;

public class Solution {

    public static int tandemBicycle(
            List<Integer> redShirtSpeeds, List<Integer> blueShirtSpeeds, boolean fastest
    ) {
        Collections.sort(redShirtSpeeds);
        if (fastest) {
            Collections.sort(blueShirtSpeeds, Collections.reverseOrder());
        } else {
            Collections.sort(blueShirtSpeeds);
        }
        int result = 0;
        for (int i = 0; i < redShirtSpeeds.size(); i++) {
            result += Math.max(redShirtSpeeds.get(i), blueShirtSpeeds.get(i));
        }
        return result;
    }
}
