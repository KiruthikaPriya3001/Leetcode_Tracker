// Last updated: 7/14/2026, 2:09:29 PM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String s:words){
            boolean isconsistent = true;
            for(char c:s.toCharArray()){
                if(!allowed.contains(s.valueOf(c))){
                    isconsistent = false;
                    break;
                }
            }
            if(isconsistent){
                count++;
            }
        }
        return count;
    }
}