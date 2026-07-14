// Last updated: 7/14/2026, 2:11:52 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int curr_c=1,max_count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]-1==nums[i-1]) curr_c++;
            else{
                max_count=Math.max(max_count,curr_c);
                curr_c=1;
            }
        }
        return Math.max(max_count,curr_c);
    }
}