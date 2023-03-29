import java.util.ArrayList;
import java.util.Map;

public class maximum_count_of_positive_integer_and_negative_integer {
    public static void main(String[] args) {
        int[] num = {-3, -2, -1, 0, 0, 1, 2};
        System.out.println(maximumCount(num));
    }

    public static int maximumCount(int[] arr) {
        ArrayList<Integer> l = new ArrayList<>();
        int j = 0;
        for (int k : arr) {
            if (k != j) l.add(k);
        }

        int[] a = l.stream().mapToInt(i -> i).toArray();
        int start = 0;
        int end = l.size() - 1;
        int mid;
        int result = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (a[0] > 0) return a.length;
            if (a[mid] > 0 && a[mid - 1] < 0) {
                result = mid;
                break;
            } else if (a[mid] < 0) start = mid + 1;
            else end = mid - 1;
        }
        return Math.max((a.length - result), result);
    }
}
