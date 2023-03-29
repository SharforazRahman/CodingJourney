import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class find_the_duplicate_number {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            if (hm.containsKey(num)) {
                int old_frequency = hm.get(num);
                int new_frequency = old_frequency + 1;
                hm.put(num, new_frequency);
            } else {
                hm.put(num, 1);
            }
        }
        for (int num : nums) {
            if (hm.get(num) > 1) {
                System.out.println(num);
                break;
            }
        }
    }
}