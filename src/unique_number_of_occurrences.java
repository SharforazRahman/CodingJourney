import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class unique_number_of_occurrences {
    public static void main(String[] args) {
        int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);
        Set<Integer> set = new HashSet<>(map.values());
        return set.size() == map.values().size();
    }
}
