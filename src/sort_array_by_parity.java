import java.util.ArrayList;
import java.util.Arrays;

public class sort_array_by_parity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] new_Array = new int[nums.length];
        int count = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }

        for (int num : nums) {
            if (num % 2 == 0) {
                list.add(num);
            }
        }

        for (int num : nums) {
            if (num % 2 != 0) {
                list.add(num);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            new_Array[i] = list.get(i);
        }
        System.out.println(Arrays.toString(new_Array));

    }
}
