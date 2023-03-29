public class find_number_with_even_number_of_digits {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        int count = 0;
        for (int num : nums) {
            int len = (int) (Math.log10(num) + 1);
            if (len % 2 == 0) {
                count++;
            }
            len = 0;
        }
        System.out.println(count);
    }
}