package rey.bos.class_photo;

import java.util.*;

public class Solution {

    public static boolean classPhotos(List<Integer> redShirtHeights, List<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        List<Integer> secondLine = null;
        List<Integer> firstLine = null;
        for (int i = redShirtHeights.size() - 1; i >= 0; i--) {
            if (redShirtHeights.get(i) - blueShirtHeights.get(i) > 0) {
                secondLine = redShirtHeights;
                firstLine = blueShirtHeights;
                break;
            } else if (redShirtHeights.get(i) - blueShirtHeights.get(i) < 0) {
                secondLine = blueShirtHeights;
                firstLine = redShirtHeights;
                break;
            }
        }
        if (secondLine == null) {
            return false;
        }
        for (int i = secondLine.size() - 1; i >= 0; i--) {
            if (secondLine.get(i) - firstLine.get(i) <= 0) {
                return false;
            }
        }
        return true;
    }

}
