import java.util.HashMap;
import java.util.Map;

public class ransom_Note {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        boolean b = true;
        if (magazine.length() <= ransomNote.length()) {
            b = false;
        }
        String res = ransomNote + magazine;
        char[] ch = res.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        int sum = 0;
        for (char num : ch) {
            if (hm.containsKey(num)) {
                int old_frequency = hm.get(num);
                int new_frequency = old_frequency + 1;
                hm.put(num, new_frequency);
            } else {
                hm.put(num, 1);
            }
        }
        for (Map.Entry entry : hm.entrySet()) {
            int store = (int) entry.getValue();
            if (store == 1) {
                int key = (int) entry.getKey();
                sum = sum + key;
            }
        }

    }
}
