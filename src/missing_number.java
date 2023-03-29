import java.util.Arrays;

public class missing_number {
    public static void main(String[] args) {
        int[] nums = {0,2,3};
        Arrays.sort(nums);
        int store = 0;
        if (nums[0] != 0) {
            System.out.println(0);
        }
        else if(nums.length == 1){
            System.out.println(nums[0]+1);
        }
        else {
            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i] + 1 != nums[i + 1]) {
                    store = nums[i] + 1;
                    break;
                } else {
                    store = nums.length;
                }
            }
            System.out.println(store);
        }
    }
}