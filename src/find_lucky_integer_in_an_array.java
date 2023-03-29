import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class find_lucky_integer_in_an_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};
        System.out.println(findLucky(arr));
    }

    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);
        System.out.println(map);
        for (int j = arr.length - 1; j >= 0; j--) {
            if (map.containsKey(arr[j]) && map.get(arr[j]) == arr[j]) return arr[j];
        }
        return -1;
    }
}

