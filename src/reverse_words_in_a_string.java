import java.util.Arrays;
import java.util.Stack;

public class reverse_words_in_a_string {
    public static void main(String[] args) {
        String s = "  hello        world   ";

        Stack<String> stack = new Stack<String>();
        String[] string_Array = s.trim().split("\\s+");

        for (String str : string_Array) {
            stack.push(str);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }
       System.out.println(sb.toString().trim());
    }
}
