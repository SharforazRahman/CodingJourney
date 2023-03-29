import java.util.Arrays;

public class check_if_all_A_appear_before_all_B {
    public static void main(String[] args) {
        String s = "aabaaabbb";
        System.out.println(checkString(s));
    }

    public static boolean checkString(String s) {
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Arrays.sort(c);
        for(char i : c) sb.append(i);
        return s.equals(sb.toString());
    }
}
