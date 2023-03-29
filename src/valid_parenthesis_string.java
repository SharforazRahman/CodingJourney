import java.util.Stack;

public class valid_parenthesis_string {
    public static void main(String[] args) {
        String s = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        System.out.println(checkValidString(s));
    }

    public static boolean checkValidString(String s) {
        Stack<Character> stack = new Stack<>();
        int star_Count = 0, bracketCount = 0;

        for (char i : s.toCharArray()) {
            if (i == '(') bracketCount++;
            if (i == ')') bracketCount--;
        }
        if (bracketCount == 0) return true;

        for (char i : s.toCharArray()) {
            if (!stack.isEmpty() && i == ')' && stack.peek() == '(') stack.pop();
            else if (i == '*') star_Count++;
            else stack.push(i);
        }
        System.out.println(star_Count);
        System.out.println(stack);
        return stack.size() <= star_Count;
    }
}
