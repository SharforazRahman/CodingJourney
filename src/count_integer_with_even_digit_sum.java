public class count_integer_with_even_digit_sum {
    public static void main(String[] args) {
        int num = 30;
        System.out.println(countEven(num));
    }

    public static int countEven(int a) {
        int count = 0;
        int sum = 0;
        int r = 0;
        int c_num = 0;
        for (int i = 1; i < a; i++) {
            c_num = i;
            while (c_num != 0) {
                r = c_num % 10;
                sum = sum + r;
                c_num = c_num / 10;
            }
            if(sum % 2 == 0) count++;
            sum = 0;
        }
        return count;
    }
}
