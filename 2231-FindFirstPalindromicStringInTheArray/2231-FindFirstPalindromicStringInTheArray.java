// Last updated: 7/14/2026, 2:09:11 PM
class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
        String s = words[i];
        String rev = new StringBuilder(s).reverse().toString();
        if(s.equals(rev)){
            return s;
        }
        }
        return "";
    }
}