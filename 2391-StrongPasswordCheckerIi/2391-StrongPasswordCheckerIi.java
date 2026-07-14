// Last updated: 7/14/2026, 2:09:04 PM
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int u=0,l=0,d=0,s=0;
        if(password.length()<8) return false;
        for(int i=0;i<password.length();i++){
            char t=password.charAt(i);
            if((i>0)&&(t==password.charAt(i-1))) return false;
            if(t>='A' && t<='Z')u++;
            else if(t>='a' && t<='z')l++;
            else if(t>='0' && t<='9')d++;
            else s++;
        }
        return(u>0 && l>0 && s>0 && d>0);
        
    }
}