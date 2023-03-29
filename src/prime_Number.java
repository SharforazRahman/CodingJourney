import java.util.Arrays;

public class prime_Number {
    public static void main(String[] args) {
        int input = 10;
        System.out.println(countPrimes(input));
    }

    public static int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i]) {
                for (int j = i; j * i < prime.length; j++) {
                    prime[i * j] = false;
                }
            }
        }
        int prime_count = 0;
        for (int i = 2; i < prime.length; i++) {
            if (prime[i]) {
                prime_count++;
            }
        }
        return prime_count;
    }
}

