import java.util.Scanner;

public class keepingNumberInput_till_enter_0_PrintSumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int storing = 0;
        while (true) {
            System.out.print("Enter a digit: ");
            int a = sc.nextInt();
            if(a == 0){
                break;
            }
            storing = storing + a;
        }
        System.out.print("So the Sum is: "+storing);
    }
}
