import java.util.Arrays;

public class find_first_and_last_position_of_element_in_sorted_array {
    public static void main(String[] args) {
        int[] num = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(num, target)));
    }

    public static int[] searchRange(int[] a, int t) {
        int[] new_array = {-1, -1};
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int m = start + (end - start) / 2;
            if (a[m] == t) {
                new_array[0] = m;
                end = m - 1;
            }
            if (a[m] < t) start = m + 1;
            else end = m - 1;
        }

        start = 0;
        end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == t) {
                new_array[1] = mid;
                start = mid + 1;
            }
            if (a[mid] < t) start = mid + 1;
            else end = mid - 1;
        }
        return new_array;
    }
}
