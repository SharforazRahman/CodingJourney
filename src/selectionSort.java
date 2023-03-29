import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] a = {35, 4, 68, 3, 57, 8, 98, 3, 1};
        selection(a);
        System.out.println(Arrays.toString(a));
    }

    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getMaximum(arr, 0, last);
            swap(arr, max, last);
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int getMaximum(int[] arr, int start, int end) {
        int max = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[max]) max = i;
        }
        return max;
    }
}
