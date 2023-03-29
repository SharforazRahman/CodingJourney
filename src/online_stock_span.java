import java.util.Stack;

public class online_stock_span {
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85, 60, 72, 99, 88, 55};
        next(arr);
    }

    public static void next(int[] a) {
        Stack<Integer> stack = new Stack<>();
        int t, temp;
        for (t = 0; t < a.length / 2; t++) {
            temp = a[t];
            a[t] = a[a.length - t - 1];
            a[a.length - t - 1] = temp;
        }
        int i = 0;
        int j;
        int count = 0;

        while (i != a.length - 1) {
            j = i + 1;
            while (a[i] > a[j]) {
                if (a[i] < a[j]) break;
                count++;
                j++;
            }
            stack.push(count);
            count = 0;
            if (a[i] < a[j]) {
                i++;
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+1+" ");
        }
    }
}
