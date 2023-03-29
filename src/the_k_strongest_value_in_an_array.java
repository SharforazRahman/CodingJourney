import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class the_k_strongest_value_in_an_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        System.out.println(Arrays.toString(getStrongest(arr, k)));
    }
    public static int[] getStrongest(int[] arr, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new MyComparator());
        int[] result = new int[k];

        Arrays.sort(arr);
        int median = arr[(arr.length - 1) / 2];
        for (int i : arr) pq.offer(new Pair(Math.abs(i - median), i));
        for (int i = 0; i < k;  i++)
            result[i] = pq.remove().key;

        return result;
    }
    static class Pair {
        int diff;
        int key;
        public Pair(int d, int e) {
            this.diff = d;
            this.key = e;
        }
    }
    static class MyComparator implements Comparator<Pair> {
        public int compare (Pair p, Pair q) {
            if (p.diff == q.diff)
                return q.key - p.key;
            return q.diff - p.diff;
        }
    }
}
