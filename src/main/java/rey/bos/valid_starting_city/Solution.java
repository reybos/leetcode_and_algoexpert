package rey.bos.valid_starting_city;

public class Solution {

    public static int validStartingCity(int[] distances, int[] fuel, int mpg) {
        int miles = fuel[0] * mpg - distances[0];
        int minMiles = miles;
        int cityIndex = 1;
        for (int i = 1; i < distances.length; i++) {
            miles += (fuel[i] * mpg - distances[i]);
            if (miles < minMiles) {
                minMiles = miles;
                cityIndex = i + 1;
            }
        }
        return cityIndex % distances.length;
    }

}
