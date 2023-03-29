import java.util.Arrays;
import java.util.Scanner;

public class build_array_from_Permutation {
    public static void main(String[] args) {
        int[] num = {0, 2, 1, 5, 3, 4};
        int[] res_array = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            res_array[i] = num[num[i]];
        }
        System.out.println(Arrays.toString(res_array));
    }
}