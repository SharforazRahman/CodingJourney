import java.util.Scanner;

public class Subtract_Product_and_Sum_Digits_Of_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer:");
        int input = sc.nextInt();
        int product = 1;
        int sum = 0;
         while (input > 0){
             int reminder = input % 10;
             product = product*reminder;
             sum = sum+reminder;
             input = input / 10;
         }
        System.out.print("Result is: "+(product-sum));
    }
}
