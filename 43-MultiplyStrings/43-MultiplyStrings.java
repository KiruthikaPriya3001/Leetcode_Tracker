// Last updated: 7/14/2026, 2:12:41 PM
import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger b = new BigInteger(num1);
        BigInteger c = new BigInteger(num2);

        BigInteger a = b.multiply(c);

        String ans = a.toString();
        
        return ans;
    }
}