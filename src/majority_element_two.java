import java.util.*;

public class majority_element_two {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        HashMap <Integer,Integer> hm = new HashMap<>();
        ArrayList <Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
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
            if (hm.get(num) > nums.length / 3) {
                list.add(num);
            }
        }
        set.addAll(list);
        List <Integer> result = new ArrayList<>(set);
        System.out.println(result);
    }
}
