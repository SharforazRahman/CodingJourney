import java.util.ArrayList;
import java.util.Arrays;

public class remove_element {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num != val) {
                list.add(num);
            }
        }
        Arrays.fill(nums,0);
        for(int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }
        System.out.println(Arrays.toString(nums));
    }
}
