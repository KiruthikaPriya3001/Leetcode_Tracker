// Last updated: 7/14/2026, 2:08:48 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c = 0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target)c++;
        }
        return c;
    }
}