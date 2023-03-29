import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class relative_sort_array {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listForSecondHalf = new ArrayList<>();
        int[] res = new int[arr1.length];

        for (int i : arr1) map.put(i, map.getOrDefault(i, 0) + 1);
        for (int k : arr2) {
            int occurrence = map.get(k);
            if (map.containsKey(k)) {
                for (int j = 0; j < occurrence; j++) {
                    list.add(k);
                }
            }
        }
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        for(int k : map.keySet()){
            if(!list.contains(k)) listForSecondHalf.add(k);
        }
        Collections.sort(listForSecondHalf);
        for(int i = list.size(), j = 0; i < res.length; i++, j++){
            res[i] = listForSecondHalf.get(j);
        }
        return res;
    }
}
