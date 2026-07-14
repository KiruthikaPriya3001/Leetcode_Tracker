// Last updated: 7/14/2026, 2:11:36 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0 , r = nums.length-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(nums[mid]<nums[mid+1]){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        return l;
    }
}