// Last updated: 7/14/2026, 2:11:49 PM
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ones = 0 ,twos = 0;
        for(int i=0;i<=n-1;i++)
        {
            ones = (ones ^ nums[i]) & ~twos;
            twos = (twos ^ nums[i]) & ~ones;
        }
       return ones;
    }
    
}