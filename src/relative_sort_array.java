import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class relative_sort_array {
    public static void main(String[] args) {
        int[] arr1 = {28, 6, 22, 8, 44, 17};
        int[] arr2 = {22, 28, 8, 6};

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list_second_half = new ArrayList<>();

        for (int j : arr2) {
            for (int k : arr1) {
                if (j == k) {
                    list.add(k);
                }
            }
        }
        for (int i : arr1) {
            if (!list.contains(i)) {
                list_second_half.add(i);
            }
        }
        Collections.sort(list_second_half);
        list.addAll(list_second_half);
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
