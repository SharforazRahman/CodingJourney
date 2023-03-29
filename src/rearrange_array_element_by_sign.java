import java.util.ArrayList;
import java.util.Arrays;

public class rearrange_array_element_by_sign {
    public static void main(String[] args) {
        int[] nums = {-1,1};
        ArrayList<Integer>positive_list = new ArrayList<>();
        ArrayList<Integer>negative_list = new ArrayList<>();

        for (int num : nums) {
            if (num < 0) {
                negative_list.add(num);
            } else {
                positive_list.add(num);
            }
        }
        Arrays.fill(nums,0);
        for(int i = 0,j = 0; i < nums.length; i+=2,j++){
            nums[i] = positive_list.get(j);
            nums[i+1] = negative_list.get(j);
        }
        System.out.println(Arrays.toString(nums));
    }
}
