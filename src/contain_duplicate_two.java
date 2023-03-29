import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class contain_duplicate_two {
    public static void main(String[] args) {
        int[] num = {0,1,2,3,4,5,0};
        int k = 5;
        System.out.println(containsNearbyDuplicate(num, k));
    }

    public static boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);

        for (int i : map.keySet()) {
            if (map.get(i) > 1) list.add(i);
        }
        if(list.isEmpty()) return false;

        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) arr[i] = Integer.MAX_VALUE;
        }
        int first_index = 0;
        int second_index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != Integer.MAX_VALUE && arr[j] != Integer.MAX_VALUE) {
                    if (arr[i] == arr[j]) {
                        first_index = i;
                        second_index = j;
                        if (Math.abs(first_index - second_index) <= k) return true;
                    } else break;
                }
            }
        }
        return false;
    }
}
