import java.util.Arrays;

public class max_consecutive_ones {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        int count = 0;
        int[] count_ones = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            }
            count_ones[i] = count;
            if(nums[i] == 0) {
                count = 0;
            }
        }
        Arrays.sort(count_ones);
        System.out.println(count_ones[count_ones.length-1]);
    }
}
