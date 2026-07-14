// Last updated: 7/14/2026, 2:08:34 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int suma =0;
        int sumb =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
            suma+=nums[i];
        }else{
            sumb+=nums[i];
        }
        }
        if(suma!=sumb)
        {
            return true;
        }
        return false;
    }
}
          