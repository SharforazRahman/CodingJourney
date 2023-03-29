import java.util.*;

public class string_matching_in_an_array {
    public static void main(String[] args) {
        String[] words = {"leetcoder","leetcode","od","hamlet","am"};
        System.out.println(stringMatching(words));
    }

    public static List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return 1;
                } else return -1;
            }
        };
        Arrays.sort(words, comparator);

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].contains(words[j])) list.add(words[j]);
            }
        }
        Set<String> set = new HashSet<>(list);
        list.clear();;
        list.addAll(set);
        return list;
    }
}
