import java.util.Arrays;


public class minimize_maximum_pair_sum_in_array {
    public static void main(String[] args) {
        int[] nums = {4, 1, 5, 1, 2, 5, 1, 5, 5, 4};
        Arrays.sort(nums);
        int res = 0, n = nums.length;
        for (int i = 0; i < n / 2; ++i) {
            res = Math.max(res, nums[i] + nums[n - i - 1]);
        }
        System.out.println(res);
    }
}