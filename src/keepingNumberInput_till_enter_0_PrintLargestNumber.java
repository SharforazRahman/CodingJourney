import java.util.Scanner;

public class keepingNumberInput_till_enter_0_PrintLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max_storing = 0;
        while (true) {
            System.out.print("Enter a digit: ");
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            if (a > max_storing) {
                max_storing = a;
            }
        }
        System.out.print("So the max is: " + max_storing);
    }
}
