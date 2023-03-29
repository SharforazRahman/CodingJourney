import java.util.HashMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class find_center_of_star_graph {
    public static void main(String[] args) {
        int[][] edges = {{1, 2}, {2, 3}, {4, 2}};
        System.out.println(findCenter(edges));
    }

    public static int findCenter(int[][] array) {
        int[] a = Stream.of(array).flatMapToInt(IntStream::of).toArray();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a) map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i : map.keySet()) if (map.get(i) > 1) return i;
        return 0;
    }
}
