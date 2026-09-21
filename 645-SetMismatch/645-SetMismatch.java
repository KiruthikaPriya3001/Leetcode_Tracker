// Last updated: 9/21/2026, 2:28:31 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int d = 0;
        int m = 0;
        for(int i=1;i<=nums.length;i++){
            int count = 0;
            for(int x : nums){
                if(x==i)
                count++;
            }
            if(count == 2)
            d = i;
            if(count == 0)
            m = i;
        }
        return new int[]{d,m};
    }
}