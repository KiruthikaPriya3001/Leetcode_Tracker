// Last updated: 9/21/2026, 2:24:18 PM
class Solution {
  public int passThePillow(int n, int time) {
    time %=(n- 1) * 2;
    if (time < n)
      return 1 + time;
    return n - (time - (n - 1));
  }
}