import java.util.*;

public class top_k_frequent_word {
    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        System.out.println(topKFrequent(words, k));
    }

    public static List<String> topKFrequent(String[] words, int k) {
        ArrayList<String> list = new ArrayList<>();
        PriorityQueue<pair> pq = new PriorityQueue<pair>(Collections.reverseOrder());
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : words) map.put(i, map.getOrDefault(i, 0) + 1);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.add(new pair(entry.getKey(), entry.getValue()));
        }
        int index = 0;
        while (index != k) {
            list.add(pq.remove().element);
            index++;
        }
        return list;
    }

    public static class pair implements Comparable<pair> {
        String element;
        int freq;

        pair(String element, int freq) {
            this.element = element;
            this.freq = freq;
        }

        @Override
        public int compareTo(pair o) {
            int diff = this.freq - o.freq;
            return (diff != 0) ? diff : o.element.compareTo(this.element);
        }
    }
}
