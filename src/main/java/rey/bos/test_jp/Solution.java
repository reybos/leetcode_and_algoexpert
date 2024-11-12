package rey.bos.test_jp;

import java.util.List;

public class Solution {

    //(M&F) - true
    //O
    // (E| (M&F) )
    public static boolean canBePrepared(String reciept, List<String> engr) {
        return check(reciept, engr);
    }

    // (E| (M&F) )
    //O
    //(M&F)
    //"((O|B) &F)"
    private static boolean check(String curr, List<String> engr) {
        StringBuilder currBuild = new StringBuilder(curr);
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        String condition = "";
        if (curr.charAt(0) == '(' && curr.charAt(curr.length() - 1) == ')') {
            currBuild.deleteCharAt(0);
            currBuild.deleteCharAt(currBuild.length() - 1);
        }

        int counter = 0;
        for (char ch : currBuild.toString().toCharArray()) {
             if (ch == '(') {
                counter++;
                if (condition.isEmpty()) {
                    left.append(ch);
                } else {
                    right.append(ch);
                }
            } else if (ch == ')') {
                counter--;
                 if (condition.isEmpty()) {
                     left.append(ch);
                 } else {
                     right.append(ch);
                 }
            } else if ((ch == '&' || ch == '|') && counter == 0) {
                condition = String.valueOf(ch);
            } else if (condition.isEmpty()) {
                left.append(ch);
            } else {
                right.append(ch);
            }
        }
        if (!condition.isEmpty()) {
            if (condition.equals("&")) {
                return check(left.toString(), engr) && check(right.toString(), engr);
            } else {
                return check(left.toString(), engr) || check(right.toString(), engr);
            }
        }
        return engr.contains(left.toString());
    }

}
