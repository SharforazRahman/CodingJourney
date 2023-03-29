import java.util.*;

public class find_lucky_integer_in_an_array {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,3};
        HashMap <Integer, Integer> hm = new HashMap<>();
        for (int num : arr) {
            if (hm.containsKey(num)) {
                int old_frequency = hm.get(num);
                int new_frequency = old_frequency + 1;
                hm.put(num, new_frequency);
            } else {
                hm.put(num, 1);
            }
        }
        Object result = 0;
        Set<Map.Entry<Integer, Integer>> s = hm.entrySet();
        for (Map.Entry<Integer, Integer> entry : s) {
            if (Objects.equals(entry.getKey(), entry.getValue())) {
                result = (entry.getKey());
            }
        }
        int final_result = Integer.parseInt(result.toString());
        if(final_result < 1){
            System.out.println(-1);
        }
        else {
            System.out.println(final_result);
        }
    }
}
