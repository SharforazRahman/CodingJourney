import java.util.ArrayList;
import java.util.Arrays;

public class reverse_String {
    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        ArrayList<Character> list = new ArrayList<>();
        for(int i = s.length-1; i >= 0; i--){
            list.add(s[i]);
        }
        Arrays.fill(s,' ');
        for(int i = 0; i < list.size(); i++){
            s[i] = list.get(i);
        }
        System.out.println(Arrays.toString(s));
    }
}
