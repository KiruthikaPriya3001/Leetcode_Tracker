// Last updated: 9/21/2026, 2:24:10 PM
class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        return set.size();
    }
}