import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class find_words_that_can_be_formed_bt_characters {
    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.println(countCharacters(words, chars));
    }

    public static int countCharacters(String[] words, String chars) {
        ArrayList<String> list = new ArrayList<>();
        Set<Character> set = new HashSet<>();
        char[] a = chars.toCharArray();
        for (char c : a) set.add(c);
        ArrayList<Character> check = new ArrayList<>(set);
        boolean b = false;
        for (String word : words) {
            char[] w = word.toCharArray();
            for (char c : w) {
                if (check.contains(c)) {
                    b = true;
                }
            }
            if (b) list.add(word);
        }
        System.out.println(set);
        System.out.println(list);
        int result = 0;
        for (String s : list) {
            result = s.length() + result;
        }
        return result;
    }
}
