package rey.bos.count_squares;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    
    public static int countSquares(int[][] points) {
        if (points.length < 4) {
            return -1;
        }
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 2; i++) {
            seen.add(convertToString(points[i]));
        }
        int count = 0;
        for (int i = 2; i < points.length - 1; i++) {
            int[] firstP = points[i]; //1, 0
            for (int j = i + 1; j < points.length; j++) {
                int[] secondP = points[j];//3, 0
                double midX = (firstP[0] + secondP[0]) / 2.0; //2
                double midY = (firstP[1] + secondP[1]) / 2.0; //0
                double distX = firstP[0] - midX;
                double distY = firstP[1] - midY;
                double[] thirdP = new double[] {midX - distY, midY + distX};
                String third = convertToString(thirdP);
                double[] fourP = new double[] {midX - distY, midY + distX};
                String four = convertToString(fourP);
                if (seen.contains(third) && seen.contains(four)) {
                    count++;
                }
            }
            seen.add(convertToString(firstP));
        }
        return count == 0 ? -1 : count;
    }
    
    private static String convertToString(int[] point) {
        return point[0] + " " + point[1];
    }

    private static String convertToString(double[] point) {
        return (int) point[0] + " " + (int) point[1];
    }

}
