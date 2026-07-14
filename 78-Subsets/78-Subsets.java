// Last updated: 7/14/2026, 2:12:15 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> subsets = new ArrayList<>(); 
        subsets.add(new ArrayList<>()); 
       
        for (int num : nums) {
           
            int currentSize = subsets.size(); 
            for (int i = 0; i < currentSize; i++) {
                List<Integer> newSubset = new ArrayList<>(subsets.get(i));  
                newSubset.add(num); 
                subsets.add(newSubset);
            }
        }
        return subsets;
    }
}