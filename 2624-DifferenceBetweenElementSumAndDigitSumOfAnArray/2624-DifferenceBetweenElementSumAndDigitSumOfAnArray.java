// Last updated: 7/14/2026, 2:08:57 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < nums.length; i++) {
            x = x + nums[i];
            int n = nums[i];
            while (n > 0) {
                y = y + (n % 10);
                n = n / 10;
            }
        }
        return x - y;
    }
}