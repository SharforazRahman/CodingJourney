import java.util.*;

public class top_k_frequent_element {
    public static void main(String[] args) {
        int[] num = {1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(num, k)));
    }

    public static int[] topKFrequent(int[] num, int k) {
        int[] result = new int[k];
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Integer> map = new HashMap<>();

        //counting the frequency of the elements;
        for (int i : num) map.put(i, map.getOrDefault(i, 0) + 1);
        int key, value, index = 0;
        //Traversing the Map;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            pq.add(new pair(key, value)); // adding pair into priority queue
        }
        for (int i = 0; i < k; i++) {
            result[index++] = pq.remove().element;
        }
        return result;
    }

    static class pair implements Comparable<pair> {
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
