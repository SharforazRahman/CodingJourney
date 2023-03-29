import java.util.Arrays;
import java.util.HashSet;

public class goat_latin {
    public static void main(String[] args) {
        String S = "Iam speak Goat Latin";
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        StringBuilder res = new StringBuilder();
        int i = 0, j = 0;
        for (String w : S.split("\\s")) {
            res.append(' ').append(vowels.contains(w.charAt(0)) ? w : w.substring(1) + w.charAt(0)).append("ma");
            for (j = 0, ++i; j < i; ++j) {
                res.append("a");
            }
        }
        System.out.println(res.substring(1));
    }
}
