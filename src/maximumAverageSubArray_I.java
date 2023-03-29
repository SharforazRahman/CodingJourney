public class maximumAverageSubArray_I {
    public static void main(String[] args) {
        int[] num = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(num, k));
    }

    public static double findMaxAverage(int[] a, int k) {
        int i = 0;
        int j = 0;
        double sum = 0;
        double max = Integer.MIN_VALUE;

        while (j < a.length) {
            sum = sum + a[j];
            if ((j - i + 1) < k) j++;
            else if ((j - i + 1) == k) {
                max = Math.max(max, sum);
                sum -= a[i];
                i++;
                j++;
            }
        }
        return max / k;
    }
}
