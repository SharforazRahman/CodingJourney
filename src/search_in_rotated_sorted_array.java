import java.util.Arrays;
import java.util.PriorityQueue;

public class search_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] num = {7,10,4,3,20,23};
        int target = 3;
        System.out.println(search(num, target));
    }

    public static int search(int[] a, int target) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i = 0; i < a.length; i++) {
            if(i < target) pq.add(a[i]);
            else {
                if(a[i] < pq.peek()){
                    pq.remove();
                    pq.add(a[i]);
                }
            }
        }
        while (pq.size() > 0) System.out.println(pq.remove());
        return 0;
    }
}
