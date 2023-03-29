import java.util.HashSet;
import java.util.Set;

public class count_number_of_distinct_integers_after_reverse_operation {
    public static void main(String[] args) {
        int[] nums = {2,2,2};
        Set<Integer>set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        StringBuilder store = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            while (nums[i] != 0){
                int reminder = nums[i] % 10;
                store.append(reminder);
                nums[i] = nums[i]/10;
            }
            set.add(Integer.parseInt(String.valueOf(store)));
            store = new StringBuilder();
        }
        System.out.println(set.size());
    }
}
