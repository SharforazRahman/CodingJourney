import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class product_of_array_expect_self {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] new_Array = new int[nums.length];
        int product = 1;
        int product_for_0_based_case = 1;
        for (int num : nums) { //getting the product of the array;
            product = product * num;
        }
        if (product != 0) {
            Arrays.fill(new_Array, product); //filling new_array with product;
            for (int i = 0; i < new_Array.length; i++) {
                new_Array[i] = product / nums[i];
            }
            System.out.println(Arrays.toString(new_Array));
        }
        else {
            for (int num : nums) {
                list.add(num); //adding list with the values of NUMs array;
            }
            list.remove(Integer.valueOf(0)); // remove value of 0 if there is any;
            for(Integer i: list){
                product_for_0_based_case = product_for_0_based_case * i; //getting the product of list without the value 0;
            }
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0){
                    nums[i] = product_for_0_based_case;
                }
                else {
                    nums[i] = 0;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}