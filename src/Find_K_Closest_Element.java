import java.util.*;

public class Find_K_Closest_Element {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4, x = 3;
        System.out.println(findClosestElements(arr, k, x));
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<pair> pq = new PriorityQueue<>(new pairComparator());
        for (int i : arr) {
            pq.add(new pair(Math.abs(i - x), i));
            if (pq.size() > k) pq.poll();
        }
        while (pq.size() > 0) list.add(pq.poll().data);
        Collections.sort(list);
        return list;
    }

    static class pair {
        int data;
        int key;

        pair(int key, int data) {
            this.key = key;
            this.data = data;

        }
    }

    static class pairComparator implements Comparator<pair> {
        @Override
        public int compare(pair p1, pair p2) {
            if (p1.key == p2.key) {
                return p2.data - p1.data;
            }
            return p2.key - p1.key;
        }
    }
}
