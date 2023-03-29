import java.util.Arrays;

public class running_sum_of_1D_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] sum = new int[arr.length];
        int previous_Number = 0;

        for(int i = 0; i < arr.length; i++){
            previous_Number = arr[i]+previous_Number;
            sum[i] = previous_Number;
        }
        System.out.println(Arrays.toString(sum));
    }
}
