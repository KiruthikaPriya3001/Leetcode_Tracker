// Last updated: 7/27/2026, 11:16:05 AM
class Solution {
    public int maxDistance(List<List<Integer>> arrays) {

        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);

        int ans = 0;

        for (int i = 1; i < arrays.size(); i++) {

            List<Integer> current = arrays.get(i);

            int first = current.get(0);
            int last = current.get(current.size() - 1);

            ans = Math.max(ans, Math.max(last - min, max - first));

            min = Math.min(min, first);
            max = Math.max(max, last);
        }

        return ans;
    }
}
