import java.util.Scanner;

public class multiplicationTable_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int input = sc.nextInt();
        System.out.println("Multiplication Table is: ");
        for(int i = 1; i <= 10; i ++){
            System.out.println(input+"*"+i+" = "+(input*i));
        }
    }
}
