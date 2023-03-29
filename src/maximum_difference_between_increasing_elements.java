public class maximum_difference_between_increasing_elements {
    public static void main(String[] args) {
        int[] num = {9, 4, 3, 2};
        System.out.println(maximumDifference(num));
    }

    public static int maximumDifference(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int res = arr[j] - arr[i];
                    if (res > max) max = res;
                }
            }
        }
        if (max == 0) return -1;
        else return max;
    }
}
