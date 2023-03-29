import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sort_even_and_odd_indices_independently {
    public static void main(String[] args) {
        int[] num = {5, 39, 33, 5, 12, 27, 20, 45, 14, 25, 32, 33, 30, 30, 9, 14, 44, 15, 21};
        System.out.println(Arrays.toString(sortEvenOdd(num)));
    }

    public static int[] sortEvenOdd(int[] a) {
        ArrayList<Integer> even_list = new ArrayList<>();
        ArrayList<Integer> odd_list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) even_list.add(a[i]);
            else odd_list.add(a[i]);
        }

        Collections.sort(even_list);
        odd_list.sort(Collections.reverseOrder());

        for (int i = 0, j = 0, k = 0; i < even_list.size() + odd_list.size() - 1; i += 2) {
            result.add(even_list.get(j++));
            result.add(odd_list.get(k++));
        }
        if(a.length % 2 != 0) result.add(even_list.get(even_list.size()-1));
        return result.stream().mapToInt(i -> i).toArray();
    }
}