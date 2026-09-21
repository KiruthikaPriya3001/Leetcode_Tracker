// Last updated: 9/21/2026, 2:30:34 PM
import java.util.*;

class LRUCache {
    LinkedHashMap<Integer,Integer> map;
    int cap;

    LRUCache(int capacity) {
        cap = capacity;
        map = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
        if (map.size() > cap)
            map.remove(map.keySet().iterator().next());
    }
}