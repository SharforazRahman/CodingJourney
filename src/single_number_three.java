import java.util.ArrayList;
import java.util.Arrays;

public class single_number_three {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        for (int num : nums) {
            list.add(num); // adding array elements in list;
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                list.remove(Integer.valueOf(nums[i]));
                list.remove(Integer.valueOf(nums[i+1]));
            }
        }
        int[] result_array = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result_array[i] = list.get(i);
        }
        System.out.println(Arrays.toString(result_array));
    }
}
