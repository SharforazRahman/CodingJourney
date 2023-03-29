import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class count_pair_of_similar_strings {
    public static void main(String[] args) {
        String[] words = {"nba","cba","dba"};
        System.out.println(similarPairs(words));
    }

    public static int similarPairs(String[] words) {
        int count = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            char[] c = word.toCharArray();
            for (char ch : c) set.add(ch);
            set.forEach(sb::append);
            list.add(String.valueOf(sb));

            sb.setLength(0);
            set.clear();


            for (int first = 0; first < list.size(); first++) {
                for (int second = first + 1; second < list.size(); second++) {
                    if (Objects.equals(list.get(first), list.get(second))) count++;
                }
            }
            max = Math.max(max, count);
            count = 0;
        }
        return max;
    }
}
