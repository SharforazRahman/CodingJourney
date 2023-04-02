import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class word_pattern {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

       for(int i = 0; i < pattern.length(); i++){
           if(!charToWord.containsKey(pattern.charAt(i))) charToWord.put(pattern.charAt(i),words[i]);
           if(!wordToChar.containsKey(words[i])) wordToChar.put(words[i],pattern.charAt(i));

           if(!charToWord.get(pattern.charAt(i)).equals(words[i]) || !wordToChar.get(words[i]).equals(pattern.charAt(i))) return false;
       }

        return true;
    }
}
