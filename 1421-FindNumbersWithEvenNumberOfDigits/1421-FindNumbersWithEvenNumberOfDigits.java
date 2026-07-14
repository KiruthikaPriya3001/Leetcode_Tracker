// Last updated: 7/14/2026, 2:09:44 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = 0;
            int n = num;
            while (n > 0) {
                digits++;
                n /= 10;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}