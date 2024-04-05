package rey.bos.is_subsequence;

public class Main {

    public static void main(String[] args) {
		String[] subsequences = new String[]{"ae", "ab", "de", "cd", "a", "f"};
		String[] strings = new String[]{"abcde", "abcde", "abcde", "abcde", "abcde", "abcde"};
		boolean[] expected = new boolean[]{true, true, true, true, true, false};
		for (int i = 0; i < subsequences.length; i++) {
			if (Solution.isSubsequence(subsequences[i], strings[i]) == expected[i]) {
				System.out.println("test " + i + " passed");
			} else {
				System.out.println("test " + i + " failed");
			}
		}
    }

}
