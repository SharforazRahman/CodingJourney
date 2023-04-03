import java.util.*;

public class find_words_that_can_be_formed_bt_characters {
    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.println(countCharacters(words, chars));
    }

    public static int countCharacters(String[] words, String chars) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char c: chars.toCharArray()) map.put(c, map.getOrDefault(c,0)+1);
        for(int i = 0; i < words.length; i++){
            for(char c: words[i].toCharArray()) map2.put(c, map2.getOrDefault(c,0)+1);
        }
        System.out.println(map);
        System.out.println(map2);
        System.out.println(list);
        return 0;
    }
}
