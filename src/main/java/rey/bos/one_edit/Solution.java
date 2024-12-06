package rey.bos.one_edit;

public class Solution {

//hello
//hollo
    public static boolean oneEdit(String stringOne, String stringTwo) {
        if (Math.abs(stringOne.length() - stringTwo.length()) > 1) {
            return false;
        }
        int oneIdx = 0;
        int twoIdx = 0;
        int count = 0;
        while (oneIdx < stringOne.length() && twoIdx < stringTwo.length()) {
            char one = stringOne.charAt(oneIdx);
            char two = stringTwo.charAt(twoIdx);
            if (one == two) {
                oneIdx++;
                twoIdx++;
                continue;
            }
            count++;
            if (count > 1) {
                return false;
            }
            if (stringOne.length() > stringTwo.length()) {
                oneIdx++;
            } else if (stringOne.length() < stringTwo.length()) {
                twoIdx++;
            } else {
                oneIdx++;
                twoIdx++;
            }
            
        }
        return true;
    }

}
