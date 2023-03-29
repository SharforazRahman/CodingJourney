import java.util.*;

public class count_common_word_with_one_occurrence {
    public static void main(String[] args) {
        String[] words1 = {"leetcode","is","amazing","as","is"};
        String[] words2 = {"amazing","leetcode","is"};
        countWords(words1,words2);
    }
    public static void countWords(String[] words1, String[] words2) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        for (String i : words1) map.put(i, map.getOrDefault(i, 0) + 1);
        for (String i : words2) map2.put(i, map2.getOrDefault(i, 0) + 1);

        for(String i : map.keySet()) if(map.get(i) == 1) list.add(i);
        for(String i : map2.keySet()) if(map2.get(i) == 1) list.add(i);


        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                if(Objects.equals(list.get(i), list.get(j))) count++;
            }
        }
        System.out.println(count);
    }
}
