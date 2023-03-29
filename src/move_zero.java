import java.util.ArrayList;
import java.util.Arrays;

public class move_zero {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int snowBallSize = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                snowBallSize++;
            }
            else if (snowBallSize > 0) {
                int t = nums[i];
                nums[i]=0;
                nums[i-snowBallSize]=t;
            }
        }

//        int[] new_Array = nums.clone();
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        int count = 0;
//
//        for (int num : nums) {
//            list.add(num); //adding list with the values of NUMs array;
//        }
//
//        for (int num : nums) {
//            list.remove(Integer.valueOf(0)); //removing the value of 0s from list;
//        }
//
//        for (int num : nums) {
//            if (num == 0) {
//                count++; //counting 0s in NUMs array;
//            }
//        }
//
//        Integer[] arr = new Integer[list.size()]; //taking integer array of list length;
//        arr = list.toArray(arr); //converting list to array;
//        Arrays.fill(nums, 0); //filling the original array with 0s;
//        for(int i = 0; i < new_Array.length-count; i++){
//            nums[i] = arr[i];
//        }
//        System.out.println(Arrays.toString(nums));
    }
}
