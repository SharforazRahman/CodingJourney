import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Name: ");
        String  str = sc.nextLine();

        System.out.println("Hello "+str);
    }
}
