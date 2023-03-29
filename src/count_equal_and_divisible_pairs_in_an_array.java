public class count_equal_and_divisible_pairs_in_an_array {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 2, 2, 1, 3};
        int k = 2;
        int count = 0;
        int sum_of_index = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    sum_of_index = i * j;
                    if (sum_of_index % k == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
