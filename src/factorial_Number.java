import java.util.Scanner;

public class factorial_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        int input = sc.nextInt();
        int store = 1;
        System.out.print("Factorial of this number is: ");
        for(int i = input; i >= 1; i--){
            store = store*i;
        }
        System.out.println(store);
    }
}
