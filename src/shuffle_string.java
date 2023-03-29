import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class shuffle_string {
    public static void main(String[] args) {
        String s = "vttqexwqgdc";
        char[] ch = s.toCharArray();
        int[] indices = {9, 5, 8, 0, 4, 3, 6, 10, 1, 2, 7};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0, j = 0; i < ch.length; i++, j++) {
            list.add((indices[j] + "" + ch[i]));
        }
        list.sort(Comparator.comparingInt(
                c -> Integer.parseInt(c.substring(0, c.length() - 1))
        ));
        String str = "";
        for (String value : list) {
            str = str + value;
        }
        str = str.replaceAll("\\d", "");
        System.out.println(str);
    }
}
