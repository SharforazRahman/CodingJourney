import java.util.*;

public class greatest_english_letter_in_upper_and_lower_case {
    public static void main(String[] args) {
        String s = "nzmguNAEtJHkQaWDVSKxRCUivXpGLBcsjeobYPFwTZqrhlyOIfdM";
        System.out.println(greatestLetter(s));
    }

    public static String greatestLetter(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (char i : s.toCharArray()) set.add(i);
        for (char i = 'Z'; i >= 'A'; i--) {
            if (set.contains(i) && set.contains((char)('a'+(i-'A')))) return i+"";
        }
        return "";
    }
}
