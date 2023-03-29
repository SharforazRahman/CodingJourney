import java.util.Arrays;

public class keep_multiplying_found_by_two_values {
    public static void main(String[] args) {
        int[] nums = {5,3,6,1,12};
        int original = 3;
        Arrays.sort(nums);
        int index = 0;
        int value_found = 0;
        for (int i = 0; i < nums.length; i++) {
            if (original == nums[i]) {
                index = i;
                value_found++;
            }
        }
        if (value_found > 0) {
            for (int i = index; i < nums.length; i++) {
                if (original * 2 == nums[i]) {
                    original = nums[i];
                }
            }
            System.out.println(original * 2);
        } else {
            System.out.println(original);
        }
    }
}
