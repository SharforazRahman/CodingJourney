import java.util.*;

public class find_and_replace_pattern {
    public static void main(String[] args) {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";

        System.out.println(findAndReplacePattern(words,pattern));
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String>list = new ArrayList<>();
        Set<Character> p_Set = new HashSet<>();
        Set<Character> w_Set = new HashSet<>();

        char[] arrayForPattern = pattern.toCharArray();
        for(char i : arrayForPattern)  p_Set.add(i);

        for(String i : words){
            char[] ch = i.toCharArray();
            for(char j : ch) w_Set.add(j);
            if(p_Set.size() == w_Set.size()) {
                list.add(i);
            }
            w_Set.clear();
        }
        return list;
    }
}
