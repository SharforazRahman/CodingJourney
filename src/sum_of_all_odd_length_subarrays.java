public class sum_of_all_odd_length_subarrays {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};

        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println(sum);
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    sum = sum + arr[i] + arr[j] + arr[k];
                }
            }
        }
        System.out.println(sum);
    }
}
