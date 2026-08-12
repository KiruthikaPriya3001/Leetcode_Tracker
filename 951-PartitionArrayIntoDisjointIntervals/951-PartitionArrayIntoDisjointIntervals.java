// Last updated: 8/12/2026, 12:23:58 PM
class Solution {
    public int partitionDisjoint(int[] arr) {
        int leftMax = arr[0], max = arr[0], ans = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] < leftMax){
                ans = i+1;
                leftMax = max;
            }
            else max = Math.max(arr[i], max);
        }
        return ans;
    }
}