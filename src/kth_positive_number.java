import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class kth_positive_number {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i : arr) set.add(i);
        for (int i = 1; i <= 1000; i++) {
            if (set.contains(i)) continue;
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            if (i == k) System.out.println(list.get(i));
        }
    }
}
