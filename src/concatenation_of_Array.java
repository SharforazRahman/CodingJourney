import java.util.Arrays;

public class concatenation_of_Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] newArray = new int[nums.length * 2];
        int[] final_array = new int[newArray.length];

        System.arraycopy(nums, 0, newArray, 0, nums.length);
        System.arraycopy(nums, 0, newArray, nums.length, nums.length);

        System.arraycopy(newArray, 0, final_array, 0, final_array.length);
        System.out.println(Arrays.toString(final_array));
    }
}

