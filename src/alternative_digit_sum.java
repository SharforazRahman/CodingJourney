import java.util.Arrays;

public class alternative_digit_sum {
    public static void main(String[] args) {
        int n = 886996;
        String temp = Integer.toString(n);
        int[] a = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++) {
            a[i] =  Character.getNumericValue(temp.charAt(i));
        }
        int result_positive = 0;
        for(int i = 0; i < a.length; i+=2){
            result_positive += a[i];
        }
        int result_negative = 0;
        for(int i = 1; i < a.length; i+=2){
            result_negative += a[i];
        }
        System.out.println(result_positive+result_negative);
    }
}
