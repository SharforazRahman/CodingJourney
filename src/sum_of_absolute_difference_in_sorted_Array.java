import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class sum_of_absolute_difference_in_sorted_Array {
    public static void main(String[] args) {
        int[] num = {2,3,5};
        System.out.println(Arrays.toString(getSumAbsoluteDifferences(num)));
    }
    public static int[] getSumAbsoluteDifferences(int[] a) {
        ArrayList<Integer>list = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                sum = sum + Math.abs(sum - a[j]);
            }
            System.out.println(sum);
            sum = 0;
        }
        return a;
    }
}
