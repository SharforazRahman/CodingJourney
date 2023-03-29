import java.util.*;

public class sort_array_by_increasing_frequency {
    public static void main(String[] args) {
        int[] num = {1,1,2,2,2,3};
        System.out.println(Arrays.toString(frequencySort(num)));
    }
    public static int[] frequencySort(int[] array) {
        int[] result = new int[array.length];
        PriorityQueue<pair> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : array) map.put(i, map.getOrDefault(i, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new pair(entry.getKey(), entry.getValue()));
        }

        int index = 0;
        while (!pq.isEmpty()) {
            int current = pq.remove().element;
            for(int i = 0; i < map.get(current); i++){
                result[index++] = current;
            }
        }
        return result;
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

