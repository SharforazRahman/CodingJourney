import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class third_maximum_number {
    public static void main(String[] args) {
        int[] num = {1, 2, 2, 5, 6, 3};
        System.out.println(thirdMax(num));
    }

    public static int thirdMax(int[] array) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        Set<Integer> s = new HashSet<>();

        for (int i : array) {
            if (s.add(i)) {
                pq.add(i);
            }
        }
        System.out.println(pq);
        if (pq.size() < 3) return pq.peek();
        pq.remove();
        pq.remove();
        return (pq.remove());
    }
}
