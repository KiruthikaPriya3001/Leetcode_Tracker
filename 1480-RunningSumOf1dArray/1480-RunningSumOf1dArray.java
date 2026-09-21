// Last updated: 9/21/2026, 2:25:50 PM
class Solution {
    public int[] runningSum(int[] nums) {
       for(int i=1;i<nums.length;i++){
        nums[i]+=nums[i-1];
       }
       return nums; 
    }
}