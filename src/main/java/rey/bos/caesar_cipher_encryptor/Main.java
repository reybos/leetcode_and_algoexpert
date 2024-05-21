package rey.bos.caesar_cipher_encryptor;

public class Main {

    public static void main(String[] args) {
        String[] input = new String[]{"xyz", "abc", "abc", "abc", "abc", "abc"};
        int[] keys = new int[] {2, 0, 3, 26, 52, 57};
        String[] expected = new String[]{"zab", "abc", "def", "abc", "abc", "fgh"};
        for (int i = 0; i < input.length; i++) {
            if (Solution.caesarCypherEncryptor(input[i], keys[i]).equals(expected[i])) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
