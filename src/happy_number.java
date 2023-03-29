import java.util.Scanner;

public class happy_number {
    public static void main(String[] args) {
        int n = 19;
        int reminder = 0;
        int multiplication = 0;
        while (n != 1) {
            if (n > 9) {
                reminder = n % 10;
                multiplication = multiplication + (reminder * reminder);
                n = n / 10;
            }
            n = multiplication;
            System.out.println(n);
        }
        System.out.println(n);
    }
}
