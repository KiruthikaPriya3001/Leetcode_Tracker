// Last updated: 7/14/2026, 2:08:37 PM
class Solution {
    public String getEncryptedString(String s, int k) {
        int n = s.length();
        k%=n;
        return s.substring(k)+s.substring(0,k);
    }
}