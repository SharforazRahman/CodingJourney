import java.util.Arrays;

public class maximum_product_of_three_different_numbers {
    public static void main(String[] args) {
        int[] num = {-1, -2, -3};
        System.out.println(maximumProduct(num));
    }

    public static int maximumProduct(int[] a) {
        Arrays.sort(a);
        return Math.max((a[a.length - 1] * a[a.length - 2] * a[a.length - 3]), (((a[0]) * (a[1]) * (a[a.length - 1]))));
    }
}
