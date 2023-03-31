import java.util.Arrays;
import java.util.HashMap;

public class rank_transform_of_an_array {
    public static void main(String[] args) {
        int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }

    public static int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = arr.clone();
        int rank = 1;
        Arrays.sort(res);

        for(int i : res) map.put(i, rank++);
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])) res[i] = map.get(arr[i]);
        }
        return res;
    }
}
