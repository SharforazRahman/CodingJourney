import java.util.Arrays;

public class largest_perimeter_triangle {
    public static void main(String[] args) {
        int[] num = {3, 6, 2, 3};
        System.out.println(largestPerimeter(num));
    }

    public static int largestPerimeter(int[] a) {
        Arrays.sort(a);
        for (int i = a.length - 1; i >= 2; i--) {
            int j = i - 1;
            int k = i - 2;
            if (a[i] < a[j] + a[k])
                return a[i] + a[j] + a[k];
        }
        return 0;
    }
}
