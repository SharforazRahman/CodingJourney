import java.util.Stack;

public class removing_stars_from_string {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        Stack<Character>stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        for (Character item : stack) {
            ans.append(item);
        }
        System.out.println(ans);
    }
}
