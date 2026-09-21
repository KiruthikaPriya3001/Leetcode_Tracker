// Last updated: 9/21/2026, 2:26:27 PM
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[]c = new int[nums.length+1];
        c[0]=1;
        int odd = 0;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
               odd++;
            }if(odd>=k){
                ans+=c[odd-k];
            }
            c[odd]++;
        }
        return ans;
    }
}