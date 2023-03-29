import java.util.Scanner;
//Input a year and find whether it is a leap year or not.
public class leapYearONot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();

        if(year%4==0){
            System.out.println("The year is Leap year");
        }
        else {
            System.out.println("The year is not Leap year");
        }
    }
}
