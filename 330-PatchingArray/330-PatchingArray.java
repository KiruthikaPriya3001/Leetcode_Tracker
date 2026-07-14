// Last updated: 7/14/2026, 2:10:47 PM
class Solution {
    public int minPatches(int[] nums, int n) {
        int count = 0;
        long missing = 1;
        int i = 0;

        while(missing<=n){
            if(i<nums.length && nums[i]<=missing){
                missing +=nums[i++];
            }else{
                missing += missing;
                count++;
            }
        }
        return count;
    }
}