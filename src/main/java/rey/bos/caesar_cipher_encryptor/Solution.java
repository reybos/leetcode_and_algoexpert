package rey.bos.caesar_cipher_encryptor;

public class Solution {

    public static String caesarCypherEncryptor(String str, int key) {
        int smallKey = key % 26;
        char[] encrypted = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            encrypted[i] = (char) (str.charAt(i) + smallKey);
            if (encrypted[i] > 'z') {
                encrypted[i] -= 26;
            }
        }
        return new String(encrypted);
    }
}
