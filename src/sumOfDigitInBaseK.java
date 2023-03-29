public class sumOfDigitInBaseK {
    public static void main(String[] args) {
        int n = 34;
        int k = 6;

        System.out.println(sumBase(n, k));
    }

    public static int sumBase(int n, int k) {
        int reminder = 0;
        while (n != 0) {
            reminder = reminder +n % k;
            n = n / k;
        }
        return reminder;
    }
}