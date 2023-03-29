import java.util.HashMap;

public class contain_duplicate_two {
    public static void main(String[] args) {
        int[] num = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(num, k));
    }

    public static boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]) && (i - map.get(arr[i])) <= k) {
                return true;
            } else map.put(arr[i], i);
        }
        return false;
    }
}
