import java.util.Arrays;

public class make_two_array_equal_by_reversing_sub_arrays {
    public static void main(String[] args) {
        int[] target = {1, 2, 3, 4};
        int[] arr = {2, 4, 1, 3};

        Arrays.sort(target);
        Arrays.sort(arr);

        System.out.println(Arrays.equals(target,arr));

    }
}
