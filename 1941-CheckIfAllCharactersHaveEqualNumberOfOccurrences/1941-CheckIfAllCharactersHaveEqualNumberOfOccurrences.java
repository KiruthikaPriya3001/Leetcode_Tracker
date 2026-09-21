// Last updated: 9/21/2026, 2:25:07 PM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[]count = new int[26];
        for(char ch : s.toCharArray()){
            count[ch-'a']++;
        }
        int freq = 0;
        for(int i=0;i<26;i++){
            if(count[i]>0){
                if(freq==0){
                    freq = count[i];
                }else if(count[i]!=freq){
                    return false;
                }
            }
        }
        return true;
    }
}