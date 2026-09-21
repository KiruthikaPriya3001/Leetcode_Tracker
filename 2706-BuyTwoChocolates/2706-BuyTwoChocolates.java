// Last updated: 9/21/2026, 2:24:13 PM
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