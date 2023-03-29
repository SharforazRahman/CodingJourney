import java.util.*;

public class remove_duplicate_from_sorted_array {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        Arrays.fill(nums,0);
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
