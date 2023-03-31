import java.util.*;

public class first_letter_to_appear_twice {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacterMap(s));
    }

    public static char repeatedCharacterMap(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char i : s.toCharArray()){
            if(map.containsKey(i)) return i;
            else map.put(i, -1);
        }
        return ' ';
    }
    public static char repeatedCharacterSet(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                return c;
            } else {
                set.add(c);
            }
        }
        return ' ';
    }
}
