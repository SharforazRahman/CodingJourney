import java.util.HashSet;
import java.util.Set;

public class check_if_the_sentence_is_pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        char[] ch = sentence.toCharArray();
        Set<Character> s = new HashSet<>();
        for(char c:ch){
            s.add(c);
        }
        if(s.size() < 26){
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }
    }
}
