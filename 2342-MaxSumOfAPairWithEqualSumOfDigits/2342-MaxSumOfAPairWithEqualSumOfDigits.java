// Last updated: 9/21/2026, 2:24:31 PM
class Solution {
    public int maximumSum(int[] nums) {
        int[] max = new int[82];
        int ans = -1;

        for (int n : nums) {
            int sum = 0, x = n;

            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }

            if (max[sum] > 0)
                ans = Math.max(ans, max[sum] + n);

            max[sum] = Math.max(max[sum], n);
        }

        return ans;
    }
}