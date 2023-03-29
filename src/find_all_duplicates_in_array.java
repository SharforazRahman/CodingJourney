import java.util.ArrayList;
import java.util.HashMap;

public class find_all_duplicates_in_array {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);

        for (int num : map.keySet()) {
            if (map.get(num) > 1) list.add(num);
        }
        System.out.println(list);
    }
}
