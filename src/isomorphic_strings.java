import java.util.HashMap;
import java.util.Map;

public class isomorphic_strings {
    public static void main(String[] args) {
        String s = "bbbaaaba", t = "aaabbbba";
        System.out.println(isIsomorphic(s, t));
    }
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char ch = t.charAt(i);

            if(!map1.containsKey(c)){
                map1.put(c,ch);
            }
            if(!map2.containsKey(ch)){
                map2.put(ch,c);
            }
            if(!(map1.get(c) == ch) || !(map2.get(ch) == c)){
                return false;
            }
        }
        return true;
    }
}