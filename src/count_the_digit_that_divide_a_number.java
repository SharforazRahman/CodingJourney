public class count_the_digit_that_divide_a_number {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(countDigits(n));
    }

    public static int countDigits(int num) {
        int count = 0;
        int storingNumber = num;
        while (num != 0) {
            int r = num % 10;
            if (r != 0 && storingNumber % r == 0) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}
