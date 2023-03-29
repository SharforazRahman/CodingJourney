import java.util.Arrays;

public class plus_one {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
            }
            digits[i] = 0;
        }
        int[] new_array = new int[digits.length+1];
        new_array[0] = 1;
        System.out.println(Arrays.toString(new_array));
    }
}
