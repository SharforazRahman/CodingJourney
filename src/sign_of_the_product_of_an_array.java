public class sign_of_the_product_of_an_array {
    public static void main(String[] args) {
        int[] nums = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        int count = 0;
        int product = 1;
        int result = 0;
        for (int num : nums) {
            if (num < 0) {
                count++;
            }
            if (num == 0) {
                product = 0;
                break;
            }
        }
        if (product == 0) {
            System.out.println(0);
        } else {
            if ((count % 2 != 0)) {
                result = -1;
            }
            if ((count % 2 == 0)) {
                result = 1;
            }
            if (result == -1) {
                System.out.println(-1);
            } else {
                System.out.println(1);
            }
        }
    }
}