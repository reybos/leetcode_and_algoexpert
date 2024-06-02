package rey.bos.add_binary;

class Solution {
    public String addBinary(String a, String b) {
        char[] result = new char[Math.max(a.length(), b.length()) + 1];
        char[] sum = new char[2];
        int i = a.length() - 1;
        int j = b.length() - 1;
        int k = result.length - 1;
        while (i >= 0 || j >= 0) {
            char first = i >= 0 ? a.charAt(i--) : '0';
            char second = j >= 0 ? b.charAt(j--) : '0';
            sum[1] = result[k];
            add(first, second, sum);
            result[k--] = sum[1];
            result[k] = sum[0];
        }
        return result[0] == '1' ? new String(result) : new String(result, 1, result.length - 1);
    }

    private void add(char a, char b, char[] sum) {
        if (a == '0' && b == '0') {
            sum[0] = '0';
            sum[1] = sum[1] == '1' ? '1' : '0';
        } else if (a == '1' && b == '1') {
            sum[0] = '1';
            sum[1] = sum[1] == '1' ? '1' : '0';
        } else {
            if (sum[1] == '1') {
                sum[0] = '1';
                sum[1] = '0';
            } else {
                sum[0] = '0';
                sum[1] = '1';
            }
        }
    }

}