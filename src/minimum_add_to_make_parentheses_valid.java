import java.util.Stack;

public class minimum_add_to_make_parentheses_valid {
    public static void main(String[] args) {
        String s = "(()))(";
        System.out.println(minAddToMakeValid(s));
    }

    public static int minAddToMakeValid(String s) {
        if (s.length() == 1) {
            return 1;
        }
        if (s.length() == 0) return 0;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == '(' && c == ')') stack.pop();
            else stack.push(c);
        }
        return stack.size();
    }
}
