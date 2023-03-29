import java.util.*;

public class two_out_of_three {
    public static void main(String[] args) {
        int[] nums1 = {3,1};
        int[] nums2 = {2,3};
        int[] nums3 = {1,2};

        Set<Integer>set_one = new HashSet<>();
        Set<Integer>set_two = new HashSet<>();
        Set<Integer>set_three = new HashSet<>();

        for (int j : nums1) {
            set_one.add(j);
        }
        for (int j : nums2) {
            set_two.add(j);
        }
        for (int j : nums3) {
            set_three.add(j);
        }

        ArrayList<Integer> list_one = new ArrayList<>(set_one);
        ArrayList<Integer> list_two = new ArrayList<>(set_two);
        ArrayList<Integer> list_three = new ArrayList<>(set_three);

        list_one.addAll(list_two);
        list_one.addAll(list_three);

        int[] new_array = new int[list_one.size()];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < list_one.size(); i++){
            new_array[i] = list_one.get(i);
        }

        for (int num : new_array) {
            if (hm.containsKey(num)) {
                int old_frequency = hm.get(num);
                int new_frequency = old_frequency + 1;
                hm.put(num, new_frequency);
            } else {
                hm.put(num, 1);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(Map.Entry entry : hm.entrySet()){
            int total = (int) entry.getValue();
            if(total >= 2){
                result.add((Integer) entry.getKey());
            }
        }
        System.out.println(result);
    }
}
