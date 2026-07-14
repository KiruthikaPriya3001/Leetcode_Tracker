// Last updated: 7/14/2026, 2:08:47 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        return (n*(n+1)/2)-(2*m*(n/m)*((n/m)+1)/2);
    }
}