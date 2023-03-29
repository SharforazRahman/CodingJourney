import java.util.ArrayList;

public class is_subsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgcd";
        boolean b = false;
        if (s.length() == 0) {
            System.out.println(b);
        }
        int s_pointer = 0;
        int t_pointer = 0;

        while (t_pointer < t.length()) {
            if (t.charAt(t_pointer) == s.charAt(s_pointer)) {
                s_pointer++;
                if (s_pointer == s.length()) {
                    b = true;
                }
            }
            t_pointer++;
        }
        System.out.println(b);
    }
}
