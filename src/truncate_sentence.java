import java.util.ArrayList;
import java.util.Arrays;

public class truncate_sentence {
    public static void main(String[] args) {
        String s = "What is the solution to this problem";
        String[] string_array = s.split(" ");
        System.out.println(Arrays.toString(string_array));
        int k = 4;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k; i++){
            sb.append(string_array[i]).append(" ");
        }
        String result = sb.toString();
        result = result.trim();
        System.out.println(result);
    }
}
