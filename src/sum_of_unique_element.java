import java.util.HashMap;
import java.util.Map;

public class sum_of_unique_element {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        for (int num : nums) {
            if (hm.containsKey(num)) {
                int old_frequency = hm.get(num);
                int new_frequency = old_frequency + 1;
                hm.put(num, new_frequency);
            } else {
                hm.put(num, 1);
            }
        }
        for (Map.Entry entry : hm.entrySet()) {
            int store = (int) entry.getValue();
            if (store == 1) {
                int key = (int) entry.getKey();
                sum = sum + key;
            }
        }
        System.out.println(sum);
    }
}
