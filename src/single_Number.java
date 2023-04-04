import java.util.ArrayList;
import java.util.Arrays;

public class single_Number {
    public static void main(String[] args) {
        int[] num = {-1, 0};
        System.out.println(NumberAppearedOnceOptimal(num));
    }
    public static int NumberAppearedOnceOptimal(int[] arr) {
        int xor = 0;
        for(int i : arr){
            xor ^= i;
        }
        return xor;
    }
}