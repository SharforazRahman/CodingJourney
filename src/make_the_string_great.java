import java.util.Stack;

public class make_the_string_great {
    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }

    public static String makeGood(String s) {
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char value : c) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - value) == 32) stack.pop();
            else stack.push(value);
        }
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}

