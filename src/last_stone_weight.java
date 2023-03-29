import java.util.Collections;
import java.util.PriorityQueue;

public class last_stone_weight {
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones));
    }
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int i : stones) pq.add(i);
        while(pq.size() > 1) {
            int first = pq.remove();
            int second = pq.remove();
            pq.add(Math.abs(first - second));
        }
        return pq.remove();
    }
}
