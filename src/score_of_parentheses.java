import java.util.Stack;

public class score_of_parentheses {
    public static void main(String[] args) {
        String s = "(())";
        System.out.println(scoreOfParentheses(s));
    }
    public static int scoreOfParentheses(String s) {
//        Stack<Character> stack = new Stack<>();
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == ')') {
//                if (stack.peek() == '(') {
//                    stack.pop();
//                    count++;
//                }
//            } else {
//                stack.push(s.charAt(i));
//            }
//        }
//        System.out.println(stack);
//        return count;
        int count = 0;
        int leftBracket = 0;
        int rightBracket = 0;

        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == '(' && s.charAt(i+1) == ')') count++;
        }
        return s.length() - count;
    }
}
