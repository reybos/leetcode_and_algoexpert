package rey.bos.best_digits;

public class Solution {
    
    public static String bestDigits(String number, int numDigits) {//1
        int idx = -1;//-1
        StringBuilder result = new StringBuilder();//62
        for (char ch : number.toCharArray()) {
            if (idx < 0 || numDigits == 0) {
                result.append(ch);
                idx++;
                continue;
            }
            char last = result.charAt(idx); //4
            while (last < ch && numDigits > 0) {
                result.deleteCharAt(idx--);
                numDigits--;
                if (idx < 0) {
                    break;
                }
                last = result.charAt(idx);
            }
            result.append(ch);
            idx++;
        }
        while (numDigits > 0) {
            result.deleteCharAt(idx--);
            numDigits--;
        }
        return result.toString();
    }

}
