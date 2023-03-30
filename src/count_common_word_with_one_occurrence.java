import java.util.HashMap;

public class count_common_word_with_one_occurrence {
    public static void main(String[] args) {
        String[] words1 = {"b","bb","bbb"};
        String[] words2 = {"a","aa","aaa"};
        System.out.println(countWords(words1, words2));
    }

    public static int countWords(String[] words1, String[] words2) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (String i : words1) map.put(i, map.getOrDefault(i, 0) + 1);
        for (String i : words2) map2.put(i, map2.getOrDefault(i, 0) + 1);

        for (String s : words1) {
            if ((map.containsKey(s) && map.get(s) == 1) && (map2.containsKey(s) && map2.get(s) == 1)) {
                count++;
            }
        }
        return count;
    }
}
