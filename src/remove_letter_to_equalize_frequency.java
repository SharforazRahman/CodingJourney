import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class remove_letter_to_equalize_frequency {
    public static void main(String[] args) {
        String word = "aazz";
        System.out.println(equalFrequency(word));
    }

    public static boolean equalFrequency(String word) {
        char[] c = word.toCharArray();
        Set<Character> set = new HashSet<>();
        for(char ch : c) set.add(ch);
        return set.size() == c.length - 1;
    }
}
