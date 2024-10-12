package rey.bos.phone_number_mnemonics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {

    private final static Map<Character, char[]> DICT = Map.of(
        '1', new char[] {'1'},
        '2', new char[] {'a', 'b', 'c'},
        '3', new char[] {'d', 'e', 'f'},
        '4', new char[] {'g', 'h', 'i'},
        '5', new char[] {'j', 'k', 'l'},
        '6', new char[] {'m', 'n', 'o'},
        '7', new char[] {'p', 'q', 'r', 's'},
        '8', new char[] {'t', 'u', 'v'},
        '9', new char[] {'w', 'x', 'y', 'z'},
        '0', new char[] {'0'}
    );

    public static List<String> phoneNumberMnemonics(String phoneNumber) {
        List<String> result = new ArrayList<>();
        phoneNumberMnemonics(phoneNumber, 0, result, new StringBuilder());
        return result;
    }
    
    private static void phoneNumberMnemonics(String phoneNumber, int idx, List<String> result, StringBuilder mnemonic) {
        if (mnemonic.length() == phoneNumber.length()) {
            result.add(mnemonic.toString());
            return;
        }
        char currNum = phoneNumber.charAt(idx++);
        char[] dict = DICT.get(currNum);
        for (char c : dict) {
            StringBuilder mnemonicNext = new StringBuilder(mnemonic);
            mnemonicNext.append(c);
            phoneNumberMnemonics(phoneNumber, idx, result, mnemonicNext);
        }
    }

}
