import java.util.Arrays;
import java.util.Objects;

public class count_asterisks {
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
        String[] res = s.split("\\|");
        int count = 0;
        System.out.println(Arrays.toString(res));
        for(int i = 0; i < res.length; i+=2){
            char[] c = res[i].toCharArray();
            for(char character : c){
                if(character == '*'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
