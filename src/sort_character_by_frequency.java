import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class sort_character_by_frequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character i : s.toCharArray()) map.put(i, map.getOrDefault(i, 0) + 1);
        System.out.println(map);
        char element;
        int freq;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            element = entry.getKey();
            freq = entry.getValue();
            pq.add(new pair(element, freq));
        }

        while (!pq.isEmpty()) {
            char current = (char) pq.remove().element;
            for(int i = 0; i < map.get(current); i++){
                sb.append(current);
            }
        }
        return sb.toString();
    }

    public static class pair implements Comparable<pair> {
        int element;
        int freq;

        pair(int element, int freq) {
            this.element = element;
            this.freq = freq;
        }

        @Override
        public int compareTo(pair o) {
            return this.freq - o.freq;
        }
    }
}
