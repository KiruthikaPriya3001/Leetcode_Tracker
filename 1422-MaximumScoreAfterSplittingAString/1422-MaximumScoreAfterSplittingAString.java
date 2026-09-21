// Last updated: 9/21/2026, 2:26:10 PM
class Solution {
    public int maxScore(String s) {
       int o = 0;
       for(char c : s.toCharArray()){
        if(c=='1'){
            o++;
        }
       } 
       int z = 0, max = 0;
       for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)=='0'){
            z++;
        }else{
            o--;
        }
        max = Math.max(max,z+o);
    
       }
       return max;
    }
}