import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class most_common_word {
    public static void main(String[] args) {
        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] ban = {"a"};
        System.out.println(mostCommonWord(paragraph, ban));
    }

    public static String mostCommonWord(String paragraph, String[] ban) {
        HashMap<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>(Arrays.asList(ban));

        for (String i : paragraph.replaceAll("\\W+", " ").toLowerCase().split("\\s+")) {
            if (!set.contains(i)) map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        String res = "";
        for (String i : map.keySet()) {
            if (map.get(i) > max) {
                max = map.get(i);
                res = i;
            }
        }
        return res;
    }
}
