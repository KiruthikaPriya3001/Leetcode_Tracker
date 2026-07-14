// Last updated: 7/14/2026, 2:11:33 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; 
            char currentChar = (char) (columnNumber % 26 + 'A');
            ans.append(currentChar);
            columnNumber /= 26;
        }
        return ans.reverse().toString();
    }
}
