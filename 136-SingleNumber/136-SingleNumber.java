// Last updated: 7/14/2026, 2:11:51 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; 
        }
        return result;
    }
}