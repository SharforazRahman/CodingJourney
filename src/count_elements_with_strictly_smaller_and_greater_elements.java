import java.util.Arrays;

public class count_elements_with_strictly_smaller_and_greater_elements {
    public static void main(String[] args) {
        int[] nums = {11,7,2,15};
        Arrays.sort(nums);
        int count = 0;
        int count_result  = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            for (int num : nums) {
                if (nums[i] > num) {
                    count++;
                    break;
                }
            }
            for (int num : nums) {
                if (nums[i] < num) {
                    count++;
                    break;
                }
            }
            if(count == 2){
                count_result++;
            }
            count = 0;
        }
        System.out.println(count_result);
    }
}
