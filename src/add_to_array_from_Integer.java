import java.util.ArrayList;
import java.util.Arrays;

public class add_to_array_from_Integer {
    public static void main(String[] args) {
        int[] num = {1,2,3,0};
        int k = 34;
        String temp = Integer.toString(k);
        int[] array_k = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            array_k[i] = temp.charAt(i) - '0';
        }

        for(int i = num.length-1,j = array_k.length-1; i >= 0; i--,j--){
            if(num[i] < 9){
                num[i] = num[i]+array_k[j];
            }
            num[i] = 0;
        }
        int[] new_array = new int[num.length+1];
        new_array[0] = 1;
        System.out.println(Arrays.toString(new_array));
    }
}
