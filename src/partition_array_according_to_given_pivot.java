import java.util.ArrayList;
import java.util.Arrays;

public class partition_array_according_to_given_pivot {
    public static void main(String[] args) {
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        ArrayList<Integer> greater_list = new ArrayList<>();
        ArrayList<Integer> lesser_list = new ArrayList<>();
        int count_pivot = 0;
        int count_lessThanPivot = 0;
        int count_greaterThanPivot = 0;

        for (int num : nums) {
            if (num < pivot) {
                lesser_list.add(num);
                count_lessThanPivot++;
            }
            if (num > pivot) {
                greater_list.add(num);
                count_greaterThanPivot++;
            }
            if (num == pivot) {
                count_pivot++;
            }
        }
        Arrays.fill(nums, pivot);
        for (int i = 0; i < count_lessThanPivot; i++) {
            nums[i] = lesser_list.get(i);
        }
        int len = count_lessThanPivot+count_pivot;
        for (int i = len,j = 0; i < nums.length; i++,j++) {
            nums[i] = greater_list.get(j);
        }
        System.out.println(Arrays.toString(nums));
    }
}
