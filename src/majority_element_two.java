import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majority_element_two {
    public static void main(String[] args) {
        int[] num = {1, 2};
        System.out.println(majorityElement(num));
    }

    public static List<Integer> majorityElement(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : a) map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i : map.keySet()) {
            if (map.get(i) > a.length / 3) list.add(i);
        }
        return list;
    }
}
