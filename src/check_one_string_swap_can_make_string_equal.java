import java.util.HashMap;
import java.util.Objects;

public class check_one_string_swap_can_make_string_equal {
    public static void main(String[] args) {
        String s1 = "attack", s2 = "defend";
        System.out.println(areAlmostEqual(s1, s2));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int count = 0;
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            char ch = s2.charAt(i);

            if (!map.containsKey(c)) map.put(c, i);
            if (!map2.containsKey(ch)) map2.put(ch, i);

            if (map.containsKey(ch) && !(Objects.equals(map.get(c), map2.get(ch)))) count++;
        }
        System.out.println(count);
        System.out.println(map);
        System.out.println(map2);

        return count <= 2;
    }
}
