import java.util.Arrays;

public class largest_number {
    public static void main(String[] args) {
        int[] num = {3, 30, 34, 5, 9};
        String[] arr = new String[num.length];

        for (int i = 0; i < num.length; i++) {
            arr[i] = num[i] + "";
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}
