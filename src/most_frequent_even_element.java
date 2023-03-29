import java.util.*;

public class most_frequent_even_element {
    public static void main(String[] args) {
        int[] nums = {4,4,4,9,2,4};
        int count_even = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                count_even++;
                if (hm.containsKey(num)) {
                    int old_frequency = hm.get(num);
                    int new_frequency = old_frequency + 1;
                    hm.put(num, new_frequency);
                } else {
                    hm.put(num, 1);
                }
            }
        }
        if(count_even > 0) {
            int mx = -1;
            int ans = -1;
            for (Integer i : hm.keySet()) {
                if (hm.get(i) > mx) {
                    mx = hm.get(i);
                    ans = i; // here i means keys;
                }
                else if (hm.get(i) == mx && ans > i) {
                    ans = i;
                }
            }
            System.out.println(ans);
        }
        else {
            System.out.println(-1);
        }
    }
}
