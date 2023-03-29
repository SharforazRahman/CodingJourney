import java.util.HashMap;

public class single_element_in_sorted_array {
    public static void main(String[] args) {
        int[] num = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(num));
    }
    public static int singleNonDuplicate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i : arr) if (map.get(i) == 1) return i;
        return 0;
    }
}
