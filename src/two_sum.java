import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class two_sum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 9-3;
        String str = "";
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    str = i+" "+j;
                }
            }
        }
        String[] splitArray = str.split(" ");
        int[] array = new int[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            array[i] = Integer.parseInt(splitArray[i]);
        }
        System.out.println(Arrays.toString(array));
    }
}
