// Last updated: 7/14/2026, 2:09:43 PM
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