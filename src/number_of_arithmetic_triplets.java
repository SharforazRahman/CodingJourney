public class number_of_arithmetic_triplets {
    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 6, 7, 10};
        int diff = 3;

        int i = 0;
        int j = i + 1;
        int k = j + 1;
        int final_count = 0;
        int count_I_and_J = 0;
        int count_J_and_K = 0;

        while (k != nums.length) {
            if ((nums[j] - nums[i]) != diff) {
                j++;
                k++;
            }
            if ((nums[k] - nums[j]) != diff) {
                k++;
            }
            if ((nums[j] - nums[i]) == diff) {
                i++;
                j++;
                k++;
                count_I_and_J++;
            }
            if ((nums[k] - nums[j]) == diff) {
                j++;
                k++;
                count_J_and_K++;
            }
            if (count_I_and_J == 1 && count_J_and_K == 1) {
                final_count++;
            }
            count_I_and_J = 0;
            count_J_and_K = 0;
            //i++;

        }
        System.out.println(final_count);
    }
}
