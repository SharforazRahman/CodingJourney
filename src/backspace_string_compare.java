import java.util.Stack;

public class backspace_string_compare {
    public static void main(String[] args) {
        String s = "y#fo##f", t = "y#f#o##f";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        char[] c = s.toCharArray();
        for (char value : c) {
            if (!stack.isEmpty() && value == '#') {
                stack.pop();
            } else {
                stack.push(value);
            }
        }
        char[] ch = t.toCharArray();
        for (char value : ch) {
            if (!stack2.isEmpty() && value == '#') {
                stack2.pop();
            } else {
                stack2.push(value);
            }
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (Character res : stack) sb.append(res);
        for (Character ans : stack2) sb2.append(ans);

        String a = sb.toString();
        String b = sb2.toString();


        sb.setLength(0);
        sb2.setLength(0);

        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != '#') sb.append(a.charAt(i));
        for (int i = 0; i < b.length(); i++) if (b.charAt(i) != '#') sb2.append(b.charAt(i));


        return sb.toString().equals(sb2.toString());
    }
}
