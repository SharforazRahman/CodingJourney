import java.util.Arrays;

public class kth_largest_element_in_array {
    public static void main(String[] args) {
        int[] nums = {2, 1};
        int k = 2;
        Arrays.sort(nums);
        System.out.println(nums[nums.length - k]);
    }
}
