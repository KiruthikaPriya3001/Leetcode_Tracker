// Last updated: 9/21/2026, 2:23:56 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>ans = new ArrayList();
        for(int i=0;i<words.length;i++) if (words[i].contains(Character.toString(x)))ans.add(i);
        return ans;
    }
}