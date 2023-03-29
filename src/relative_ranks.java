import java.util.Arrays;
import java.util.HashMap;

public class relative_ranks {
    public static void main(String[] args) {
        int[] score = {1};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }

    public static String[] findRelativeRanks(int[] arr) {
        HashMap<Integer, String> map = new HashMap<>();
        int rank = 4;
        int[] a = Arrays.copyOf(arr, arr.length);
        String[] array = new String[a.length];
        Arrays.sort(a);

        if(a.length == 1) {
            array[0] = "Golden Medal";
            return array;
        }
        if(a.length == 2){
            array[1] = "Golden Medal";
            array[0] = "Silver Medal";
            return array;
        }

        map.put(a[a.length - 1], "Gold Medal");
        map.put(a[a.length - 2], "Silver Medal");
        map.put(a[a.length - 3], "Bronze Medal");

        for (int i = a.length - 4; i >= 0; i--) {
            if (!map.containsKey(i)) map.put(a[i], String.valueOf(rank++));
        }


        for (int i = 0; i < arr.length; i++) {
            array[i] = map.get(arr[i]);
        }
        return array;
    }
}
