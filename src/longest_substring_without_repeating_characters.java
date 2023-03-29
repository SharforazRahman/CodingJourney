import java.util.HashSet;
import java.util.Set;

public class longest_substring_without_repeating_characters {
    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int first_pointer = 0;
        int second_pointer = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();
        while (second_pointer < s.length()) {
            if (!set.contains(s.charAt(second_pointer))) {
                set.add(s.charAt(second_pointer));
                second_pointer++;
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(first_pointer));
                first_pointer++;
            }
        }
        return max;
    }
}
