// Last updated: 9/21/2026, 2:28:24 PM
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c=1,max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                c++;
            }else{
                c=1;
            }
            max = Math.max(max,c);
        }
        return max;
    }
}