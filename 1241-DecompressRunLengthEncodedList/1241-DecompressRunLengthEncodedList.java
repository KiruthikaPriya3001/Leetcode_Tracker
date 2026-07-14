// Last updated: 7/14/2026, 2:09:53 PM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer>result=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int f = nums[i];
            int v = nums[i+1];
            for(int j=0;j<f;j++){
                result.add(v);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}