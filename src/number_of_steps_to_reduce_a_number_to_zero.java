import java.util.Scanner;

public class number_of_steps_to_reduce_a_number_to_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        if (num == 0) {
            System.out.println(0);
        } else {
            while (num > 0) {
                if (num % 2 != 0) {
                    num = num - 1;
                    count++;
                }
                num = num / 2;
                count++;
            }
            System.out.println(count - 1);
        }
    }
}