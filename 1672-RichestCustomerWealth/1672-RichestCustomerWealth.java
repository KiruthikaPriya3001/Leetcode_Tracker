// Last updated: 9/21/2026, 2:25:32 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[]customer:accounts){
            int currentSum=0;
            for(int money:customer){
                currentSum+=money;
            }
            if(currentSum > maxWealth){
                maxWealth = currentSum;
            }
        }
        return maxWealth;
    }
}