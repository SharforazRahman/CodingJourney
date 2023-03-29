import java.util.ArrayList;
import java.util.HashMap;

public class kth_distinct_integer_in_array {
    public static void main(String[] args) {
        String[] arr = {"a","b","a"};
        int k = 3;
        kthDistinct(arr, k);
    }

    public static void kthDistinct(String[] arr, int k) {
        String result = "";
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (String i : arr) map.put(i, map.getOrDefault(i, 0) + 1);
        for (String i : arr) if (map.get(i) == 1) list.add(i);
        if (list.size() < k) result = "";
        else result = list.get(k - 1);
        System.out.println(result);
    }
}
