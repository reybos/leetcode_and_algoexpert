package rey.bos.semordnilap;

import java.util.*;

public class Solution {

    public static List<List<String>> semordnilap(String[] strings) {
        Set<String> stringsSet = new HashSet<>();
        List<List<String>> result = new ArrayList<>();
        for (String str : strings) {
            stringsSet.add(str);
        }
        for (String str : strings) {
            String reverce = new StringBuilder(str).reverse().toString();
            if (stringsSet.contains(reverce) && !str.equals(reverce)) {
                stringsSet.remove(str);
                stringsSet.remove(reverce);
                result.add(List.of(str, reverce));
            }
        }
        return result;
    }

}
