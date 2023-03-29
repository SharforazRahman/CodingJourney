public class fibonacci_number {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        return F(n - 1) + F(n - 2);
    }

    public static int F(int n) {
        int first = 0;
        int second = 1;
        int finalNum = 0;

        for (int i = 0; i < n - 1; i++) {
            finalNum = first + second;
            first = second;
            second = finalNum;
        }
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        return finalNum;
    }
}
