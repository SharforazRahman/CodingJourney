import java.util.ArrayList;
import java.util.Stack;

public class next_greater_element_to_left {
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        ne_gre_el_t_le(arr);
    }

    public static void ne_gre_el_t_le(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int j : a) {
            if (stack.size() == 0) list.add(1);
            else if (stack.peek() > j) list.add(stack.peek());
            else if (stack.size() > 0 && stack.peek() <= j) {
                while (stack.size() > 0 && stack.peek() <= j) stack.pop();
                if (stack.size() == 0) list.add(-1);
                else list.add(stack.peek());
            }
            stack.push(j);
        }
        System.out.println(list);
    }
}
