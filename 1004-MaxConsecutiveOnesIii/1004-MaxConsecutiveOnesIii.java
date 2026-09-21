// Last updated: 9/21/2026, 2:26:54 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j++] == 0) {
                k--;
            }
            if (k < 0) {
                if (nums[i++] == 0) {
                    k++;
                }
            }
        }
        return j - i;
    }
}