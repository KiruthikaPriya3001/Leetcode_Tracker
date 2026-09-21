// Last updated: 9/21/2026, 2:28:49 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int o = 0, max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                o++;
            }else{
                o=0;
            }
            max = Math.max(max,o);
        }
        return max;
    }
}