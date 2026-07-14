// Last updated: 7/14/2026, 2:12:31 PM
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        return dividend / divisor;
    }
}