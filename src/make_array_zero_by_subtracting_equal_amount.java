import java.util.HashSet;
import java.util.Set;

public class make_array_zero_by_subtracting_equal_amount {
    public static void main(String[] args) {
        int[] nums = {1,5,0,3,5};
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            s.add(num);
        }
        for (int num : nums) {
            s.remove(0);
        }
        int result = s.size();
        System.out.println(result);
    }
}
