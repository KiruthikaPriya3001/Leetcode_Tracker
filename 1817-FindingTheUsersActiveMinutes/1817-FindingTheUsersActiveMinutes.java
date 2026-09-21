// Last updated: 9/21/2026, 2:25:21 PM
import java.util.*;
class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int[] log : logs) {
            int user = log[0];
            int minute = log[1];
            map.putIfAbsent(user, new HashSet<>());
            map.get(user).add(minute);
        }
        int[] answer = new int[k];
        for (HashSet<Integer> minutes : map.values()) {
            int count = minutes.size();
            answer[count - 1]++;
        }
        return answer;
    }
}