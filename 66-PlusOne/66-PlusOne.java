// Last updated: 7/14/2026, 2:12:24 PM
class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; --i) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        int[] result = new int[length + 1];
        result[0] = 1; 
        return result;
    }
}