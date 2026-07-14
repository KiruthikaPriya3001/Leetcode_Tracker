// Last updated: 7/14/2026, 2:08:35 PM
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int r[] = new int[n+n];
        for(int i=0;i<n;i++){
            r[i]=nums[i];
            r[n+n-i-1]=nums[i];
        }
        return r;
    }
}