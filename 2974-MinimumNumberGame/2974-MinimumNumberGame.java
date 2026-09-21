// Last updated: 9/21/2026, 2:23:54 PM
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[]output = new int[nums.length];
        for(int i=0;i<nums.length;i+=2){
            output[i]=nums[i+1];
            output[i+1]=nums[i];
        }
        return output;
    }
}