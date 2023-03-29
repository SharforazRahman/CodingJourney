import java.util.Arrays;

public class sliding_window_maximum {
    public static void main(String[] args) {
        int[] arr = {1, -1};
        int k = 1;
        System.out.println(Arrays.toString(maxSlidingWindow(arr, k)));
    }

    public static int[] maxSlidingWindow(int[] a, int k) {
        int[] result_array = new int[a.length - k + 1];
        int i = 0;
        int j = 0;
        int index = 0;
        int max = Integer.MIN_VALUE;

        while (j < a.length) {
            max = Math.max(max, a[j]);
            if ((j - i + 1) < k) j++;
            else if ((j - i + 1) == k) {
                i++;
                j = i;
                result_array[index++] = max;
                max = Integer.MIN_VALUE;
            }
        }
        return result_array;
    }
}
