// Last updated: 7/14/2026, 2:12:25 PM
class Solution {
    public int lengthOfLastWord(String s) {
       s=s.trim();
       int lastSpaceIndex = s.lastIndexOf(' ');
       return s.length()-lastSpaceIndex-1; 
    }
}