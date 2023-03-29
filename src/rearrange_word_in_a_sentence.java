import java.util.Arrays;
import java.util.Comparator;

public class rearrange_word_in_a_sentence {
    public static void main(String[] args) {
        String text = "Keep calm and code on";
        String []s = text.toLowerCase().split(" ");
        Arrays.sort(s, (a,b) ->  a.length() - b.length());
        String ans = String.join(" ", s);
        System.out.println(Character.toUpperCase(ans.charAt(0)) + ans.substring(1));
    }
}
