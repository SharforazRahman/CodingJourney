import java.util.ArrayList;
import java.util.Stack;

public class replace_element_with_greatest_element_on_right_side {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        replaceElements(arr);
    }

    public static void replaceElements(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) list.add(-1);
            else if (arr[i] > stack.peek()) {
                list.add(stack.peek());
                stack.pop();
            } else if (!stack.isEmpty() && arr[i] < stack.peek()) {
                while (arr[i] > stack.peek()) stack.pop();
                list.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        System.out.println(list);
    }
}

