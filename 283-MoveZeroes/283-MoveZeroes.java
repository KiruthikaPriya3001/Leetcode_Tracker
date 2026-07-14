// Last updated: 7/14/2026, 2:10:56 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int temp;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                temp=nums[count];
                nums[count]=nums[i];
                nums[i]=temp;
                count++;
            }
        }
    }
}
