// Last updated: 9/21/2026, 2:25:25 PM
class Solution {
    public boolean squareIsWhite(String coordinates) {
        return(coordinates.charAt(0)+coordinates.charAt(1))%2==0?false:true;        
    }
}