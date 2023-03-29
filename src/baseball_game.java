import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class baseball_game {
    public static void main(String[] args) {
        String[] operations = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(calPoints(operations));
    }

    public static int calPoints(String[] c) {
        Stack<String> stack = new Stack<>();
        int result = 0;
        for (String s : c) {
            if (!stack.isEmpty() && Objects.equals(s, "C")) {
                stack.pop();
            }
            if (!stack.isEmpty() && Objects.equals(s, "D")) {
                int peek = Integer.parseInt(String.valueOf(Integer.parseInt(stack.peek())));
                peek = peek * 2;
                stack.push(String.valueOf(peek));
            }
            if (!stack.isEmpty() && Objects.equals(s, "+")) {
                String store1st = stack.pop();
                int final_store = Integer.parseInt(store1st) + Integer.parseInt(stack.peek());
                stack.push(store1st);
                stack.push(String.valueOf(final_store));
            }
            if (Objects.equals(s, "C") || Objects.equals(s, "D") || Objects.equals(s, "+")) continue;
            stack.push(s);
        }
        for(String s : stack){
            result = result + Integer.parseInt(s);
        }
        return result;
    }
}