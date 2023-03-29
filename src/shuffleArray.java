import java.util.ArrayList;
import java.util.Arrays;

public class shuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] newArray = new int[nums.length];
        ArrayList <Integer> list = new ArrayList<Integer>();
        ArrayList <Integer> list_two = new ArrayList<Integer>();
        for (int i = 0; i < nums.length/2; i++) {
            list.add(nums[i]);
        }
        for (int i = n; i < nums.length; i++) {
            list_two.add(nums[i]);
        }
        for (int i = 0,j = 0; i < newArray.length; i+=2,j++) {
            newArray[i] = list.get(j);
            newArray[i+1] = list_two.get(j);
        }
        System.out.println(Arrays.toString(newArray));
    }
}
