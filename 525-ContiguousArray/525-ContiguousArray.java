// Last updated: 8/12/2026, 12:25:35 PM
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer>map = new HashMap<>();
        map.put(0,-1);
        int s = 0;
        int m = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                s -= 1;
            }else{
                s += 1;
            }
            if(map.containsKey(s)){
                m = Math.max(m, i-map.get(s));
            }else{
                map.put(s, i);
            }
        }
        return m;
    }
}