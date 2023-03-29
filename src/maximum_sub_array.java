public class maximum_sub_array {
    public static void main(String[] args) {
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(num));
    }

    public static int maxSubArray(int[] a) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int j : a) {
            currentSum = currentSum + j;
            if (currentSum > maxSum){
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
