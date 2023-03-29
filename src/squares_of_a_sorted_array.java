import java.util.ArrayList;
import java.util.Collections;

public class squares_of_a_sorted_array {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        ArrayList<Integer>list = new ArrayList<>();
        for (int num : nums) {
            list.add(Math.abs(num * num));
        }
        Collections.sort(list);
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        System.out.println(list);
    }
}
