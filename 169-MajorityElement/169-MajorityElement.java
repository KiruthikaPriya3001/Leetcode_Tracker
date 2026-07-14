// Last updated: 7/14/2026, 2:11:31 PM
class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1) return nums[0];
        Arrays.sort(nums);
        int n= nums.length/2;
        if(nums.length%2==0)
        {
            return nums[n-1];
        }
        return nums[n];
    }
}