package rey.bos.excel_sheet_column_title;

public class Solution {

    private final static char[] dict = new char[]{
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
        'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 26) {
            int remainder = columnNumber % 26;
            columnNumber /= 26;
            if (remainder == 0) {
                remainder = 26;
                columnNumber--;
            }
            result.append(dict[remainder - 1]);
        }
        result.append(dict[columnNumber - 1]);
        return result.reverse().toString();
    }

}
