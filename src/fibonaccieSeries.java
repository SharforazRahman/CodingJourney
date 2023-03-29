import java.util.Scanner;

public class fibonaccieSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth term of fibonacci sequence: ");
        int a = sc.nextInt();
        int first = 0;
        int second = 1;
        int finalNum = 0;

        System.out.print("Fibonacci Numbers are: ");
        System.out.print(first + " " + second + " ");
        for (int i = 0; i < a - 1; i++) {
            finalNum = first + second;
            System.out.print(finalNum+" ");
            first = second;
            second = finalNum;
        }
    }
}
