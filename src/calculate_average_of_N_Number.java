import java.util.Scanner;

public class calculate_average_of_N_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int input = sc.nextInt();
        int average = 0;
        int sum = 0;
        for(int i = 1; i <= input; i++){
            System.out.print("Enter the random value: ");
            int random_value = sc.nextInt();
            sum = (random_value+sum);
        }
        System.out.println("Summation is: "+sum);
        System.out.print("Average is: "+sum/input);
    }
}
