import java.lang.reflect.Array;
import java.util.Arrays;

public class check_if_N_and_its_Double_exist {
    public static void main(String[] args) {
        int[] arr = {0,0}; //-2,0,10,-19,4,6,-8
        Arrays.sort(arr);
        boolean b = false;
        for (int j : arr) {
            for (int k : arr) {
                if (k != 0) {
                    if ((j * 2) == (k)) {
                        b = true;
                        break;
                    }
                }
            }
        }
        int count = 0;
        for (int i : arr) {
            if (i == 0) {
                count++;
            }
        }
        if (count > 1 || b) {
            System.out.println("true");
        } else {
            System.out.println(b);
        }
    }
}