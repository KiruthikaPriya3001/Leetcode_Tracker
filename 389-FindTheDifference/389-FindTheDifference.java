// Last updated: 9/21/2026, 2:29:14 PM
class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;
        for(char c : s.toCharArray()){
            ans^=c;
        }
        for(char c : t.toCharArray()){
            ans^=c;
        }
        return ans;
    }
}