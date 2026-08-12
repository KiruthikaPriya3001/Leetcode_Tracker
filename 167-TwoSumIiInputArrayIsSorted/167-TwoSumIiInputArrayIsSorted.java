// Last updated: 8/12/2026, 12:27:15 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int l=0,r=numbers.length-1;
       while(numbers[l]+numbers[r]!=target){
        if(numbers[l]+numbers[r]>target)
        r--;
        else
        l++;
       } 
       return new int[]{l+1,r+1};
    }
}