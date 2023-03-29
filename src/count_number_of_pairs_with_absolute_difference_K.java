public class count_number_of_pairs_with_absolute_difference_K {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;
        int count = 0;
        for (int j : nums) {
            for (int num : nums) {
                if (((Math.abs(j)) - (Math.abs(num))) == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
