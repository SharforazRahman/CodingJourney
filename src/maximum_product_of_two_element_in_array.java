import java.util.Arrays;

public class maximum_product_of_two_element_in_array {
    public static void main(String[] args) {
        int[] nums = {3,7};
        Arrays.sort(nums);
        int result = ((nums[nums.length-1])-1)*((nums[nums.length-2])-1);
        System.out.println(result);
    }
}
