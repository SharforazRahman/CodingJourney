import java.util.Arrays;

public class remove_duplicate_from_sorted_array_twp {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1, 1, 2, 2, 3};
        if (nums.length == 0) {
            System.out.println(0);
        }
        int count = 0;
        int i = 0;
        int j = i + 1;
        int k = i + 1;
        int index = 0;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
                k++;
            } else if (k % 2 == 0) {
                index = k;
                k = 0;
                j++;
                break;
            }
            else if (nums[i] != nums[j]) {
                index = i;
                nums[i] =nums[j];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
