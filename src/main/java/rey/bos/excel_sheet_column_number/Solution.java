package rey.bos.excel_sheet_column_number;

class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int counter = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            char letter = columnTitle.charAt(i);
            result += (letter - 'A' + 1) * Math.pow(26, counter);
            counter++;
        }
        return result;
    }
}