// Last updated: 7/14/2026, 2:12:29 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0,right = nums.length;
        while(left<right){
            int mid = (left+right)>>>1;
            if(nums[mid]>=target)right = mid;
            else left = mid+1;
        }
        return left;
    }
}