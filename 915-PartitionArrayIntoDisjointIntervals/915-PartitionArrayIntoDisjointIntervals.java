// Last updated: 9/21/2026, 2:27:25 PM
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