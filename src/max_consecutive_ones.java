
public class max_consecutive_ones {
    public static void main(String[] args) {
        int[] num = {1, 0, 1, 1, 0, 1};
        System.out.println(maxOnesOptimal(num));
    }
    public static int maxOnesOptimal(int[] arr) {
        int count = 0, max = 0;
        for (int j : arr) {
            if (j == 1) count++;
            else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return max;
    }
}
