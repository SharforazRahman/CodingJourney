import java.util.*;

public class count_the_number_of_consistent_string {
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a", "b", "c", "ab", "ac", "bc", "abc"};
        int count = 0;
        Set<Character> allowedSet = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            allowedSet.add(allowed.charAt(i));
        }
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (!allowedSet.contains(word.charAt(i))) {
                    break;
                } else {
                    if (i == word.length() - 1) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}