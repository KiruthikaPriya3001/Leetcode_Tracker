// Last updated: 9/21/2026, 2:29:59 PM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            count+=n & 1;
            n = n >>> 1;
        }
        return count;
    }
}