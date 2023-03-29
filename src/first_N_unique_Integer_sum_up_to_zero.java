import java.util.Arrays;
import java.util.Scanner;

public class first_N_unique_Integer_sum_up_to_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] new_array = new int[n];

        int length_for_even = n / 2;
        int length_for_odd = n / 2;
        if (n % 2 != 0) {

            for (int i = 1, j = 0; i <= length_for_odd; i++, j++) {
                new_array[j] = i * (-1);
            }
            for (int i = 1, j = length_for_odd + 1; i <= length_for_even; i++, j++) {
                new_array[j] = i;
            }
        } else {

            for (int i = 1, j = 0; i <= length_for_odd; i++, j++) {
                new_array[j] = i * (-1);
            }
            for (int i = 1, j = length_for_odd; i <= length_for_even; i++, j++) {
                new_array[j] = i;
            }
        }
        System.out.println(Arrays.toString(new_array));
    }
}
