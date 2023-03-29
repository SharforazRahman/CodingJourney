import java.util.Arrays;

public class maximum_product_difference_between_two_pairs {
    public static void main(String[] args) {
        int[] nums = {5, 6, 2, 7, 4};
        Arrays.sort(nums);
        int max = nums[nums.length - 1] * nums[nums.length - 2];
        int min = nums[0] * nums[1];
        int res = max - min;
        System.out.println(res);
    }
}
