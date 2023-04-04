import java.util.ArrayList;
import java.util.Arrays;

public class sort_colors {
    public static void main(String[] args) {
        int[] arr = {2,0,1};
        int zero = 0, one = 0, two = 0;

        for (int i : arr) {
            if (i == 0) zero++;
            else if (i == 1) one++;
            else two++;
        }
        for (int i = 0; i < zero; i++) arr[i] = 0;
        for (int i = zero; i < zero + one; i++) arr[i] = 1;
        for (int i = zero + one; i < arr.length; i++) arr[i] = 2;

        System.out.println(Arrays.toString(arr));
    }
}
