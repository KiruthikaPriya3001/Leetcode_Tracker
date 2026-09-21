// Last updated: 9/21/2026, 2:23:20 PM
class Solution {
    public boolean checkDivisibility(int n) {
        int o = n;
        int s = 0;
        int p = 1;
        while(n>0){
            int d = n%10;
            s+=d;
            p*=d;
            n/=10;
        }
        int di = s+p;
        return o%di==0;
    }
};