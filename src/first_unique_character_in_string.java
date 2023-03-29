import java.util.*;

public class first_unique_character_in_string {
    public static void main(String[] args) {
        String s = "aabb";
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        for (Character num : ch) {
            if (hm.containsKey(num)) {
                int old_frequency = hm.get(num);
                int new_frequency = old_frequency + 1;
                hm.put(num, new_frequency);
            } else {
                hm.put(num, 1);
            }
        }

        for (Map.Entry entry : hm.entrySet()) {
            if (entry.getValue().equals(2)) {
                list.add((Character) entry.getKey());
            }
        }

        char element = ' ';
        for (char c : ch) {
            if (list.contains(c)) {
                element = c;
                break;
            }
        }

        int result = -1;
        for (int i = 0; i < ch.length; i++) {
            if (element == ch[i]) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
