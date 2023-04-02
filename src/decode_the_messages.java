import java.util.Arrays;
import java.util.HashMap;

public class decode_the_messages {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";
        System.out.println(decodeMessage(key,message));
    }

    public static String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        key = key.replaceAll(" ","");
        char c = 'a';
        for (int i = 0; i <  key.length(); i++) {
            if (!map.containsKey(key.charAt(i))){
                map.put(key.charAt(i),c++);
            }
        }
        for(char i : message.toCharArray()){
            if(map.containsKey(i)) sb.append(map.get(i));
            else sb.append(" ");
        }
        return sb.toString();
    }

}
