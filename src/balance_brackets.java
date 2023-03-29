import java.util.Stack;

public class balance_brackets {
    public static void main(String[] args) {
        String s = "()[]{}";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                }
            } else if (s.charAt(i) == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                }
            } else if (s.charAt(i) == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        System.out.println(stack.isEmpty());
    }
}
