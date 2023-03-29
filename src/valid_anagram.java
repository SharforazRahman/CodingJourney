import java.util.Arrays;

public class valid_anagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";

        char[] ch_t = t.toCharArray();
        StringBuilder sb_t = new StringBuilder();
        Arrays.sort(ch_t);

        char[] ch_s = s.toCharArray();
        StringBuilder sb_s = new StringBuilder();
        Arrays.sort(ch_s);


        for (char c : ch_t) {
            sb_t.append(c);
        }
        for (char c : ch_s) {
            sb_s.append(c);
        }

        boolean b = sb_s.toString().equals(sb_t.toString());
        System.out.println(b);
    }
}
