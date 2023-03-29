import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Principal = sc.nextInt();
        int time = sc.nextInt();
        int rate = sc.nextInt();

        int simple_Interest = Principal * rate * time;
        System.out.print("So the simple interest is: " +simple_Interest);
        sc.close();
    }
}
