import java.util.ArrayList;
import java.util.Arrays;

public class separate_the_digit_in_an_array {
    public static void main(String[] args) {
        int[] num = {13, 25, 83, 77};
        System.out.println(Arrays.toString(separateDigits(num)));
    }

    public static int[] separateDigits(int[] a) {
        StringBuilder sb = new StringBuilder();
        for(int i : a) sb.append(i);

        int[] res = new int[sb.toString().length()];
        int index = 0;
        for(int i : sb.toString().toCharArray()) res[index++] = Integer.parseInt(String.valueOf((char)i));
        return res;
    }
}
