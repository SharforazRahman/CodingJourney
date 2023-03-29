import java.util.Scanner;

//To find Armstrong Number between two given number.
public class armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        System.out.print("Enter another Number: ");
        int second_Number = sc.nextInt();
        int storage = 0;
        int previousNumber = 0;
        int checkNumber = 0;
        for (int i = number; i < second_Number; i++) {
            previousNumber = i;
            checkNumber = i;
            while (previousNumber > 0) {
                int reminder = previousNumber % 10;
                int qube_Of_Number = (reminder * reminder * reminder);
                storage = storage + qube_Of_Number;
                previousNumber = previousNumber / 10;
            }
            if (storage == checkNumber) {
                System.out.println(storage);
            }
            storage = 0;
        }
    }
}
