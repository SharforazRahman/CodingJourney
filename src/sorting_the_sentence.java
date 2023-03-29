import java.util.ArrayList;
import java.util.Arrays;


public class sorting_the_sentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] words = s.split("\\s");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
        list.sort((a, b) -> Integer.parseInt(a.replaceAll("[a-zA-z]", "")) - Integer.parseInt(b.replaceAll("[a-zA-z]", "")));
        String str = "";
        for (String value : list) {
            str = str +" "+ value;
        }
        str = str.replaceAll("\\d", "");
        System.out.println(str);
    }
}
