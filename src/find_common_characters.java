import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class find_common_characters {
    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        //System.out.println(commonChars(words));
        commonChars(words);
    }

    public static void commonChars(String[] words) {
        Set<Character> set = new HashSet<>();
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            char[] c = word.toCharArray();
            for (char j : c) set.add(j);
            set.forEach(sb::append);
            set.clear();
        }
        char[] str = sb.toString().toCharArray();
        for (char i : str) map.put(i, map.getOrDefault(i, 0) + 1);
        System.out.println(map);
    }
}
