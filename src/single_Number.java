import java.util.ArrayList;
import java.util.Arrays;

public class single_Number {
    public static void main(String[] args) {
        int[] nums = {-1,0};
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        for (int num : nums) {
            list.add(num); // adding array elements in list;
        }
        System.out.println(list);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                list.remove(Integer.valueOf(nums[i]));
                list.remove(Integer.valueOf(nums[i+1]));
            }
        }
        int result = list.get(0);
        System.out.println(result);
    }
}