// Last updated: 7/14/2026, 2:11:09 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            for(int j=i+1;j<=i+k && j<n;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}