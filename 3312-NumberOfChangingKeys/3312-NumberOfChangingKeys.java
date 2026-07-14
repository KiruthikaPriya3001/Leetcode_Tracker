// Last updated: 7/14/2026, 2:08:42 PM
class Solution {
    public int countKeyChanges(String s) {
        int c = 0;
        s = s.toLowerCase();
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                c++;
            }
        }
        return c;
    }
}