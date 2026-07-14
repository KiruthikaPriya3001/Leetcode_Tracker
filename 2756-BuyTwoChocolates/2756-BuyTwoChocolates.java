// Last updated: 7/14/2026, 2:08:52 PM
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if((prices[0]+prices[1])<=money){
            return money - (prices[0]+prices[1]);
        }else{
            return money;
        }
    }
}