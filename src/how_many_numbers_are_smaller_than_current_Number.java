import java.util.Arrays;
import java.util.ArrayList;

public class how_many_numbers_are_smaller_than_current_Number {
    public static void main(String[] args) {
        int[] nums = {60, 14, 3, 39, 49, 43, 53, 24, 33, 13, 32, 93, 65, 26, 77, 55, 2, 28, 2, 50, 18, 4, 92, 20, 57, 90, 64, 86, 54, 69, 28, 80, 88, 66, 57, 28, 67, 83, 3, 50, 86};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for (int j : nums) {
            for (int num : nums) {
                if (j > num) {
                    count++;
                }
            }
            list.add(count);
            count = 0;
        }
        int[] new_Array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            new_Array[i] = list.get(i);
        }
        System.out.println(Arrays.toString(new_Array));
    }
}
