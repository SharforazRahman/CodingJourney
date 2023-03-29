import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class rearrange_character_to_make_target_string {
    public static void main(String[] args) {
        String s = "ilovecodingonleetcode";
        String target = "code";

        int min = Integer.MAX_VALUE;
        char[] c = s.toCharArray();
        char[] t = target.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char i : c) map.put(i, map.getOrDefault(i, 0) + 1);
        for (char i : t) if (map.containsKey(i)) min = Math.min(min,map.get(i));
        System.out.println(min);
    }
}
