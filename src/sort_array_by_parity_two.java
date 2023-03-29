import java.util.Arrays;

public class sort_array_by_parity_two {
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        int[] ans = new int[nums.length];
        for(int i = 0,j = 0; i < nums.length; i++){
            if(nums[i] %2 == 0){
                ans[j] = nums[i];
                j+=2;
            }
        }
        for(int i = 0,j = 1; i < nums.length; i++){
            if(nums[i] %2 != 0){
                ans[j] = nums[i];
                j+=2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
