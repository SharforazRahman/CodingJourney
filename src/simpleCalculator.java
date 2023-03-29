import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a operator: ");
        char character;
        character = sc.next().charAt(0);
        System.out.print("Enter a Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a Number: ");
        int num2 = sc.nextInt();

        if (character == '+') {
            System.out.println(num1+num2);
        }
        if (character == '-') {
            System.out.println(num1-num2);
        }
        if (character == '*') {
            System.out.println(num1*num2);
        }
        if (character == '/') {
            System.out.println(num1/num2);
        }
    }
}
