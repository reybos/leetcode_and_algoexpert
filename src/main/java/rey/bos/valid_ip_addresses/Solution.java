package rey.bos.valid_ip_addresses;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<String> validIPAddresses(String string) {
        if (string.length() > 12 || string.length() < 4) {
            return List.of();
        }
        List<String> result = new ArrayList<>();
        //0000
        for (int i = 0; i < 3; i++) {//i = 0
            String strPart = string.substring(0, Math.min(i + 1, string.length()));//0
            int intPart = Integer.parseInt(strPart);//0
            if (intPart > 255 || (strPart.charAt(0) == '0' && strPart.length() > 1)) {
                continue;
            }
            for (int j = i + 1; j < Math.min(i + 4, string.length()); j++) {//j = 1
                String strPart2 = string.substring(i + 1, Math.min(j + 1, string.length()));//0
                intPart = Integer.parseInt(strPart2);//0
                if (intPart > 255 || (strPart2.charAt(0) == '0' && strPart2.length() > 1)) {
                    continue;
                }
                for (int k = j + 1; k < Math.min(j + 4, string.length()); k++) {//k = 2; k < 5
                    String strPart3 = string.substring(j + 1, Math.min(k + 1, string.length()));//0
                    intPart = Integer.parseInt(strPart3);//0
                    if (
                        intPart > 255
                            || (strPart3.charAt(0) == '0' && strPart3.length() > 1)
                            || k + 1 >= string.length()
                    ) {
                        continue;
                    }
                    String strPart4 = string.substring(k + 1);
                    intPart = Integer.parseInt(strPart4);
                    if (intPart > 255 || (strPart4.charAt(0) == '0' && strPart4.length() > 1)) {
                        continue;
                    }
                    result.add(strPart + "." + strPart2 + "." + strPart3 + "." + strPart4);
                }
            }
        }
        return result;
    }

}
