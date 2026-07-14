// Last updated: 7/14/2026, 2:09:41 PM
class Solution {
    public int maximum69Number(final int num) {
        int remainder = 0, base = 1, b = 1, curr = num;

        while(curr > 0) {
            remainder = curr % 10;
            curr /= 10;

            if(remainder == 6)
                b = base;

            base *= 10;
        }

        return num / b / 10 * b * 10 + 9 * b + num % b;
    }
}