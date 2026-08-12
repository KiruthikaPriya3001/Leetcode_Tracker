// Last updated: 8/12/2026, 12:25:33 PM
class Solution {
    int c = 0;
    public int countArrangement(int n) {
        int num[] = new int[n+1];
        h(num,1,n);
        return c;
    }
    public void h(int num[], int v, int n){
        if(v>n){
            c++;
            return;
        }
        for(int i=1;i<=n;i++){
            if(num[i]==0 && (i%v==0 || v%i==0)){
                num[i]=1;
                h(num,v+1,n);
                num[i]=0;
            }
        }
    }
}