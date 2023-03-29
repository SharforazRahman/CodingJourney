import java.util.Arrays;

public class valid_triangle {
    public static void main(String[] args) {
        int[] nums = {4,2,3,4};
        Arrays.sort(nums);
//        int count = 0;
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i+1;j < nums.length; j++){
//                for(int k = j+1; k < nums.length; k++){
//                    if(nums[i] + nums[j] > nums[k]){
//                        count++;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
        int count = 0;
        int i = 0;
        int j = i + 1;
        int k = j + 1;

        while (i != nums.length) {
            if (nums[i] + nums[j] > k) {
                count++;
                j++;
                k++;
            } else {
                if (nums[i] + nums[j] == k) {
                    j++;
                    k++;
                }
                if (nums[i] + nums[j] < k) {
                    i++;
                }
            }
            if(k == nums.length-1){
                i++;
            }
        }
        System.out.println(count);
    }
}
