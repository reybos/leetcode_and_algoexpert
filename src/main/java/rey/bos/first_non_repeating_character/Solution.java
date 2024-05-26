package rey.bos.first_non_repeating_character;

import java.util.*;

public class Solution {

    public static int firstNonRepeatingCharacter(String str) {
		if (str.length() == 0) {
			return -1;
		}
		Map<Character, Integer> count = new HashMap<>();
		for (char c : str.toCharArray()) {
            count.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }
        for (int i = 0; i < str.length(); i++) {
        	if (count.get(str.charAt(i)) == 1) {
        		return i;
        	}
        }
        return -1;
    }

}
