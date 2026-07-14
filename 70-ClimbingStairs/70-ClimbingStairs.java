// Last updated: 7/14/2026, 2:12:19 PM
class Solution {
    public int climbStairs(int n) {
        int first = 0, next = 1;
        for(int i=0; i<n; i++){
            int temp = first;
            first = next;
            next = first + temp;
        }
        return next;
    }
}