import java.util.*;

public class next_greater_element {
    public static void main(String[] args) {
        int[] num1 = {4, 1, 2};
        int[] num2 = {1, 3, 4, 2};
        HashMap<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (Integer i : num2) {
            while (!stack.isEmpty() && stack.peek() < i) {
                hm.put(stack.pop(), i);
            }
            stack.push(i);
        }
        for (int i = 0; i < num1.length; i++) {
            num1[i] = hm.getOrDefault(num1[i], -1);
        }
        System.out.println(Arrays.toString(num1));
    }
}