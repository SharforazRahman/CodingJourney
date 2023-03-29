import java.util.ArrayList;
import java.util.Arrays;

public class sort_colors {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        ArrayList<Integer>list = new ArrayList<>();
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;

        for (int num : nums) {
            if (num == 0) {
                count_0++;
            } else if (num == 1) {
                count_1++;
            } else {
                count_2++;
            }
        }
        for (int i  = 0; i < count_0; i++){
            list.add(0);
        }
        for (int i  = 0; i < count_1; i++){
            list.add(1);
        }
        for (int i  = 0; i < count_2; i++){
            list.add(2);
        }
        Arrays.fill(nums,0);
        for(int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }
        System.out.println(Arrays.toString(nums));
    }
}
