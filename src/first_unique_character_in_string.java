import java.util.*;

public class first_unique_character_in_string {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqueChar(s));
    }
    public static int firstUniqueChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
