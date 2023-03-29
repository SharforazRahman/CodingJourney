import java.util.Arrays;

public class contain_duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                result = 1;
                break;
            }
        }
        if(result == 1){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
