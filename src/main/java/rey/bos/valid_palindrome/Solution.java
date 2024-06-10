package rey.bos.valid_palindrome;

class Solution {

    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start < end) {
            char first;
            do {
                first = tryToMakeLowerCase(s.charAt(start++));
            } while (!isAlphanumericLetter(first) && start <= end);
            char last;
            do {
                last = tryToMakeLowerCase(s.charAt(end--));
            } while (!isAlphanumericLetter(last) && start < end);
            if (isAlphanumericLetter(first) && isAlphanumericLetter(last) && last != first) {
                return false;
            }
        }
        return true;
    }

    private boolean isAlphanumericLetter(char ch) {
        return ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9';
    }

    private char tryToMakeLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + 32);
        }
        return ch;
    }

}