import java.util.Arrays;

public class remove_duplicate_from_sorted_array_two {
    public static void main(String[] args) {
        //2,147,483,647
        int[] nums = {1, 1, 1, 2, 2, 3};
        int count = 0;

        int i = 0;
        int j = i + 1;
        int index = 0;

        while (j != nums.length) {
            if (nums[i] == nums[j]) {
                count++;
                j++;
                index = j;
            }
            if(count > 2){
                nums[j] = 2147483647;
            }
            if(nums[i] != nums[j]){
                count = 0;
                i = j;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
