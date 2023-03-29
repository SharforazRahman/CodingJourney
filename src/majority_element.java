import java.util.HashMap;
import java.util.Map;

public class majority_element {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,3,3,3,2,3,3,3};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int num : nums) {
            if (hm.containsKey(num)) {
                int old_frequency = hm.get(num);
                int new_frequency = old_frequency + 1;
                hm.put(num, new_frequency);
            } else {
                hm.put(num, 1);
            }
        }
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            if(hm.get(nums[i]) > nums.length/2){
                result = nums[i];
                break;
            }
        }
        System.out.println(result);
    }
}
