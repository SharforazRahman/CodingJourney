import java.util.ArrayList;
import java.util.Arrays;

public class find_target_indices_after_sorting_array {
    public static void main(String[] args) {
        int[] nums = {
                75,99,19,93,87,68,12,18,48,83,24,50,16,53,36,16,80,68,46,13,53,100,50,49,77,
                52,34,42,38,98,73,11,13,61,72,8,11,67,98,24,23,71,47,6,5,7,97,86,25,82,11,15,
                26,97,69,6,30,77,98,44,32,39,71,47,64,78,6,61,72,75
        };
        int target = 98;
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    list.add(i);
                }
            }
        System.out.println(list);
    }
}
