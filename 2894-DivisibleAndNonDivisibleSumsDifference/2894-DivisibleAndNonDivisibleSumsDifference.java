// Last updated: 9/21/2026, 2:23:58 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        return (n*(n+1)/2)-(2*m*(n/m)*((n/m)+1)/2);
    }
}