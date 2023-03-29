import java.util.*;

public class first_letter_to_appear_twice {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }

    public static char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                return c;
            } else {
                set.add(c);
            }
        }
        return ' ';
    }


    public static char repeated_Character(String s) {
        Stack<Character> stack = new Stack<>();
        char ch = ' ';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                ch = stack.peek();
                count++;
                break;
            } else {
                if (!stack.isEmpty() && stack.peek() != s.charAt(i)) {
                    stack.pop();
                    stack.push(s.charAt(i));
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        return ch;
    }
}
