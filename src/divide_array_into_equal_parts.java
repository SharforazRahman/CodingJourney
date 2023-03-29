import java.util.HashMap;

public class divide_array_into_equal_parts {
    public static void main(String[] args) {
        int[] num = {3,2,3,2,2,2};
        System.out.println(divideArray(num));
    }

    public static boolean divideArray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);

        for (int i : map.keySet()) {
            if (map.get(i) % 2 != 0) return false;
        }
        return true;
    }
}
