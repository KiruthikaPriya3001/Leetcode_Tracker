// Last updated: 7/14/2026, 2:10:49 PM
class Solution {
    public boolean isPowerOfThree(int n) {
      if(n==1){
        return true;
      }
      if(n<1||n%3!=0){
        return false;
      }
      return isPowerOfThree(n/3);

    }
}