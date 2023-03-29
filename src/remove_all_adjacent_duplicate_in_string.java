import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class remove_all_adjacent_duplicate_in_string {
    public static void main(String[] args) {
        String s = "azxxzy";
        removeDuplicates(s);
    }
    public static void removeDuplicates(String s) {
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack<Character>stack = new Stack<>();
        for (char value : c) {
            if (!stack.isEmpty() && value == stack.peek()) stack.pop();
            else stack.push(value);
        }
        for(char ch : stack){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
