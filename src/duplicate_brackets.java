import java.util.Stack;

public class duplicate_brackets {
    public static void main(String[] args) {
        String str = "(a+b)+((c+d))";
        Stack<Character> stack = new Stack<>();
        boolean b = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                if (stack.peek() == '(') {
                    b = true;
                }
                else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(str.charAt(i));
            }
        }
        System.out.println(b);
    }
}
