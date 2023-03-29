import java.util.Scanner;

public class nim_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b = n % 4 != 0;
        System.out.println(b);
    }
}
