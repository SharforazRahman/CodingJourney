import java.util.Arrays;
import java.util.HashMap;

public class rank_transform_of_an_array {
    public static void main(String[] args) {
        int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }

    public static int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        int[] a = Arrays.copyOf(arr, arr.length);
        Arrays.sort(a);

        for (int j : a) {
            if (!map.containsKey(j)) map.put(j, rank++);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
