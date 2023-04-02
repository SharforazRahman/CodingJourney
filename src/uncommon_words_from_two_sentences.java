import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class uncommon_words_from_two_sentences {
    public static void main(String[] args) {
        String s1 = "apple apple";
        String s2 = "banana";
        System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : s1.split(" ")) map.put(i, map.getOrDefault(i, 0) + 1);
        for (String i : s2.split(" ")) map.put(i, map.getOrDefault(i, 0) - 1);

        for(String i : map.keySet()){
            if(map.get(i) == 1 || map.get(i) == -1) list.add(i);
        }
        return list.toArray(new String[0]);
    }
}
