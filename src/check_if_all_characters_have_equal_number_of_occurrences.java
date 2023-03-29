import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class check_if_all_characters_have_equal_number_of_occurrences {
    public static void main(String[] args) {
        String s = "abacbc";
        System.out.println(areOccurrencesEqual(s));
    }
    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(char i : s.toCharArray()) map.put(i,map.getOrDefault(i,0)+1);
        for(char i : map.keySet()) set.add(map.get(i));

        return set.size() == 1;
    }
}
