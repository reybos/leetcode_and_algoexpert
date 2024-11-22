package rey.bos.colliding_asteroids;

import java.util.Stack;

public class Solution {

    public static int[] collidingAsteroids(int[] asteroids) {
        Stack<Integer> storage = new Stack<>();//5
        for (int asteroid : asteroids) {
            if (storage.isEmpty() || asteroid > 0) {
                storage.push(asteroid);
                continue;
            }
            while (!storage.isEmpty() && storage.peek() > 0 && asteroid < 0) {
                int stored = storage.pop();
                if (Math.abs(stored) > Math.abs(asteroid)) {
                    asteroid = 0;
                    storage.push(stored);
                } else if (Math.abs(stored) == Math.abs(asteroid)) {
                    asteroid = 0;
                }
            }
            if (asteroid != 0) {
                storage.push(asteroid);
            }
        }
        int[] result = new int[storage.size()];
        int idx = result.length - 1;
        while (!storage.isEmpty()) {
            result[idx--] = storage.pop();
        }
        return result;
    }

}
