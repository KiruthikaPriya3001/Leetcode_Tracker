// Last updated: 9/21/2026, 2:26:15 PM
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num>0){
            if(num%2==0){
                num = num/2;
            }else{
                num-=1;}
                count++;
        }
        return count;
    }
}