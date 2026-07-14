// Last updated: 7/14/2026, 2:11:24 PM
class Solution {
    public int rob(int[] nums) {
        int NoRob = 0;
        int Rob = 0;
        for (int currentValue : nums) {
            int tempNoRob = Math.max(NoRob, Rob);
            Rob = NoRob + currentValue;
            NoRob = tempNoRob;
        }
        return Math.max(NoRob, Rob);
    }
}
